
package newpackage;

import java.util.*;
import java.io.*;

public class Curso implements Serializable{ 
      private String nombre;
    private double nota;
 
    public Curso(String nombre) {
        this.nombre = nombre;
        establecerNota();
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public double getNota() {
        return nota;
    }
    public  void  establecerNota() {
        Scanner teclado = new Scanner(System.in);
 
        do {
            System.out.println("Introduce la nota de " + getNombre() + " : ");
            nota = teclado.nextDouble();
 
            if ((nota < 0) || (nota > 10)) {
                System.out.println("nota no valida");
 
            }
 
        } while ((nota < 0) || (nota > 10));
 
    }
}
    

