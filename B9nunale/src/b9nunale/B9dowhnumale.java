
package b9nunale;

import javax.swing.JOptionPane;



public class B9dowhnumale {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero,aleatorio, contador=0; 
        aleatorio = (int)(Math.random()*100) ;
        
        do {numero = Integer.parseInt(JOptionPane.showInputDialog("introduce un numero"));
             
        if (aleatorio>numero)
        {JOptionPane.showMessageDialog(null, "digite un numero mayor");}
        else {JOptionPane.showMessageDialog(null, "digite un numero menor");}
       
        contador++; }
       
        while(numero!=aleatorio);
        
        System.out.println("felicidades adivinaste el numero "+aleatorio+ "en "+contador+ "intentos");
        
      
        
    }
    
}
