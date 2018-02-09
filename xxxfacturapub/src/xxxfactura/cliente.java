
package xxxfactura;

import javax.swing.JOptionPane;

public class cliente  {
     
        String rfc;
        String correo;
        int telefono;
        
        persona persona;
        
        cliente  (){
       persona = new persona (); //estas son agregaciones por que son publicas
   
        rfc = "";
        correo= "";
        telefono=0;
        }
        
        cliente  (String RFC,String CO ,int TEL){
        rfc = RFC;
        correo= CO;
        telefono=TEL;
        }

     public void meter_cliente ()
    {rfc= JOptionPane.showInputDialog("introduce el RFC");
    correo= JOptionPane.showInputDialog("introduce el correo");
    telefono= Integer.parseInt(JOptionPane.showInputDialog("introduce lqa cantidad"));
    }
     
     
     public void mostrar_cliente ()
    {System.out.println("el RFC es " +rfc);
    System.out.println("el correo es "+correo);
    System.out.println("el telefono es "+telefono);
    }
}