import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Tramite {
    private static final AtomicInteger count = new AtomicInteger();
    private int cantidad, nTramite;
    private Date fecha;
    private Productor productor;
    private Sustancia sustancia;
    private Double montoTotal;

    public Tramite(Date fecha, Sustancia sustancia, int cantidad, Productor productor){
        this.fecha = new Date();
        this.cantidad = cantidad;
        this.sustancia = sustancia;
        this.productor = productor;
        this.montoTotal = montoTotal;
        nTramite = count.incrementAndGet();
    }

    public int getCantidad() {
        return cantidad;
    }
    public static AtomicInteger getCount() {
        return count;
    }
    public Date getFecha() {
        return fecha;
    }
    public Productor getProductor() {
        return productor;
    }
    public Sustancia getSustancia() {
        return sustancia;
    }
    public int getnTramite() {
        return nTramite;
    }
    public Double getMontoTotal() {
        return montoTotal;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public void setProductor(Productor productor) {
        this.productor = productor;
    }
    public void setSustancia(Sustancia sustancia) {
        this.sustancia = sustancia;
    }
    public void setnTramite(int nTramite) {
        this.nTramite = nTramite;
    }
    public void setMontoTotal(Double montoTotal) {
        this.montoTotal = montoTotal;
    }    
    
}
