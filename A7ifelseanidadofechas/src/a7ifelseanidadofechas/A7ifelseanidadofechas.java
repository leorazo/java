//te dice si la fecha es correcta suponiendo que los mese tienen 30 dias 
//solo detecta un error
package a7ifelseanidadofechas;

import javax.swing.JOptionPane;

public class A7ifelseanidadofechas {

    public static void main(String[] args) {
        // TODO code application logic here
        int dia, mes , año ;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("escribe numero de dia")) ;
        mes = Integer.parseInt(JOptionPane.showInputDialog("escribe el numero del mes"));
        año = Integer.parseInt(JOptionPane.showInputDialog("escribe el numero del año"));
        
        if ((30 >= dia) && (dia >= 1))
        {if ((12 >= mes) && (mes >= 1)) 
        {if ((1 >= año)) 
        {JOptionPane.showMessageDialog(null,"la fecha es correcta");} 
        
        else {JOptionPane.showMessageDialog(null,"el año es incorrecto");}} 
        else {JOptionPane.showMessageDialog(null,"el mes es incorrecto");}}
        else {JOptionPane.showMessageDialog(null,"el dia es incorrecto");}
    }
    
}
// if () {} else {}