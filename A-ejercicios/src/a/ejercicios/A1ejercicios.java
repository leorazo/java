package a.ejercicios;

import java.util.Scanner;

public class A1ejercicios {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in) ;
        double cal_1, cal_2,cal_3,suma;
        
        System.out.println("mete las 3 calificaciones . anotar con , y despues espacio para la siguiente ");
        
        cal_1 =entrada.nextDouble();//cuando se anota asi la entrada de datos se debe 
        cal_2 =entrada.nextDouble(); //de dar entrada con , y despues espacio
        cal_3 =entrada.nextDouble();
        
        suma=cal_1+cal_2+cal_3;
        
        System.out.println("las calificacion 1 es "+cal_1);
        System.out.println("las calificacion 2 es "+cal_2);
        System.out.println("las calificacion 3 es "+cal_3);
        System.out.println("la suma de calificaciones es "+suma);
        //_____________________________________________________________________________________________
        
         Scanner entrada2 = new Scanner (System.in) ;
        double horas , salxh ,salredon;
        
        System.out.println("horas trabajadas a la semana ");
        horas =entrada2.nextDouble();//cuando se anota asi la entrada de datos se debe 
        
        
        System.out.println("salario que recibe por hora trabajada ");
        salxh =entrada2.nextDouble();
       
        salredon = Math.round(horas*salxh);
        
        System.out.println("sus horas trabajadas en la semana son "+horas);
        System.out.println("su sueldo por hora es "+salxh);
        System.out.println("su sueldo semanal es "+salredon);
        //_________________________________________________________
        
        System.out.println("cuantos dolares tiene guillermo");
        Scanner dineroentrada = new Scanner (System.in) ;
        double guillermo, luis , juan , sumdinero ;
        
        guillermo =dineroentrada.nextDouble();
        
        luis = guillermo/2 ;
        juan = (guillermo+luis)/2;
        sumdinero =guillermo+luis+juan;
        
        System.out.println("total de dolares guillermo "+guillermo);
        System.out.println("total de dolares luis "+luis);
        System.out.println("total de dolares juan "+juan);
        System.out.println("el total de dolares que tienen es de "+sumdinero);
        
        //___________________________________________________
        double carrosvendidos , montocarros$ ,comision150,comision5,sueldoneto;
        final double sueldovendedor = 100;
        System.out.println("introducir el total de carros vendidos por el vendedor");
        Scanner entrada3 = new Scanner (System.in) ;
        carrosvendidos = entrada3.nextDouble();
                  
        System.out.println("introduce el monto de los carros vendidos");
         montocarros$ = entrada3.nextDouble();
        
        comision150=carrosvendidos*150;
        comision5 = montocarros$*0.05;
        sueldoneto = sueldovendedor+comision150+comision5;
        
        
        System.out.println("se vendieron " +carrosvendidos+ " carros");
        System.out.println("el monto de venta es " +montocarros$+ "$");   
        System.out.println("sueldo mensual es " +sueldovendedor+ "$"); 
        System.out.println("su comision por c/u carro vendido es de "+comision150+ "$");
        System.out.println("su comision del 5% vendido es de "+comision5+ "$");
        System.out.println("salario neto es de "+sueldoneto+ "$");
    }
    
}
