package b3dowhile;

import java.util.Scanner;

public class B3dowhile {

    public static void main(String[] args) {
        // TODO code application logic here
        int ite=1, tope;
        
         System.out.println("se imprimira del 1 hasta el numero superior que indiques");
        Scanner entrada = new Scanner(System.in);
        tope = entrada.nextInt();
        
       do {     
       System.out.println("secuencia de numeros "+ite);
       ite++;}
        
        while (tope>=ite) ;
       
    }
    
}
