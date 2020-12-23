package Paquete1;

public class Estatico {
    private  static String frase = "Primera Frase"; //Atributo
    
    public static int sumar( int n1,int n2 ){ //Metodos
        int suma = n1 + n2;
        return suma;
    }
     
    public static void main(String[] args){
        /*Estatico ob1 = new Estatico();
        Estatico ob2 = new Estatico();
        
        ob2.frase = "Segunda Frase";
        
        System.out.println(ob1.frase);
        System.out.println(ob2.frase);*/
        
        System.out.println(Estatico.frase);
        System.out.println("La suma es: " + Estatico.sumar(2, 4));
    }
    
}
