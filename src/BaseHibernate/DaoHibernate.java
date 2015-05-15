/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseHibernate;

/**
 *
 * @author user
 */
import Entidades.Usuario;
import java.util.List;
import org.hibernate.Session;

public class DaoHibernate extends AbstractDao {

    public DaoHibernate() {
        super();
    }

    /**
     * Insert a new Object into the database.
     *
     * @param usuario
     */
    @Override
    public void save(Object objetoGuardar) throws DataAccessLayerException {
        super.save(objetoGuardar);
    }

    @Override
    public Object runSP(String nameSP, Class clase, List<Parametro> parametros) {
        return super.runSP(nameSP, clase, parametros);
    }

    /**
     * Updates a new Object into the database.
     *
     * @param usuario
     */
    @Override
    public void update(Object objetoActualizar) throws DataAccessLayerException {
        super.update(objetoActualizar);
    }

    /**
     * Delete a detached Object from the database.
     *
     * @param usuario
     */
    @Override
    public void delete(Object objetoBorrar) throws DataAccessLayerException {
        super.delete(objetoBorrar);
    }

    /**
     * Find an Object by its primary key.
     *
     * @param id
     * @return
     */
    public Usuario find(Long id) throws DataAccessLayerException {
        return (Usuario) super.find(Usuario.class, id);
    }

    /**
     * Lista todos los objetos del tipo de clase pasado por parametro de la base
     * de datos
     *
     * @return
     */
    @Override
    public List findAll(Class clase) throws DataAccessLayerException {
        return super.findAll(clase);
    }

    @Override
    public Session getSession() {
        return this.session;
    }
}
