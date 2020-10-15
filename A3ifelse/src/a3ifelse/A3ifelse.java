package a3ifelse;
import javax.swing.JOptionPane;

public class A3ifelse {

    public static void main(String[] args) {
        // TODO code application logic here
        int pnumero, dato =5;
    
    pnumero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero entero"));
    
    if (pnumero == dato){//asi se marca el signo de comparacion , esto no es asignacion
    JOptionPane.showMessageDialog(null, "el numero es 5");
    }
    else { 
    JOptionPane.showMessageDialog(null, "el numero es diferente de 5");
    }     
        //_____________________-
        int snumero, res;                                                             // se declara var , se solicita var
                                                                                     // se guarda var
    snumero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero entero para sabar si es par o impar"));
    res = snumero%2;                                                              //se necesita if (condicion){accion}                                                       
    if (res == 0){                                                                 //se necesita else {accion}         
    JOptionPane.showMessageDialog(null, "el numero es par");                     // != operador desgiaul
    }                                                                            //el ; solo se utiliza en llas acciones
    else { 
    JOptionPane.showMessageDialog(null, "el numero es impar");
    }
    //_________________________________________________________
    
    int tnumero , sdato = 10;
    
    tnumero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero entero para ver si es mayor a 10"));
    
    if (tnumero >= sdato){//asi se marca el signo de comparacion , esto no es asignacion
    JOptionPane.showMessageDialog(null, "el numero es mayor o igual a 10");
    }
    else { 
    JOptionPane.showMessageDialog(null, "el numero es menor de 10");
    
}    
    
    
}}



