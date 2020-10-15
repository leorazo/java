//imprimer de mayor a menor 3 numero dados
package a7ifelseanidado_abc;
import javax.swing.JOptionPane;


public class A7ifelseanidado_abc {

    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("introduce el primer numero"));
        b = Integer.parseInt(JOptionPane.showInputDialog("introduce el segundo numero"));
        c = Integer.parseInt(JOptionPane.showInputDialog("introduce el tercero numero"));
                                                                                                //  if (cond) && (cond)
        if ((a>b) && (b>c)) //no se puede hacer comparacion de 3 numero de forma directa        //  (booleano)&&(booleano)
        {JOptionPane.showMessageDialog(null, a+"es el mayor " +b+ " despues "+c+ " es el menor" );} // (true)(true)= true
                                                                                                    //asi sucesivamente
        else {if ((a>c) && (c>b)) //no se puede hacer comparacion de 3 numero de forma directa
        {JOptionPane.showMessageDialog(null, a+"es el mayor " +c+ " despues "+b+ " es el menor" );}
        
        else { {if ((b>a) && (a>c)) //no se puede hacer comparacion de 3 numero de forma directa
        {JOptionPane.showMessageDialog(null, b+"es el mayor " +a+ " despues "+c+ " es el menor" );}
        
        else {if ((b>c) && (c>a)) //no se puede hacer comparacion de 3 numero de forma directa
        {JOptionPane.showMessageDialog(null, b+"es el mayor " +c+ " despues "+a+ " es el menors" );}
        
        else {if ((c>a) && (a>b)) //no se puede hacer comparacion de 3 numero de forma directa
        {JOptionPane.showMessageDialog(null, c+"es el mayor " +a+ " despues "+b+ " es el menor" );}
        
        else {JOptionPane.showMessageDialog(null, c+"es el mayor " +b+ " despues "+a+ " es el menor" );}}}}}}
}}
