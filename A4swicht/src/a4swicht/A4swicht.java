package a4swicht;

import javax.swing.JOptionPane;

public class A4swicht {

    public static void main(String[] args) {
        // TODO code application logic here
          int caso;
    
    caso = Integer.parseInt(JOptionPane.showInputDialog("escoja un caso del 1 al 5"));
    
    switch (caso){
        case 1:JOptionPane.showMessageDialog(null, "escogio es caso 1");         //switch (variable){caso 1: accion; break; 
        break;                                                                   //....cason: accion; break; }
        case 2:JOptionPane.showMessageDialog(null, "escogio es caso 2");         //default accion;
        break;
        case 3:JOptionPane.showMessageDialog(null, "escogio es caso 3");
        break;                                                                    // si se cumple la condicion para de accionar
        case 4:JOptionPane.showMessageDialog(null, "escogio es caso 4");
        break;
        case 5:JOptionPane.showMessageDialog(null, "escogio es caso 5");
        break;
        default:JOptionPane.showMessageDialog(null, "escogio un caso no valido");
        }
    //_______________________________________________
    
    }
    
}
