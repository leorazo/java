
package pkg8ordendeasignacion;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
         int x= 5, y;  
        y = x++ ; // 
    System.out.println("el valor de y = "+y );  // y=5 ,primer se realiza la asignacion de x y ahi termina el proceso
    System.out.println("el valor de x = "+x) ;   // x=6, aqui si se aplica el incremento
       
      int w=10 , z;
      z=++w;
    System.out.println("el valor de w = "+w );  // w=11,  primero se realiza el incremento se guarda en w y despues en z
    System.out.println("el valor de z = "+z) ; // z=11 ,z si guarda el incremento debido al orden dado
        
    }
    
}
