/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseHibernate;

/**
 *
 * @author user
 */
public class Parametro {

    private String nombre;
    private Object valor;

    public Parametro(String nombre, Object valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public Object getValor() {
        return valor;
    }
}
