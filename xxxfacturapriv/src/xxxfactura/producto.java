package xxxfactura;

import javax.swing.JOptionPane;

public class producto {
    
    
        private String descripcion;
        private int cantidad;
        private int precio;
        private int lote;

    public producto(String descripcion, int cantidad, int precio, int lote) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
        this.lote = lote;
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