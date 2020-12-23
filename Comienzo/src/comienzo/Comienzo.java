package comienzo;

import javax.swing.JOptionPane;

public class Comienzo {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        /*sout*/System.out.println("Con Tab");
        
        //Boolean
        boolean valorLogico = true;
        System.out.println("El valor de la variable es: " + valorLogico);
        
        //Caracteres
        char valorCaracter = '\u0000';
        valorCaracter = 'D';
        System.out.println( valorCaracter );
     
        String cadena = null;
        cadena = "Holiwis";
        System.out.println(cadena);
        
        //Enteros
        byte n1 = 0;
        short n2 = 0;
        int n3 = 0;
        long n4 = 0L;
        
        //Reales
        float n5 = 0.0F;
        double n6 = 0.0;
        
        //Constantes
        final int VALOR = 23; //Siempre sera 23   
        
        //Casting
        int alfa = 20;
        float beta = 23.5F;
        beta = alfa;
               
        alfa = (int) beta;
        alfa = (char) 'b';
        System.out.println(alfa);
        
        char caracter = (char) alfa;
        System.out.println(caracter);
        
        int numero = Integer.parseInt("10"); //de cadena a entero
        System.out.println(numero * 3);
        
        String cadenaCasting = Integer.toString(10);// de entero a cadena
        System.out.println(cadenaCasting);
        
        //Concatenar
        String nombre = "Juan";
        int edad = 18;
        String informacion = nombre + " tiene " + edad + " años";
        System.out.println(informacion);
        
        //Arimentica
        //Suma = +
        //Resta = -
        //Division = /
        //Multiplicacion = *
        
        //Los operadores son iguales a C
        //AND = &&
        //OR = ||
        //NOT = !()
        
        //int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un Numero: "));
        
        int valor1 = 1;
        int valor2 = 2;
        int suma = valor1 + valor2;
        System.out.println("La suma es: " + suma);
        if(!(valor1 == valor2)){
            System.out.println("Iguales");
        }
        else if(valor1 > valor2){ 
            System.out.println("Valor1 es mayor a Valor2");
        }
        else{
            System.out.println("No Iguales");
        }
        
        //SWITCH
        int dia = 3;
        switch(dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            default:
                System.out.println("No es un dia");
                break;
        }
        
        //FOR
        int i;
        for( i = 0; i < 10; i++ ){
            System.out.println("Numero: " + i);
        }
        //WHILE
        int valor = 0;
        while( valor < 10 ){
            System.out.println("Valor: " + valor);
            valor++;
        }
        //MENSAJE ERROR
        System.err.println("Error");
        
        //ARREGLOS
        int[] arreglo = new int[10];
        int j;
        for( j = 0; j < arreglo.length; j++ ){
            arreglo[j] = j;            
        }     
        System.out.println("Longitud: " + arreglo.length);
        
        String[] paises = new String[3];
        paises[2] = "Colombia";
        System.out.println("Pais: "+ paises[2]);
        
        //SUBSTRING
        String cadenita = "En Java se hizo Minecraft";
        System.out.println(cadenita.substring(0, 15)); 
        
        //SPLIT
        String año = "10-22-2020";
        String[] fragmentos = año.split("-");
        System.out.println("Dia: " + fragmentos[0]);
        System.out.println("Mes: " + fragmentos[1]);
        System.out.println("Año: " + fragmentos[2]);                 
    }
    
}
