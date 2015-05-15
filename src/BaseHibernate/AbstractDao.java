/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseHibernate;

/**
 *
 * @author user
 */
import java.util.List;
import org.apache.derby.impl.store.raw.data.StoredPage;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public abstract class AbstractDao {

    protected Session session;
    protected Transaction tx;

    public AbstractDao() {
        HibernateFactory.buildIfNeeded();
    }

    protected void save(Object obj) {
        try {
            startOperation();
            session.persist(obj);
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
    }

    protected Object runSP(String nameSP, Class clase, List<Parametro> parametros) {
        Object resultado = null;
        try {
            startOperation();
            Query consulta = session.createSQLQuery("select * from " + nameSP + ";");
            for (Parametro parametro : parametros) {
                consulta.setParameter(parametro.getNombre(), parametro.getValor());
            }
            resultado = consulta.list();
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
        return resultado;
    }

    protected void update(Object obj) {
        try {
            startOperation();
            session.update(obj);
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
    }

    protected void delete(Object obj) {
        try {
            startOperation();
            session.delete(obj);
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
    }

    protected Object find(Class clazz, Long id) {
        Object obj = null;
        try {
            startOperation();
            obj = session.load(clazz, id);
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
        return obj;
    }

    /*  protected Object findByNickname(Class clase, String nickname){
     Object obj = null;
     try {
     startOperation();
     Query consulta = session.createSQLQuery("select * from " + nameSP + ";");
     for (Parametro parametro : parametros) {
     consulta.setParameter(parametro.getNombre(), parametro.getValor());
     }
     consulta.list();
            
     tx.commit();
     } catch (HibernateException e) {
     handleException(e);
     } finally {
     HibernateFactory.close(session);
     }
     return obj;
     }*/
    protected List findAll(Class clazz) {
        List objects = null;
        try {
            startOperation();
            Query query = session.createQuery("from " + clazz.getName());
            objects = query.list();
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
        return objects;
    }

    protected Session getSession() {
        return this.session;
    }

    protected void handleException(HibernateException e) throws DataAccessLayerException {
        HibernateFactory.rollback(tx);
        throw new DataAccessLayerException(e);
    }

    protected void startOperation() throws HibernateException {
        session = HibernateFactory.openSession();
        tx = session.beginTransaction();
    }
}
