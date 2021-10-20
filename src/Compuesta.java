import java.util.Vector;

public class Compuesta extends Sustancia{
    private Vector<Simple>composicion;

    public Compuesta(String nombre, String composicion, Double pureza, int cantidad, double precio) {
        super(nombre, composicion, pureza, cantidad, precio);
        this.composicion = new Vector<Simple>();
    }

    public void componer (Simple simple){
        this.composicion.add(simple);
    }

    public Vector<Simple> descomponer(){
        Vector<Simple> temp = this.composicion;
        composicion.clear();
        return temp; 
    }

    public void descomponer(Simple simple){
        for (Simple temp : this.composicion) {
            if(temp.getFormula().equals(simple.getFormula())){
                this.composicion.remove(temp);
            }
        }
    }

    public void descomponer(Vector<Simple> simples){
        for (Simple simple : simples) {
            this.descomponer(simple);
            }
        }
    }
    
/*
public void descomponer(Vector<Simple> simples){
        for (Simple simple : simples) {
            for (int i = 0; i < composicion.size(); i++) {
                if(this.composicion.get(i).getFormula().equals(simple.getFormula()){
                    this.composicion.remove(i);
                }
            }
        }
    }
 */
