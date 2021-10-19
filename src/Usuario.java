public abstract class Usuario{
    private String nombre, apellido, fechaAlta, cuil, pass;
    private int edad;

    public Usuario(String nombre, String apellido,int edad, String fechaAlta, String cuil, String pass){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechaAlta = fechaAlta;
        this.cuil = cuil;
        this.pass = pass;
    }

    public Usuario(String apellido, String fechaAlta, String cuil, String pass){
        this.apellido = apellido;
        this.fechaAlta = fechaAlta;
        this.cuil = cuil;
        this.pass = pass;
    }


    public String getApellido() {
        return apellido;
    }public String getCuil() {
        return cuil;
    }public int getEdad() {
        return edad;
    }public String getFechaAlta() {
        return fechaAlta;
    }public String getNombre() {
        return nombre;
    }

    private String getPass() {
        return pass;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setCuil(String cuil) {
        this.cuil = cuil;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }

}