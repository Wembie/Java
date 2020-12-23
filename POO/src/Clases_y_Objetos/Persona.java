package Clases_y_Objetos;

//public class Persona {
    /*//Atributos
    String nombre;
    int edad;*/
    
    //Metodos
    
    //Metodo Constructor
    
    /*public Persona(String name, int age){ 
        nombre = name;
        edad = age;     
    }*/
    /*public Persona(String nombre, int edad){ 
        this.nombre = nombre;
        this.edad = edad;     
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);*/
    
    /*//Atributos SOBRE CARGA
    String nombre;
    int edad;
    String dni;

    //Metodos -> Click Derecho -> Insert Code -> Metodo -> Escoger 
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String dni) {
        this.dni = dni;        
    }
    
    public void correr(){
        System.out.println("Soy "+nombre+", tengo "+edad+" años y estoy corriendo una maraton");           
    }
    
    public void correr(int km){
        System.out.println("He corrido "+km+" kilometros");           
    }*/
    
    
    //CONSTANTES
    
    /*private final String nombre;
    private int edad; //variable
    //Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }*/
    
    /*public void setNombre(String nombre) {//NO SE PUEDE CAMBIARLO POR Q YA ES CONSTANTE
        this.nombre = nombre;
    } 
}*/
public class Persona extends Animal{
    
    @Override
    public void comer(){
        System.out.println("Estoy comiendo sentado y con cubiertos");
    }  
    
}
