
package xxxnomina;

import javax.swing.JOptionPane;


public class nomina {
    
     private double sueldobruto ;
     

    public nomina(double sueldobruto) {
        this.sueldobruto = sueldobruto;
    }


    public void metersueldobruto ()
    {sueldobruto= Double.parseDouble(JOptionPane.showInputDialog("introduce lado sb")) ;
    }
    
    public void setSueldobruto(double sueldobruto) {
        this.sueldobruto = sueldobruto; 
    }

    public double getSueldobruto() {
        return sueldobruto;
    }
    
    



        //ISR
        public double getisr () {double isr=0;
         if (sueldobruto <=0) {System.out.println("que pobre es uds");}
            if (0.01<=sueldobruto && sueldobruto<=8599) {System.out.println("que pobre es uds");}
            if (8600<=sueldobruto && sueldobruto<=10200) {isr = (double ) (0.18*sueldobruto); }
           if (10201<=sueldobruto && sueldobruto<=20700) {isr = (double ) (0.21*sueldobruto); }
           if (20701<=sueldobruto && sueldobruto<=32700) {isr = (double ) (0.24*sueldobruto); }
           if (32701<=sueldobruto && sueldobruto<=999999999) {isr = (double ) (0.35*sueldobruto);}
           return  isr;}
    
            public double getimss () {
           double imss = (double ) (0.01125*sueldobruto);
            return imss;}
            
             public double getahorro () {
           double ahorro = (double ) (0.08*sueldobruto); 
            return ahorro;}
             
            public double getdespensa () {
           double despensa = (double ) (0.05*sueldobruto); 
           return despensa;}
            
            public double getcomida () {
           double comida = (double ) (0.02*sueldobruto); 
        return comida;}

    public double  getsueldoneto() {
        double sueldoneto=sueldobruto-getisr()-getimss()-getahorro()-getdespensa()-getcomida();
        return sueldoneto;
    }
    
}
