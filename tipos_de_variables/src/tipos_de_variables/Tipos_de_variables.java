
package tipos_de_variables;

public class Tipos_de_variables {

    public static void main(String[] args) {
        // TODO code application logic here
        byte entero = 12 ;  //valor de -128 a 127
        short numerocorto = 5222 ; //valor de -32768 a32767
        int numeromedio = 44751 ; //valor de -2147463468 a 2147463467
        long numerolargo = 7841582 ; //valor de ... muy largo
        
        float decimal = 2.55f ;  //valores extensos , de preferencia usar antes que el double , usar coma
        double decimallargo = 3.45121 ; //valores decimales muy muy largo , casi no usar , usar coma
        
        char caracter = 'L' ;//solo acepta un caracter
        
        boolean desicion = true ; //operador booleano true false
        
        String palabra = "leonardo razo islas" ; // variable no primitiva , acepta cadena de valores 
        
        System.out.println("numero estero: " +entero);
         System.out.println("numero estero: " +numerocorto);
         System.out.println("numero estero: " +numeromedio);
         System.out.println("numero estero: " +numerolargo);
         
         System.out.println("numero decimal: " +decimal);
         System.out.println("numero decimal: " +decimallargo);
         
         System.out.println("captura de letra: " +caracter);
         
         System.out.println("valor booleano: " +desicion);
         
         System.out.println("mi nombre es " +palabra);
    }
    
}
