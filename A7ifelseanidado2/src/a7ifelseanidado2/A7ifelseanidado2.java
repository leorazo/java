//te dice cuantas cifras tiene una cantidad
package a7ifelseanidado2;

import javax.swing.JOptionPane;

public class A7ifelseanidado2 {

    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("introduce un numero de 0-99,999"));
        
                                                                                                //  if (cond) && (cond)
        if ((10>a) && (a >= 0)) //no se puede hacer comparacion de 3 numero de forma directa        //  (booleano)&&(booleano)
        {JOptionPane.showMessageDialog(null, "tu numero tiene una cifra ");} // (true)(true)= true
                                                                                                    //asi sucesivamente
        else {if ((100>a) && (a>9)) //no se puede hacer comparacion de 3 numero de forma directa
        {JOptionPane.showMessageDialog(null, "tu numero tiene 2 cifras" );}
        
        else { {if ((1000>a) && (a>99)) //no se puede hacer comparacion de 3 numero de forma directa
        {JOptionPane.showMessageDialog(null, "tu numero tiene 3 cifras" );}
        
        else {if ((10000>a) && (a>999)) //no se puede hacer comparacion de 3 numero de forma directa
        {JOptionPane.showMessageDialog(null, "tu numero tiene 4 cifras"  );}
        
        else {if ((100000>a) && (a>9999)) //no se puede hacer comparacion de 3 numero de forma directa
        {JOptionPane.showMessageDialog(null,"tu numero tiene 5 cifras" );}
        
        else {JOptionPane.showMessageDialog(null, "cifra no valida" );}}}}}}
    }
    
}
