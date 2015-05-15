package Entidades;
// Generated Apr 25, 2015 12:53:34 AM by Hibernate Tools 3.2.1.GA

import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente implements java.io.Serializable {

    private int codigo;
    private Pais pais;
    private String nombre;
    private String direccion;
    private Set polizas = new HashSet(0);

    public Cliente() {
    }

    public Cliente(int codigo, Pais pais, String nombre, String direccion) {
        this.codigo = codigo;
        this.pais = pais;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Cliente(int codigo, Pais pais, String nombre, String direccion, Set polizas) {
        this.codigo = codigo;
        this.pais = pais;
        this.nombre = nombre;
        this.direccion = direccion;
        this.polizas = polizas;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Pais getPais() {
        return this.pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Set getPolizas() {
        return this.polizas;
    }

    public void setPolizas(Set polizas) {
        this.polizas = polizas;
    }
}