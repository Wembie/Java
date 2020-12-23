package Clases_y_Objetos;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String [] args){
        //SIN PARAMETROS
        /*Operacion op = new Operacion();
        
        op.leerNumeros();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
        op.mostrarResultados();*/
        
        /*//CON PARAMETROS
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un Numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un Numero: "));
        
        Operacion op = new Operacion();
        
        op.sumar(n1, n2);
        op.restar(n1, n2);
        op.multiplicar(n1, n2);
        op.dividir(n1, n2);
        
        op.mostrarResultados();*/

        /*//CON PARAMETROS Y RETORNO
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un Numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un Numero: "));
        
        Operacion op = new Operacion();
        
        int suma = op.sumar(n1, n2);
        int resta = op.restar(n1, n2);
        int multiplicacion = op.multiplicar(n1, n2);
        float division = op.dividir(n1, n2);
        
        op.mostrarResultados(suma, resta, multiplicacion, division);
        
        ///////////////////////////////////////////////////////
        
        Persona p1 = new Persona("Juan", 18);
        
        p1.mostrarDatos();*/
        ////////////////
        /*Persona persona1 = new Persona("Juan", 18);        
        persona1.correr();
        
        Persona persona2 = new Persona("127216735");
        persona2.correr(100);*/
        
        /*Persona persona1 = new Persona("Juan",18);
        
        persona1.mostrarDatos();
        persona1.setEdad(20);
        
        persona1.mostrarDatos();*/
        
        /*Cuadrilatero c1;
        float lado1,lado2;
        
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado1: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado2: "));
        
        if(lado1 == lado2){ //Es cuadrado
            c1 = new Cuadrilatero(lado1);
        }
        else{
            c1 = new Cuadrilatero(lado1, lado2);
        }
        System.out.println("El perimetro es: "+c1.getPerimetro());
        System.out.println("El area es: "+c1.getArea());*/
        
        Persona persona = new Persona();
        Perro perro = new Perro();
        
        persona.comer();
        perro.comer();
    }
    
}
