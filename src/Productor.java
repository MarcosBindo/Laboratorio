import java.util.Date;
import java.util.Vector;
import java.util.Calendar;

public class Productor extends Usuario implements Irenovable {

    private Date fechaRenov;
    private Vector<Sustancia> sustancias = new Vector<Sustancia>();
    private String nombreLab;

    public Productor(String nombreLab,String apellido, String fechaAlta, String cuil, String pass){
        super(apellido,fechaAlta,cuil,pass);
        this.fechaRenov = new Date();
        this.sustancias = new Vector<Sustancia>();
        this.nombreLab = nombreLab;
    }

    public Productor(String nombre, String apellido,int edad, String fechaAlta, String cuil, String pass){
        super(nombre, apellido, edad, fechaAlta, cuil, pass);
        this.fechaRenov = new Date();
        this.sustancias = sustancias;
        this.nombreLab = nombreLab;

    }
    
    public void crearSustancia(Sustancia sustancia){
        this.sustancias.add(sustancia);
    }
    
    public void eliminarSustancia(Sustancia sustancia){
        sustancias.remove(sustancia);
    }

    //Implementado dentro de adjuntarFactura
    /*public void aceptarTramite(int nTramite){
        System.out.println("El tramite N°"+ nTramite + " fue aceptado.");  
    }*/

    public void rechazarTramite(int nTramite){
        System.out.println("El tramite N°"+ nTramite + " fue rechazado por falta de stock");  
    }

    public void adjuntarFactura(Tramite tramite){
        for (Sustancia sustancia : sustancias) {
            tramite.setMontoTotal(sustancia.getPrecio() * tramite.getCantidad());
        }
        System.out.println("[Tramite N°" + tramite.getnTramite() + " aceptado]");
        System.out.println("<----FACTURA---->");
        System.out.println("ID de tramite: " + tramite.getnTramite());
        System.out.println("Fecha: " + tramite.getFecha());
        System.out.println("Sustancia solicitada: " + tramite.getSustancia().getNombre());
        System.out.println("Cantidad: "+ tramite.getCantidad());
        System.out.println("Productor seleccionado: " + tramite.getProductor().getNombreLab());
        System.out.println("Monto total: $"+ tramite.getMontoTotal());
        System.out.println("El producto sera despachado");
    }

    public void manejoTramite(Tramite tramite){
        for (Sustancia sustancia : sustancias) {
            if(tramite.getSustancia().getNombre().equals(sustancia.getNombre())){
                if(sustancia.getCantidad() > tramite.getCantidad()){
                    sustancia.setCantidad(sustancia.getCantidad()-tramite.getCantidad());
                    adjuntarFactura(tramite);
                }else{
                    rechazarTramite(tramite.getnTramite());
                }
          }
    }
}

    @Override
    public void renovarDatos(String dni) {
        String [] sp = getCuil().split("-");
        if(sp[1].equals(dni)){
            System.out.println("Dni Correcto");
            this.renovarFecha();
        }else{
            this.setCuil(sp[0] + "-" + dni + "-" + sp[2]);
            this.renovarFecha();
        }
    }

    @Override
    public void renovarFecha() {
        this.fechaRenov = Calendar.getInstance().getTime();        
    }

    public Date getFechaRenov() {
        return fechaRenov;
    }
    public void setFechaRenov(Date fechaRenov) {
        this.fechaRenov = fechaRenov;
    }

    public Vector<Sustancia> getSustancias() {
        return sustancias;
    }
    public String getNombreLab() {
        return nombreLab;
    }
    public void setNombreLab(String nombreLab) {
        this.nombreLab = nombreLab;
    }
   
}
