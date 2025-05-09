
package proyectonovia;


public class Alquiler {
    
    private Novia novia;
    private int duracion; //duracion del alquiler en dias
    private double costo;

    public Alquiler(Novia novia, int duracion) {
        this.novia = novia;
        this.duracion = duracion;
        this.costo = calcularCosto();
    }
    
    public void setDuracion(int nuevaDuracion){
        this.duracion = nuevaDuracion;
        this.costo = calcularCosto();
    }
    
    private double calcularCosto(){
        return 100.0*duracion; //costo por dia
    }
    
    public void mostrarRecibo(){
        System.out.println("Recibo de alquiler: ");
        System.out.println("La novia: "+ novia.getNombre());
        System.out.println("Edad: "+novia.getEdad());
        System.out.println("Hobby: "+novia.getHobby());
        System.out.println("Duracion del alquiler: "+duracion+ " dias");
        System.out.println("Costo total de alquiler: "+costo);
    }
    
}
