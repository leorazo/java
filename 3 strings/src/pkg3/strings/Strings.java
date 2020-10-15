
package pkg3.strings;

import java.io.IOException;


public class Strings {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        String cad1= "Sabado tarde", cad2;
    cad2 = cad1;
    if (cad1.equals(cad2)) // esta condición es true  Si la comparación se hubiese hecho con el operador relacional ==, el resultado
                                            //sería falso porque el operador equipara las referencias
    System.out.println(cad1 + " = " + cad2);
    boolean si =(cad1==cad2);
      

String mayus;
char []vmay = new char[26];
for (int j = 0; j<26; j++)
{vmay[j] = (char)('A'+j);}
mayus = new String(vmay);  //cuando se crea un objeto aqui es dond ese pone el parametro

        System.out.println(mayus);
        
        
        //hacer un vector un string
        String cad;
char vc[] = {'L','a',' ','m','u','s','i','c','a'};
cad = new String(vc,3,5);  //constructorara
System.out.println(cad); // en pantalla sale: musica   (vc,posInicial, numElementos);

String cdb;
byte bc[] = {'J','u','l','i','a'};
cdb = new String(bc,0);      //salida que no sea en ascii

        System.out.println(cdb);
        
        String cdbr;
byte bcd[] = {'E','s','p','e','r','a','n','z','a'};
cdb = new String(bcd,0,2,5);         //puede generar una salida que no sea ASCII
System.out.println(cdb);       // en pantalla sale: peran  (bit , ini,fin)



//lectura y los hace ascii  pero si casteas si se puede hacer algunos cambios
int car;

System.out.println("\nIntroduce el un numero");
car = System.in.read();
        System.out.println("numero introducido es " + car);


        
        //asi se hacen mayusculas
        String hol="hola";
        String mas = hol.toUpperCase();
        System.out.println(mas);
        
           //asi se hacen minuscula
        String HO="HOLA";
        String MAS = HO.toLowerCase();
        System.out.println(MAS);
        
        
        
        //concatena
        String dst = "Desconocido";
        String org = " Rutina";
        System.out.println("Concatena = " + dst.concat(org));


        //de dtring a cadena de caracteres
        String bs = "Hoy puede ser un buen día";
        char ds[] = new char[10];
        bs.getChars(0,2,ds,0); // (inicio, fin , donde copiar , posicion de inicio de copeo)
        
        
        //posiciones especificas
        String dc = "Terminal inteligente";
        System.out.println(dc.substring(3,8)); //  (inicial final)
        System.out.println(dc.substring(3));  //   (inicio , hasta el final)
        
        //comparacion de string
        String c1 = "Universo Java";
        String c2 = "Universo Visual J";
        int i;
        i = c1.compareTo(c2); /* i toma un valor negativo ya que el carácter
        'J' de c1 es anterior al carácter 'V' de c2 y los anteriores son
        iguales.
        */
        
        
        //= pero ignora min y mas
        String nom = "Esperanza";
         // true no distingue tipo de letra
         boolean dif;
        dif = (nom.equalsIgnoreCase("esperanzA"));
        System.out.println(dif);
        
        //comparaciond e regiones
        String dato = "Region recreativa de las jaras";
        dato.regionMatches(true,7,"Recreo",0,3);
        //(boolean ,pos ini 1 string , 2 string ,pos ini 2,pos fin 2 )
        
        
        //inicia con
        String ft = new String("Felicidades");
        if (ft.startsWith("Fel"))   //el string con que inicia
        System.out.println("Cadena " + ft+ " comienza por Fel");
        
        //termina con
        String ter = new String("Felicidades");
        if (ter.startsWith("des"))   //el string con que inicia
        System.out.println("Cadena " + ter+ " termina por des");
        
        
        //elimina espacios al inicio o/y al final
        String orga = " Vive los momentos ";
        String det;
        det = orga.trim();// det referencia a la cadena: "Vive los momentos"
        System.out.println(det);
        
        
        //remplazo de caracteres
        
        String pue = "El pueblo del valle";
        System.out.println(pue.replace(' ','#'));  //(el que vas a cambiar , nuevo caracter)
        
        
        //meter un string en un arreglo
        String ven = "Ventana";
        char [] ac = ven.toCharArray();// ac tiene los caracteres de ven       
        System.out.println(ac);
        
        //convertir datos a string
        int k = -12;
        System.out.println("Entero k: " + String.valueOf(k)); //funciona para mas datos primitivos
        
        //busca la cantidad de veces que sale un caracter
        String pat = "Java, lenguaje de alto nivel";
        k = pat.indexOf('v');     //(valor a buscar , desde que posicion)  tambien puedes buscar sub strings
        System.out.println(k);
    
        
        //indica la posicion de la ultima ocurrencia de lo que buscas , va del final al inicio
        String cadena = "----x----x----";
        k = cadena.lastIndexOf('x');  //(valor a buscar , desde que posicion)  tambien puedes buscar sub strings
        System.out.println("Subcadena a partir de posición k: " + k);
        
      
    }
    
}
