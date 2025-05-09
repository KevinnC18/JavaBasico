
package proyectomujer;


public class mujer {
    //atributos
    private String nombre;
    private int edad;
    private float estatura;

    public mujer(String nombre, int edad, float estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        //siempre se relaciona con getter and setter
    }
    //get es como obtener un dato
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public void mostrarInfromacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Estatura: "+estatura);
    }
    
}
