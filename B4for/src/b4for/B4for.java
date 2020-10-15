// for (inicializacion ; condicion ; aumento ){acciones}
package b4for;

import java.util.Scanner;

public class B4for {

    public static void main(String[] args) {
        // TODO code application logic here
        int ite , tope;
        
        System.out.println("se imprimira del 1 hasta el numero superior que indiques");
        Scanner entrada = new Scanner(System.in);
        tope = entrada.nextInt();
        
        for (ite=1; tope>=ite; ite++)
        {System.out.println("secuencia de numeros "+ite);}
    }
    
}
