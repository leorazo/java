package b6paroimp0;

import javax.swing.JOptionPane;

public class B6posneg0 {

    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        
        JOptionPane.showMessageDialog(null, "te dire si es positivo o negativo");
      num =Integer.parseInt(JOptionPane.showInputDialog("introduce un numero")) ;
       
       while (num!=0)
       {   
           if(num>0)
           {JOptionPane.showMessageDialog(null, "numero positivo");}
           
       else {JOptionPane.showMessageDialog(null, "numero negativo");}
           
       num =Integer.parseInt(JOptionPane.showInputDialog("introduce un numero")) ;} 
        
    }
    
}
