package pkg4entradadedatos;

import java.util.Scanner; //libreria para usar el scanner

public class entrada {

    public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in) ; //funcion para netrada de datos
        int numero; //creacion de un espacio para entrada de tipo int
        System.out.println("introduce un numero");
        numero = entrada.nextInt(); // el next al final se aclara el tipo de variable al que se le va dar entrada
        System.out.println("el nuemero es " +numero );
        //_________________________________________________________________________________
         Scanner entradadecadena = new Scanner (System.in) ; 
        String nombre; // String siempre en mayuscula la S sino causa problemas
        System.out.println("escribe tu nombre");
        nombre = entradadecadena.next(); // next guarda hasta que hay espacio
        System.out.println("tu nombre es " +nombre );
        //_______________________________________________________
        Scanner edadentrada = new Scanner (System.in) ; 
        int edad ; 
        System.out.println("escribe tu edad");
        edad = edadentrada.nextInt() ; 

        Scanner nombresentrada = new Scanner (System.in) ; 
        String nombres ; 
        System.out.println("escribe tu nombre completo");
        nombres = nombresentrada.nextLine(); // next (); es una entrada de cadena hasta un espacio , usar mejor nextLine ();       
        
        System.out.println("tu edad es de " +edad );  
        System.out.println("tu nombre es " +nombres );
        //________________________________
        Scanner letraentrada = new Scanner (System.in) ; 
        char sexo ; 
        System.out.println("tu sexo es femenino f o masculino m");
        sexo = letraentrada.next().charAt(0) ;  
        /* todo esto es para un caracter "next().charAt(0) ;" 
        charat (0) solo imprime un digito , si es 1 imprime 2 etc etc */
        System.out.println("tu sexo es " +sexo );  
     
    }
    
}
