import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Consumidor extends Usuario implements Irenovable{
    private Date fechaRenov;

    public Consumidor(String apellido, String fechaAlta, String cuil, String pass){
        super(apellido,fechaAlta,cuil,pass);
        this.fechaRenov = new Date();
    }

    public Consumidor(String nombre, String apellido,int edad, String fechaAlta, String cuil, String pass){
        super(nombre, apellido, edad, fechaAlta, cuil, pass);
        this.fechaRenov = new Date();
    }

    public void iniciarTramite(Date fecha, Sustancia sustancia, int cantidad, Productor productor){
        Tramite tramite = new Tramite(fecha, sustancia, cantidad, productor);
        solicitarSustancia(tramite);
        
    }

    public void cerrarTramite(AtomicInteger nTramite){
       System.out.println("[Tramite N°"+ nTramite+" finalizado]");
       System.out.println();

       
    }
    private void solicitarSustancia(Tramite tramite){
        tramite.getProductor().manejoTramite(tramite);
    }


    public Date getFechaRenov() {
        return fechaRenov;
    }

    public void setFechaRenov() {
        this.fechaRenov = fechaRenov;
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

}
