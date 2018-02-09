
package xxxfactura;

import javax.swing.JOptionPane;


public class documentooficial {
    
        private String fecha;
        private int folio;
        
        
        documentooficial  (){
        fecha= "";
        folio= 0;
        
        }
        
        documentooficial  (String FE,int FO){
        fecha = FE;
        folio= FO;
        }
    
        
         public void meter_documentooficial ()
    {fecha= JOptionPane.showInputDialog("introduce la fecha");
    folio= Integer.parseInt(JOptionPane.showInputDialog("introduce el folio"));
     }
         
         public void mostrar_documentooficial ()
    {System.out.println("la fecha es " +fecha);
    System.out.println("el folio es "+folio);
    }
}