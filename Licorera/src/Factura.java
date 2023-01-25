/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wembie
 */
public class Factura {
    public static void main(String[] args){
        Licorera one = new Licorera();
        
        one.pedirDatosDeLaVenta();
        one.asignarPrecioBotella();
        one.calcularValorDeLaVenta();
        one.generarFactura();
    }
    
    
}
