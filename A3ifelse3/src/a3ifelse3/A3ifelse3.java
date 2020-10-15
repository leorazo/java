//si la compra es mayor de 300 se hace descuento de 
//20% si no no
package a3ifelse3 ;

import javax.swing.JOptionPane;

public class A3ifelse3 {

    public static void main(String[] args) {
        // TODO code application logic here
        double compradesc ,mcompra ;
       mcompra =Double.parseDouble (JOptionPane.showInputDialog("monto de su compra"));
   
        compradesc =mcompra* 0.8;
      
        if (mcompra>300){JOptionPane.showMessageDialog(null ,"el monto de la compra es de "+compradesc);
        }
        else{JOptionPane.showMessageDialog(null ,"el monto de la compra es de "+mcompra);
        }
        
        }
    }
    

