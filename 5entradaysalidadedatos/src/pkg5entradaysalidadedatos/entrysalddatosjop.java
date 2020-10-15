package pkg5entradaysalidadedatos;

import javax.swing.JOptionPane;//libreria necesaria para joptionpane

public class entrysalddatosjop {
   
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena ;
        int entero ;
        char letra ;
        double decimal ;
        
        cadena = JOptionPane.showInputDialog("digite una cadena"); // para la entrada de datos por ventana JOptionPane.showInputDialog
        //lo que yo meta en la ventana esta cuardado dentro de cadena ,showInputDialog es para un string 
        entero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero entero"));
         //Integer.parseInt convierte toda la cadena en un entero
        letra = JOptionPane.showInputDialog("digite un caracter").charAt(0);
        // letra es char , pero joptionpane de cadenas y no se puede guardar en un char asi que usamos el .charAt(0);
        decimal = Double.parseDouble (JOptionPane.showInputDialog("digite un numero decimal"));//con joption se utiliza . no ,
        // se utiliza el Double.parseDouble para convertir el joption en un double
        
        JOptionPane.showMessageDialog(null, "la cadena es "+cadena);//para salida de datos por ventana JOptionPane.showMessageDialog
        JOptionPane.showMessageDialog(null, "el numero entero es "+entero);
        JOptionPane.showMessageDialog(null, "la letra es "+letra);
        JOptionPane.showMessageDialog(null, "el numero decimal es "+decimal); 
        
        //la entreda en con un solo campo
        // salida llav alos 2 campos y uno es null
        
        
    }
    
}
