public class Simple extends Sustancia{
    
    private String color; 

    public Simple(String nombre, String composicion, Double pureza, int cantidad, double precio){
        super(nombre, composicion, pureza, cantidad,precio);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    
}
