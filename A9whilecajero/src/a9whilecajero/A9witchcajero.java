//simular un cajero
package a9whilecajero;

import javax.swing.JOptionPane;

public class A9witchcajero {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        final int saldoi=1000;
        int opcion, ingreso ,retiro , saldof ;
        
       opcion = Integer.parseInt(JOptionPane.showInputDialog("bienvenido a su banco \n"
        +"1 ingresar saldo \n"
        +"2 retirar saldo \n"
        +"3 salir \n"));
        
        switch (opcion)
        { case 1: ingreso = Integer.parseInt(JOptionPane.showInputDialog("cuanto dinero va ingresar"));
                  saldof = ingreso + saldoi;
                  JOptionPane.showMessageDialog(null, "tu saldo final es de "+saldof);
            break ;  
            
          case 2: retiro = Integer.parseInt(JOptionPane.showInputDialog("cuanto dinero va retirar"));
          if (saldoi>retiro) 
          { saldof = saldoi-retiro;
                JOptionPane.showMessageDialog(null, "tu saldo final es de "+saldof);}
                  
          else {JOptionPane.showMessageDialog(null, "saldo no suficiente");    }
          break ; 
            
          case 3 :
              break;
            
        }      
        
        

        
    }
    
}
