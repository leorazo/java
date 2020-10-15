/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a7ifelseanidatecomb;

import javax.swing.JOptionPane;


public class A7ifelseanidatecomb {

    public static void main(String[] args) {
        // TODO code application logic here
        int dia, mes , año ;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("escribe numero de dia")) ;
        mes = Integer.parseInt(JOptionPane.showInputDialog("escribe el numero del mes"));
        año = Integer.parseInt(JOptionPane.showInputDialog("escribe el numero del año"));
        
        if (((30 >= dia) && (dia >0)&&(12 >= mes) && (mes >0)&&(año >0)))
        {JOptionPane.showMessageDialog(null, "dia valido " +dia+ " mes valido " +mes+ " año valido "+año);}
        
        else {if ((30 >= dia) && (dia >0)&&(12 >= mes) && (mes >0)&&(año <0)) 
        {JOptionPane.showMessageDialog(null, "dia valido "+dia+" mes valido "+mes+" año invalido "+año);} 
        
        else {if ((30 >= dia) && (dia >0)&&((mes>= 13) |(0>mes))&&(año >0)) 
        {JOptionPane.showMessageDialog(null, "dia valido "+dia+" mes invalido "+mes+" año valido "+año);} 
        
        else {if ((30 >= dia) && (dia >0)&&((mes>= 13) |(0>mes))&&(año <0)) 
        {JOptionPane.showMessageDialog(null, "dia valido "+dia+" mes invalido "+mes+" año invalido "+año);} 
        
        else {if (((dia>= 31) | (0>=dia))&&(12 >= mes) && (mes >0)&&(año >0)) 
        {JOptionPane.showMessageDialog(null, "dia invalido "+dia+" mes valido "+mes+" año valido "+año);} 
        
        else {if (((dia>= 31) | (0>=dia))&&(12 >= mes) && (mes >0)&&(año <0)) 
        {JOptionPane.showMessageDialog(null, "dia invalido "+dia+" mes valido "+mes+" año invalido "+año);} 
        
        else {if (((dia>= 31) | (0>=dia))&&((mes>= 13) |(0>mes))&&(año >0)) 
        {JOptionPane.showMessageDialog(null, "dia invalido "+dia+" mes invalido "+mes+" año valido "+año);} 
        
        else {if (((dia>= 31) | (0>=dia))&&((mes>= 13) |(0>mes))&&(año <0)) 
        {JOptionPane.showMessageDialog(null, "dia invalido "+dia+" mes invalido "+mes+" año invalido "+año);} 
        
        else {JOptionPane.showMessageDialog(null, "fecha inadmisible");}}}}}}} }
    }
    
}
// if () {} else {}
