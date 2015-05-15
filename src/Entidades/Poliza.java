package Entidades;
// Generated Apr 25, 2015 12:53:34 AM by Hibernate Tools 3.2.1.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Poliza generated by hbm2java
 */
public class Poliza implements java.io.Serializable {

    private int correlativo;
    private TipoPoliza tipoPoliza;
    private Moneda moneda;
    private Cliente cliente;
    private Estado estado;
    private Empleado empleado;
    private Operador operador;
    private Date fechainicial;
    private Date fechafinal;
    private int numeropagos;
    private String polizaanterior;
    private double interes;
    private double deducible;
    private double valor;
    private String venta;
    private Set pagoses = new HashSet(0);
    private Set documentoses = new HashSet(0);
    private Set biens = new HashSet(0);

    public Poliza() {
    }

    public Poliza(int correlativo, TipoPoliza tipoPoliza, Moneda moneda, Cliente cliente, Estado estado, Empleado empleado, Operador operador, Date fechainicial, Date fechafinal, int numeropagos, double interes, double deducible, double valor, String venta) {
        this.correlativo = correlativo;
        this.tipoPoliza = tipoPoliza;
        this.moneda = moneda;
        this.cliente = cliente;
        this.estado = estado;
        this.empleado = empleado;
        this.operador = operador;
        this.fechainicial = fechainicial;
        this.fechafinal = fechafinal;
        this.numeropagos = numeropagos;
        this.interes = interes;
        this.deducible = deducible;
        this.valor = valor;
        this.venta = venta;
    }

    public Poliza(int correlativo, TipoPoliza tipoPoliza, Moneda moneda, Cliente cliente, Estado estado, Empleado empleado, Operador operador, Date fechainicial, Date fechafinal, int numeropagos, String polizaanterior, double interes, double deducible, double valor, String venta, Set pagoses, Set documentoses, Set biens) {
        this.correlativo = correlativo;
        this.tipoPoliza = tipoPoliza;
        this.moneda = moneda;
        this.cliente = cliente;
        this.estado = estado;
        this.empleado = empleado;
        this.operador = operador;
        this.fechainicial = fechainicial;
        this.fechafinal = fechafinal;
        this.numeropagos = numeropagos;
        this.polizaanterior = polizaanterior;
        this.interes = interes;
        this.deducible = deducible;
        this.valor = valor;
        this.venta = venta;
        this.pagoses = pagoses;
        this.documentoses = documentoses;
        this.biens = biens;
    }

    public int getCorrelativo() {
        return this.correlativo;
    }

    public void setCorrelativo(int correlativo) {
        this.correlativo = correlativo;
    }

    public TipoPoliza getTipoPoliza() {
        return this.tipoPoliza;
    }

    public void setTipoPoliza(TipoPoliza tipoPoliza) {
        this.tipoPoliza = tipoPoliza;
    }

    public Moneda getMoneda() {
        return this.moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Empleado getEmpleado() {
        return this.empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Operador getOperador() {
        return this.operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }

    public Date getFechainicial() {
        return this.fechainicial;
    }

    public void setFechainicial(Date fechainicial) {
        this.fechainicial = fechainicial;
    }

    public Date getFechafinal() {
        return this.fechafinal;
    }

    public void setFechafinal(Date fechafinal) {
        this.fechafinal = fechafinal;
    }

    public int getNumeropagos() {
        return this.numeropagos;
    }

    public void setNumeropagos(int numeropagos) {
        this.numeropagos = numeropagos;
    }

    public String getPolizaanterior() {
        return this.polizaanterior;
    }

    public void setPolizaanterior(String polizaanterior) {
        this.polizaanterior = polizaanterior;
    }

    public double getInteres() {
        return this.interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getDeducible() {
        return this.deducible;
    }

    public void setDeducible(double deducible) {
        this.deducible = deducible;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getVenta() {
        return this.venta;
    }

    public void setVenta(String venta) {
        this.venta = venta;
    }

    public Set getPagoses() {
        return this.pagoses;
    }

    public void setPagoses(Set pagoses) {
        this.pagoses = pagoses;
    }

    public Set getDocumentoses() {
        return this.documentoses;
    }

    public void setDocumentoses(Set documentoses) {
        this.documentoses = documentoses;
    }

    public Set getBiens() {
        return this.biens;
    }

    public void setBiens(Set biens) {
        this.biens = biens;
    }
}
