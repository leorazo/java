package xxxfactura;

import javax.swing.JOptionPane;

public class producto {
    
    
        String descripcion;
        int cantidad;
        int precio;
        int lote;
        
        producto  (){
        descripcion = "";
        cantidad= 0;
        precio=0;
        lote=0;
        }
        
        producto  (String DES,int CAN,int PRE , int LO){
        descripcion = DES;
        cantidad= CAN;
        precio=PRE;
        lote=LO;
        }
    
        
         public void meter_producto ()
    {descripcion= JOptionPane.showInputDialog("introduce la descripcion");
    cantidad= Integer.parseInt(JOptionPane.showInputDialog("introduce lqa cantidad"));
     precio= Integer.parseInt(JOptionPane.showInputDialog("introduce precio"));
    lote= Integer.parseInt(JOptionPane.showInputDialog("introduce el lote"));
     }
         
         public void mostrar_producto ()
    {System.out.println("el producto es " +descripcion);
    System.out.println("la cantidad es "+cantidad);
    System.out.println("el precio es "+precio);
    System.out.println("el lote es" +lote);}
    
}