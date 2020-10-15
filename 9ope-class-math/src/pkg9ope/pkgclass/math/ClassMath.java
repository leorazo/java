package pkg9ope.pkgclass.math;
public class ClassMath {
public static void main(String[] args) {
        double raiz = Math.sqrt(9); // funcion de raiz "revisar para variables
        
        double base = 5 , expo = 2; 
        double potencia = Math.pow(base, expo);// primero se pone la base luego el expo
        
        double numero = 4.56 , redondeo = Math.round(numero); // redondeo , 
        //verifica tipo de entrada y salida float int long double
        
        double valorrandom = Math.random();//verificar tipo de vaiable
        
        System.out.println("la raiz del numero es "+raiz);
        
        System.out.println("la potencia es "+potencia);   
        
        System.out.println("el redonde de " +numero+ " es " +redondeo);  //impresion variable y texto 
         
        System.out.println("aleatorio es "+valorrandom);
    }
    
}
