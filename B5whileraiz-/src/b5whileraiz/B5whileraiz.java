
package b5whileraiz;

import javax.swing.JOptionPane;


public class B5whileraiz {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int numero , cuadrado;
       numero = Integer.parseInt(JOptionPane.showInputDialog("introduce un numero")) ;
        while (numero>=0)
        {cuadrado=numero*numero;
        JOptionPane.showMessageDialog(null, "el cuadrado del numero es "+cuadrado);
        numero = Integer.parseInt(JOptionPane.showInputDialog("introduce un numero")) ;
        }
        
    }
    
}
