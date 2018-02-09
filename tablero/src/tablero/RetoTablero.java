package tablero;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class RetoTablero extends JPanel {
   
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public RetoTablero(int capacidad) {
    
    
  
  
JButton[][] botones;
botones = new JButton[capacidad][capacidad];

// SE CREA UN OYENTE DE ACCIONES Y SE LE PASA EL
// PANEL COMO ARGUMENTO
OyenteAcciones oyenteAcciones = new OyenteAcciones(this);

for (int i = 0; i < botones.length; i++) {
for (int j = 0; j < botones[i].length; j++) {
botones[i][j] = new JButton();

// SE CREAN LOS BOTONES Y SE ESTABLECE SU TAMAÑO PREFERIDO
botones[i][j].setPreferredSize(new Dimension(30, 50)); // dimension horizontal y dimension vertical 

if ((i + j + 1) % 2 == 0) {   //condicion dentro de la matriz para hacer una celda negra
botones[i][j].setBackground(Color.BLACK);} // color de la celda

else {botones[i][j].setBackground(Color.RED);}// color de la celda


botones[i][j].addActionListener(oyenteAcciones);//si se borra no comunica el comando de es blanco ,, nrego etc
add(botones[i][j]); //si lo quitas no se agregan botones
}


setLayout(new GridLayout(capacidad, capacidad));

}

}

class OyenteAcciones implements ActionListener {
private JPanel panel;

public OyenteAcciones(JPanel panel) {
this.panel = panel;
}

@Override
public void actionPerformed(ActionEvent e) {
// Se obtiene el color del boton pulsado
JButton boton = (JButton) e.getSource();

String color;
if (boton.getBackground() == Color.BLACK) { //si presionas un boton segun su color de back ground
color = "negro";} //aqui se escribe a mano el color
else {color="rojo";} //note que no se ponen else asi que lo incluyo

JOptionPane.showMessageDialog(panel, "Se ha pulsado un cuadro con color " + color, " Cuadro pulsado",
JOptionPane.INFORMATION_MESSAGE);
}

}

public static void main(String[] args) {
     int entero;
  entero= Integer.parseInt(JOptionPane.showInputDialog("de que tamaño quieres el tablero"));
  
JFrame ventana = new JFrame("Tablero de ajedrez MIMI");//titulo de la ventana
RetoTablero tablero = new RetoTablero(entero); // tamaño del tablero
ventana.add(tablero);
ventana.pack();
ventana.setVisible(true); //hacer visible al ventana
}
}
