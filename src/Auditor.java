public class Auditor extends Usuario{

    public Auditor(String apellido, String fechaAlta, String cuil, String pass){
        super(apellido, fechaAlta, cuil, pass);
    }

    public void subirSustancia(Productor productor,Sustancia sustancia){
        productor.crearSustancia(sustancia);
    }

    public void darBajaSustancia(Productor productor, Sustancia sustancia){
        productor.eliminarSustancia(sustancia);
    }

    public void enviarEmailAviso(){

    }
    
}
