package Entidades;
// Generated Apr 25, 2015 12:53:34 AM by Hibernate Tools 3.2.1.GA

import java.util.HashSet;
import java.util.Set;

/**
 * Pais generated by hbm2java
 */
public class Pais implements java.io.Serializable {

    private int codigo;
    private String nombre;
    private Set clientes = new HashSet(0);

    public Pais() {
    }

    public Pais(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Pais(int codigo, String nombre, Set clientes) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.clientes = clientes;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set getClientes() {
        return this.clientes;
    }

    public void setClientes(Set clientes) {
        this.clientes = clientes;
    }
}
