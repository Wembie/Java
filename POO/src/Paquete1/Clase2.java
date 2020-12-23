package Paquete1;

public class Clase2 {
    public static void main(String [] args){
        Clase1 objeto1 = new Clase1();
        
        objeto1.atributo1 = 15;
    
    
        //ENCAPSULAMIENTO Y METODO GET Y SET
    
        //objeto1.edad = 1000;
        objeto1.setEdad(15);
        System.out.println("La edad es: "+objeto1.getEdad());
        
        objeto1.setNombre("Juan");
        System.out.println("El nombre es: "+objeto1.getNombre());
    
    }
    
}
