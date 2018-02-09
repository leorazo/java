
package xxxfactura;

import javax.swing.JOptionPane;

public class perecedero extends producto {
    
    private String caducidad;

    public perecedero(String caducidad, String DES, int CAN, int PRE, int LO) {
        super(DES, CAN, PRE, LO);
        this.caducidad = caducidad;
    } 
        
         public void meter_caducidad ()
    {caducidad= JOptionPane.showInputDialog("introduce la caducidad ");
    
     }
         
         public void mostrar_caducidad ()
    {System.out.println("la caducidad es " +caducidad);
    }
    
}
