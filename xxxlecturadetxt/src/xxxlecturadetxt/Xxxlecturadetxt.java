
package xxxlecturadetxt;
import java.io.*;
public class Xxxlecturadetxt {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        File f;
	f = new File("Archivo.txt");
	 
	//Escritura
	try{
	FileWriter w = new FileWriter(f);
	BufferedWriter bw = new BufferedWriter(w);
	PrintWriter wr = new PrintWriter(bw);  
	wr.write("Esta es una linea de codigo");//escribimos en el archivo
	wr.append(" - y aqui continua"); //concatenamos en el archivo sin borrar lo existente
	        //ahora cerramos los flujos de canales de datos, al cerrarlos el archivo quedará guardado con información escrita
	        //de no hacerlo no se escribirá nada en el archivo
	wr.close();
	bw.close();
	FileReader fr=new FileReader("Archivo.txt");
    //Leemos el fichero y lo mostramos por pantalla
    int valor=fr.read();
    while(valor!=-1){
        System.out.print((char)valor);
        valor=fr.read();
    }
    //Cerramos el stream
    fr.close();
	}
        
        catch(IOException e){};
	 }


}