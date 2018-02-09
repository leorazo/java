
package xxxfactura;

import javax.swing.JOptionPane;

public class factura {
        
    perecedero perecedero;//agregacion de perecedero
    cliente cliente;
    documentooficial documentooficial;
    
        int total;
        String metododepago;
        String moneda;
        int impuesto;
        
        factura  (){
           
        perecedero = new perecedero(); //agregacion de perecedero
        cliente=new cliente();
        documentooficial = new documentooficial();
        
        total = 0;
        metododepago= "";
        moneda="";
        impuesto=0;
        }
        
        factura  (int  TO,String  MP,String MO , int IM){
        total = TO;
        metododepago= MP;
        moneda=MO;
        impuesto=IM;
        }
    
        
         public void meter_factura ()
    {   total= Integer.parseInt(JOptionPane.showInputDialog("introduce la cantidad total"));
        metododepago= JOptionPane.showInputDialog("introduce la el metodo de pago");
       moneda= JOptionPane.showInputDialog("introduce la moneda");
       impuesto= Integer.parseInt(JOptionPane.showInputDialog("introduce el impuesto"));
     }
         
         public void mostrar_factura ()
    {System.out.println("el total es " +total);
    System.out.println("el metodo de pago es "+metododepago);
    System.out.println("la moneda es "+moneda);
    System.out.println("el impuesto es" +impuesto);}
}