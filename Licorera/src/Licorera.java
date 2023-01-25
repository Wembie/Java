import javax.swing.*;
public class Licorera{

    private String nomClien, nomProduc, caneca, botella;
    private int canUnid, precio;
    private double valPago;

    public Licorera(){
        nomClien = null;
        nomProduc = null;
        caneca = null;
        botella = null;
        canUnid = 0;
        precio = 0;
        valPago = 0;
    }
    public void pedirDatosDeLaVenta(){
        int temporal;
        nomClien = JOptionPane.showInputDialog("Ingrese el nombre del cliente?");
        temporal = Integer.parseInt(JOptionPane.showInputDialog("Que producto deseas llevar?: "
                + "\n1. Aguardiente"
                + "\n2. Ron"
                + "\n3. Brandy"
                + "\n4. Ginebra"));
        switch( temporal ) {
            case 1:
                nomProduc = "Aguardiente";
                break;
            case 2:
                nomProduc = "Ron";
                break;
            case 3:
                nomProduc = "Brandy";
                break;
            case 4:
                nomProduc = "Ginebra";
                break;
            default:
                break;
        }
        //Caneca
        //Botella
        canUnid = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que desea llevar"));
    }

    public void asignarPrecioBotella(){
        switch( nomProduc ){ 
            case "Aguardiente":
                precio = 37000;
                break;
            case "Ron":
                precio = 45000;
                break;
            case "Brandy":
                precio = 55000;
                break;
            case "Ginebra":
                precio = 58000;
                break;
            default: 
                JOptionPane.showMessageDialog(null,"Producto inexistente");
                break;
        }
    }
    
    public void calcularValorDeLaVenta(){
        valPago = canUnid * precio;
    }

    public void generarFactura(){
        JOptionPane.showMessageDialog(null,
                "\n PRODUCTO COMPRADO:"+nomProduc+
                "\n CANTIDAD DE PANES COMPRADOS:"+canUnid+
                "\n VALOR A PAGAR $:"+valPago);

    }


}