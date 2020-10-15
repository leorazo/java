package a5masminchar;                                      //el programa te dice si una letra es mayuscula o minuscula
                                                           //Character.isUpperCase(variable) devuelve un valor booleano 
import javax.swing.JOptionPane;                            // que indica si es mayuscula o no

public class A5masminchar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char letra;
       letra = JOptionPane.showInputDialog("entroduce solo una letra mayuscula o minuscula").charAt(0);
       
       if (Character.isUpperCase(letra)){JOptionPane.showMessageDialog(null, "la letra es mayuscula"); }
       else {JOptionPane.showMessageDialog(null, "la letra es minuscula");}
    }
    
}
