package a4swichtsout;

import java.util.Scanner;

public class A4swichtsout {

    public static void main(String[] args) {
        // TODO code application logic here
        int caso;
        Scanner entrada = new Scanner (System.in);
        System.out.println("escoja un caso del 1 al 5");
    caso = entrada.nextInt();
    
    switch (caso){
        case 1:System.out.println("escogio el caso 1");         
        break;                                                                  
        case 2:System.out.println("escogio el caso 2");        
        break;
        case 3:System.out.println("escogio el caso 3");
        break;                                                                    
        case 4:System.out.println("escogio el caso 4");
        break;
        case 5:System.out.println("escogio el caso 5");
        break;
        default:System.out.println("escogio un caso no valido");
        }
    }
    
}
