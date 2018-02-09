
package xxxfactura;

import javax.swing.JOptionPane;

public class cliente extends persona  {
     
        private String rfc;
        private String correo;
        private int telefono;

    public cliente(String rfc, String correo, int telefono, xxxfactura.domicilio domicilio, String nombre) {
        super(domicilio, nombre);
        this.rfc = rfc;
        this.correo = correo;
        this.telefono = telefono;
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