
package xxxfactura;

import javax.swing.JOptionPane;

public class persona {
     
  domicilio domicilio;
         
    String nombre;
   
        persona  (){
        domicilio=new domicilio ();    
            
        nombre = "";
        }
        
        persona  (String NOM){
        nombre = NOM;
        }
    
        
         public void meter_persona ()
    {nombre= JOptionPane.showInputDialog("introduce el nombre");
    
     }
         
         public void mostrar_persona ()
    {System.out.println("el nombre es " +nombre);
    }
    
}