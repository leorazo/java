
package xxxfactura;

import javax.swing.JOptionPane;

public class perecedero  {
    
    String caducidad;
   producto producto;
    
        perecedero  (){
        producto = new producto();    
            
        caducidad = "";
        
        }
        
        perecedero  (String CAD){
        caducidad = CAD;
        }
    
        
         public void meter_caducidad ()
    {caducidad= JOptionPane.showInputDialog("introduce la caducidad ");
    
     }
         
         public void mostrar_caducidad ()
    {System.out.println("la caducidad es " +caducidad);
    }
    
}
