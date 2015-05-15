/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seguritasa;

import BaseHibernate.DaoHibernate;
import Entidades.Usuario;
import GUI.CrearCliente;
import GUI.CrearUsuario;
import GUI.Login;
import GUI.Principal;

/**
 *
 * @author user
 */
public class SeguritaSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DaoHibernate conexionDAO = new DaoHibernate();
        /*Usuario nuevoUsuario = new Usuario();
         nuevoUsuario.setNickname("Estuardo");
         nuevoUsuario.setContrasena("datos123");
         conexionDAO.save(nuevoUsuario);*/

        Login ventana = new Login(null, true);
        ventana.setVisible(true);
    }
}
