
package newpackage;

import java.io.*;

public class ObjetosClase {
    
      public static void crearFichero(Curso[] asignatura) {
        FileOutputStream fos = null;
        try {
            File fichero = new File("fichero.obj");
            fos = new FileOutputStream(fichero);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            escribirFichero(oos, asignatura);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
 
    public static void escribirFichero(ObjectOutputStream oos, Curso[] asignatura) throws Exception {
 
        System.out.println("Volcando el array al fichero");
 
        for (int i = 0; i < asignatura.length; i++) {
            oos.writeObject(asignatura[i]);
        }
 
        System.out.println("Volcado finalizado con Exito");
 
    }
 
    public static void rellenarArray(Curso[] asignatura) {
 
        asignatura[0] = new Curso("Programacion");
        asignatura[1] = new Curso("Lenguajes de Marcas");
        asignatura[2] = new Curso("Bases de Datos");
        asignatura[3] = new Curso("Entornos de Desarrollo");
        asignatura[4] = new Curso("Sistemas InformÃ¡ticos");
        asignatura[5] = new Curso("Formación y Orientación Laboral");
 
        System.out.println("** Notas almacenadas en el array **");
 
    }
 
    public static void leerFichero() {
        FileInputStream fis = null;
        try {
            File fichero = new File("fichero.obj");
            fis = new FileInputStream(fichero);
            ObjectInputStream ois = new ObjectInputStream(fis);
            mostrarFichero(ois);
 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
 
    public static void leerFicheroParaCalcular() {
        FileInputStream fis = null;
        try {
            File fichero = new File("fichero.obj");
            fis = new FileInputStream(fichero);
            ObjectInputStream ois = new ObjectInputStream(fis);
 
            calcularMedia(ois);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
 
    public static void mostrarFichero(ObjectInputStream ois) throws Exception {
        Curso asignatura;
        System.out.println(" ...Leyendo el fichero.....");
        //for (int i=0; i<6;i++) {
        while (true) {
            asignatura = (Curso) ois.readObject();
 
            System.out.println(asignatura.getNombre());
            System.out.println(asignatura.getNota());
 
        }
 
    }
 
    public static void calcularMedia(ObjectInputStream ois) throws Exception {
        Curso asignatura;
        double media = 0, mediaFinal;
        System.out.println(" ...calculando media....");
        try {
            while (true) {
                asignatura = (Curso) ois.readObject();
                media = media + asignatura.getNota();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        mediaFinal = media / 6;
        System.out.println("Su nota media del curso es de: " + mediaFinal);
 
    }
 
    public static void main(String[] args) {
        Curso[] asignatura = new Curso[6];
        rellenarArray(asignatura);
        crearFichero(asignatura);
        leerFichero();
        leerFicheroParaCalcular();
    }
 
}
    
    
    

