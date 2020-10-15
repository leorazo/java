package a2ejercicios;

import java.util.Scanner;

public class A2ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int asis, pexam, sexam, examf , calf;
          Scanner entrada = new Scanner (System.in) ;
          
        System.out.println("calificacion de la asistencia");
        asis=entrada.nextInt();
        System.out.println("calificacion del primer examen");
        pexam=entrada.nextInt();
        System.out.println("calificacion del segundo examen");
        sexam=entrada.nextInt();
        System.out.println("calificacion del examen final");
        examf=entrada.nextInt();
        
        asis *= 0.10;//asis = asis * 0.2
        pexam *= 0.25;//asi se anota si las variables de la operacion anterior 
        sexam *= 0.25; //no las vas a ocupar
        examf *= 0.40;
        
        calf = asis+pexam+sexam+examf;
        
        System.out.println("la calificacion final es " +calf);
        //_________________________________________________
        
        System.out.println("este programa te da el valor de un binomio cuadrado perfecto");
        float a , b , resultado;
        
         System.out.println("el valor de a es");
        a=entrada.nextFloat();
        
        System.out.println("el valor de b es");
        b=entrada.nextFloat();
        
        resultado = (float) Math.pow(a,2)+(2*a*b)+(float) Math.pow(b,2);
        
        System.out.println("el resultado es "+resultado);
        //_____________________________________________________________
        
          System.out.println("este programa te da semanas dias y horas cuando das las cantidad de horas");
        int horast ,semanas ,dias,horas;
        
        System.out.println("total de horas ");
        horast=entrada.nextInt();
        
       semanas = horast/168;
       dias =(horast%168)/24;
       horas = horast%24;
       
        System.out.println("las semanas son "+semanas);
        System.out.println("los dias son "+dias);
        System.out.println("las horas son "+horas);
        //_________________________________________________________
        
        System.out.println("este programa resuelve una ecuacion de 2 grado");
        double A,B,C,RES1,RES2;
        
        System.out.println("valor de coeficiente de a ");
        A =entrada.nextInt();
        System.out.println("valor de coeficiente de b ");
        B =entrada.nextInt();
        System.out.println("valor de coeficiente de c ");
        C =entrada.nextInt();
        
        RES1=((double) Math.sqrt((B*B)+(4*A*C))+(-B))/(2*A) ; //formulas para ecuacion de 2 grado
        RES2=((-B)+((-1)*(double) Math.sqrt((B*B)+(4*A*C))))/(2*A) ;
       
        System.out.println("el resultado es "+RES1);
        System.out.println("el resultado es "+RES2);
                
        
        
        
    }
    
}
