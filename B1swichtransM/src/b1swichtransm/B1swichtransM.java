
package b1swichtransm;

import javax.swing.JOptionPane;

public class B1swichtransM {

    public static void main(String[] args) {
        // TODO code application logic here
        int opcion, peso , pesof ;
        
        peso = Integer.parseInt(JOptionPane.showInputDialog("bienvenido al tranformador de kilos ,cuantos kilos desea transforma?"));
        
       opcion = Integer.parseInt(JOptionPane.showInputDialog("opciones de transformacio de kilos a \n"
        +"1 hectokilos \n"
        +"2 decigramos \n"
        +"3 gramos \n"       
        +"4 salir \n"));
        switch (opcion)
        { case 1: pesof = peso / 100;
                  JOptionPane.showMessageDialog(null, +peso+ "kilos es igual a " +pesof+ "hectokilos");
            break ;  
            
          case 2: pesof = peso*10;
                  JOptionPane.showMessageDialog(null, +peso+ "kilos es igual a " +pesof+ "decigramos");
          break ; 
            
          case 3 :pesof = peso*1000;
                  JOptionPane.showMessageDialog(null, +peso+ "kilos es igual a " +pesof+ "gramos");
              break;
              
          case 4: JOptionPane.showMessageDialog(null, "operacion no valida");
              break;}
           
}}
