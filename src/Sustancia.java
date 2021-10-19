public class Sustancia {
    private String nombre, formula;
    private double pureza;
    private int cantidad;


    public Sustancia(String nombre, String formula, Double pureza, int cantidad){
        this.nombre = nombre;
        this.formula = formula;
        this.pureza = pureza; 
        this.cantidad = cantidad;
    }

    

    public String getFormula() {
        return formula;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPureza() {
        return pureza;
    }

   public int getCantidad() {
       return cantidad;
   }
   public void setCantidad(int cantidad) {
       this.cantidad = cantidad;
   }
    public void setFormula(String formula) {
        this.formula = formula;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPureza(float pureza) {
        this.pureza = pureza;
    }
   
}
