package b7parimpar;

import javax.swing.JOptionPane;

public class B7parimpar {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int num,resi ;
        
        JOptionPane.showMessageDialog(null, "te dire si es par o impar");
      num =Integer.parseInt(JOptionPane.showInputDialog("introduce un numero")) ;
      
       
       while (num!=0)
       {   resi=num%2;
       
           if(0==resi)
           {JOptionPane.showMessageDialog(null, "numero par");}
           
       else {JOptionPane.showMessageDialog(null, "numero impar");}
           
       num =Integer.parseInt(JOptionPane.showInputDialog("introduce un numero")) ;} 
    }
    
}
