package a8switch4ope;

import javax.swing.JOptionPane;

public class A8switch4ope {

    public static void main(String[] args) {
        // TODO code application logic here
        float prim, seg,suma , resta , div , mul;
        char letra;
        
        letra = JOptionPane.showInputDialog("que operacion desea hacer +-*/ srmd SRMD").charAt(0);
       prim = Float.parseFloat(JOptionPane.showInputDialog("introduce el primer numero"));
        seg = Float.parseFloat(JOptionPane.showInputDialog("introduce el segundo numero" ));
        
       
       switch (letra){
       case 's':
       case 'S':suma=prim+seg;
       JOptionPane.showMessageDialog(null, "el resultado de la suma es "+suma);
       break;
       
       case 'r':
       case 'R':resta=prim-seg;
       JOptionPane.showMessageDialog(null, "el resultado de la resta es "+resta);
       break;
       
       case 'm':
       case 'M':mul=prim*seg;
       JOptionPane.showMessageDialog(null, "el resultado de la multiplicacion es "+mul);
       break;
       
       case 'd':
       case 'D':div=prim/seg;
       JOptionPane.showMessageDialog(null, "el resultado de la division es "+div);
       break;
       default:JOptionPane.showMessageDialog(null, "operacion no valida");
       
       }
        
        
        
    }
    
}
