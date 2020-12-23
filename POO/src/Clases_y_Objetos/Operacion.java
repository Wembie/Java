package Clases_y_Objetos;

import javax.swing.JOptionPane;

public class Operacion {
    
    /*//Atributos SIN PARAMETROS 
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
              
    //Metodos
    
    //Metodo para pedit al usuario q nos digite 2 numeros
    public void leerNumeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un Numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un Numero: "));         
    }    
    //Metodo para sumar ambos numeros
    public void sumar(){
        suma = numero1 + numero2;
    }
    //Metodo para restar ambos numeros
    public void restar(){
        resta = numero1 - numero2;
    }
    //Metodo para multiplicar ambos numeros
    public void multiplicar(){
        multiplicacion = numero1 * numero2;
    }
    //Metodo para dividir ambos numeros
    public void dividir(){
        division = numero1 / numero2;
    }  
    //Metodo para mostrar los resultados
    public void mostrarResultados(){
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }*/
    
    /*//Atributos CON PARAMETROS
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Metodo para sumar ambos numeros
    public void sumar(int numero1, int numero2){
        suma = numero1 + numero2;
    }
    //Metodo para restar ambos numeros
    public void restar(int numero1, int numero2){
        resta = numero1 - numero2;
    }
    //Metodo para multiplicar ambos numeros
    public void multiplicar(int numero1, int numero2){
        multiplicacion = numero1 * numero2;
    }
    //Metodo para dividir ambos numeros
    public void dividir(int numero1, int numero2){
        division = numero1 / numero2;
    } 
    //Metodo para mostrar los resultados
    public void mostrarResultados(){
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }*/
    
    //Atributos CON PARAMETROS Y RETORNANDO
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Metodo para sumar ambos numeros
    public int sumar(int numero1, int numero2){
        int suma = numero1 + numero2;
        return suma;
    }
    //Metodo para restar ambos numeros
    public int restar(int numero1, int numero2){
        int resta = numero1 - numero2;
        return resta;
    }
    //Metodo para multiplicar ambos numeros
    public int multiplicar(int numero1, int numero2){
        int multiplicacion = numero1 * numero2;
        return multiplicacion;
    }
    //Metodo para dividir ambos numeros
    public float dividir(int numero1, int numero2){
        float division = numero1 / numero2;
        return division;
    } 
    //Metodo para mostrar los resultados
    public void mostrarResultados(int suma, int resta, int multiplicacion, float division){
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }
    
}
