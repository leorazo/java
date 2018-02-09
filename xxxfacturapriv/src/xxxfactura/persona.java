
package xxxfactura;

import javax.swing.JOptionPane;

public class persona {
     
  domicilio domicilio;    
    private String nombre;
    
    

    public persona(domicilio domicilio, String nombre) {
        this.domicilio = domicilio;
        this.nombre = nombre;
    }
   
        
    
        
         public void meter_persona ()
    {nombre= JOptionPane.showInputDialog("introduce el nombre");
    
     }
         
         public void mostrar_persona ()
    {System.out.println("el nombre es " +nombre);
    }
    
}