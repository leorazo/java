package xxxfactura;

import javax.swing.JOptionPane;


public class domicilio {

   
       String calle;
        String colonia;
        int numext;
        int numint;
        int cp;
        
         domicilio  (){
        calle = "";
        colonia= "";
        numext=0;
        numint=0;
        cp=0;}
        
        domicilio  (String CALL,String COL ,int NE,int NI , int CP){
        calle = CALL;
        colonia= COL;
        numext=NE;
        numint=NI;
        cp=CP;}
       
   public void meter_domicilio ()
    {calle= JOptionPane.showInputDialog("introduce la calle");
     colonia= JOptionPane.showInputDialog("introduce la colonia");
    numext= Integer.parseInt(JOptionPane.showInputDialog("introduce el numero numero exterior"));
     numint= Integer.parseInt(JOptionPane.showInputDialog("introduce el numero numero interior"));
    cp= Integer.parseInt(JOptionPane.showInputDialog("introduce el primer numero"));
     }
        
   
   
   
   public void mostrar_domicilio ()
    {System.out.println("la calle es " +calle);
    System.out.println("la colonia es "+colonia);
    System.out.println("el numero numero exterior es "+numext);
    System.out.println("el numero numero interior es" +numint);
    System.out.println("el cp es "+cp);
     }
      
        
        
  }
    
