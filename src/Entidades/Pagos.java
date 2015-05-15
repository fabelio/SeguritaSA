package Entidades;
// Generated Apr 25, 2015 12:53:34 AM by Hibernate Tools 3.2.1.GA

import java.util.Date;

/**
 * Pagos generated by hbm2java
 */
public class Pagos implements java.io.Serializable {

    private int codigo;
    private Tipopago tipopago;
    private Poliza poliza;
    private Date fecha;
    private double monto;

    public Pagos() {
    }

    public Pagos(int codigo, Tipopago tipopago, Poliza poliza, Date fecha, double monto) {
        this.codigo = codigo;
        this.tipopago = tipopago;
        this.poliza = poliza;
        this.fecha = fecha;
        this.monto = monto;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Tipopago getTipopago() {
        return this.tipopago;
    }

    public void setTipopago(Tipopago tipopago) {
        this.tipopago = tipopago;
    }

    public Poliza getPoliza() {
        return this.poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return this.monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}