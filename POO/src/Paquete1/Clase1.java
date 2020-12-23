//Modificadores de acceso

package Paquete1;

public class Clase1 {
    public int atributo1; //se puede usar en diferentes paquetes
    //private int atributo1;
    
    
    //ENCAPSULAMIENTO Y METODO GET Y SET
    
    //public int edad;
    private int edad;
    private String nombre;
    
    //Setters - > Establecemos la edad
    public void setEdad(int edad){
        this.edad = edad;
    }
    //Getters - > Mostramos la edad
    public int getEdad(){
        return edad;
    }
    
    //Metodos -> Click Derecho -> Insert Code -> Metodo -> Escoger 
    //Getters - > Mostramos la edad
    public String getNombre() {
        return nombre;
    }
    //Setters - > Establecemos la edad
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
