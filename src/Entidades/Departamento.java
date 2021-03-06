package Entidades;
// Generated Apr 25, 2015 12:53:34 AM by Hibernate Tools 3.2.1.GA

import java.util.HashSet;
import java.util.Set;

/**
 * Departamento generated by hbm2java
 */
public class Departamento implements java.io.Serializable {

    private int codigo;
    private String nombre;
    private Set empleados = new HashSet(0);

    public Departamento() {
    }

    public Departamento(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Departamento(int codigo, String nombre, Set empleados) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.empleados = empleados;
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

    public Set getEmpleados() {
        return this.empleados;
    }

    public void setEmpleados(Set empleados) {
        this.empleados = empleados;
    }
}
