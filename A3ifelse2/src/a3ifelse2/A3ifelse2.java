package a3ifelse2;

import javax.swing.JOptionPane;

public class A3ifelse2 {

    public static void main(String[] args) {
        // TODO code application logic here
        int numero ;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("teclee un numero entero"));
        numero = numero%10;
        
        if (numero ==0){
         JOptionPane.showMessageDialog(null, "el numero es multiplo de 10");
            }
        else {JOptionPane.showMessageDialog(null, "no es multiplo de 10");
            }
        //________________________________________________
         int snumero, a ,b ;
         JOptionPane.showMessageDialog(null, "este programa compara 2 numeros");
        a = Integer.parseInt(JOptionPane.showInputDialog("teclee el primer numero entero"));
        b = Integer.parseInt(JOptionPane.showInputDialog("teclee el segundo numero entero"));
        
        if (a ==b){
         JOptionPane.showMessageDialog(null, "los numeros son iguales");}
        
        else {    
                  if (a > b){
                  JOptionPane.showMessageDialog(null, +a+ "es mayor que "+b );
            }
                 else {JOptionPane.showMessageDialog(null, +b+ "es mayor que "+a); } }
        }
            }
    

