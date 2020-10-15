// while (condicion) {accion}
package b2while;

import java.util.Scanner;

public class B2while {

    public static void main(String[] args) {
        // TODO code application logic here
        int ite=1, tope;
        
        System.out.println("se imprimira del 1 hasta el numero superior que indiques");
        Scanner entrada = new Scanner(System.in);
        tope = entrada.nextInt();
        
        while (tope>=ite) 
        {System.out.println("secuencia de numeros "+ite); // primero hace la impresion
        ite++;}                                           //despues hace el aumento y lo guarda en la condicion o ultimo espacio en memoria
    }
    
}
