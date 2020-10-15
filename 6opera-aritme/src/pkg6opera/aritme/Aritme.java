package pkg6opera.aritme;

import java.util.Scanner;

public class Aritme {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        float numero1,numero2,suma,resta,mult,div,residuo;//cantidad de datos necesitados en memoria
        
        System.out.println("digite 2 numeros");
        
        numero1 = entrada.nextFloat();//cantidad de datos que vas a ingresar .netx...
        numero2 = entrada.nextFloat();
        
        suma = numero1+numero2 ;
        resta = numero1-numero2 ;
        mult = numero1*numero2 ;
        div = numero1/numero2 ;
        residuo = numero1%numero2 ;
        
        System.out.println("la suma es "+suma);
        System.out.println("la resta es "+resta);
        System.out.println("la mult es "+mult);
        System.out.println("la div es "+div);
        System.out.println("el residuo es "+residuo);
        
        //________________________________________
        Scanner entra = new Scanner (System.in);
        
        float numero4,numero5,numero6,suma2;        
        System.out.println("digite 3 numeros");
        
        numero4 = entra.nextFloat();//cantidad de datos que vas a ingresar .netx...
        numero5 = entra.nextFloat();
        numero6 = entra.nextFloat();
        
        
        suma2 = numero4+numero5+numero6;
        
        System.out.println("la suma es "+suma2);
        
    }
    
}
