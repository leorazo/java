//si trabajas menos de 40 horas a la semana $16xh
//si trabajas mas de 40 horas a la semana $16xh horas extras $20
package a6ifelse4;

import javax.swing.JOptionPane;
import sun.awt.image.IntegerInterleavedRaster;

public class A6ifelse4 {

    public static void main(String[] args) {
        // TODO code application logic here
        int horsem , sueldo , hext;
        
        horsem = Integer.parseInt(JOptionPane.showInputDialog("cuantas horas a la semana trabajaste")) ;
        
        if (40 >= horsem) 
        {horsem*=16; 
        JOptionPane.showMessageDialog(null, "tu sueldo es"+horsem );}
        
          else 
        {sueldo =40*16; 
        hext =(horsem-40)*20;
        JOptionPane.showMessageDialog(null, "tu sueldo es"+sueldo+ "y por horas extras"+hext );
   
    }
    
}}
