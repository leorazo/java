
package xxxcarrosescribirtxt;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Xxxcarrosescribirtxt {

        String marca;
	int velocidad;
		

	Xxxcarrosescribirtxt (){                                        
	marca="";
	velocidad=0;		
		}
		
	Xxxcarrosescribirtxt (String N,int V){                                        
	marca=N;
	velocidad=V;
		}
                
        // mketodos geter para dar informacion en el arreglo
                String get_marca()
		{return marca;}
		
		int get_velocidad()
		{return velocidad;}
                
                
    public static void main(String[] args) {
        // TODO code application logic here
        int maxt=0 , post=0 ,i;
         Xxxcarrosescribirtxt arrcarros []=new Xxxcarrosescribirtxt[3];  //estas creando un arreglo de 3 datos
	String marca;
        int vel;
        
         for (i=0;i<3;i++)
         
         {   marca = JOptionPane.showInputDialog("di la marca del carro");
             vel = Integer.parseInt(JOptionPane.showInputDialog("di la veloicdad del carro"));
             
             arrcarros [i]  =new Xxxcarrosescribirtxt (marca,vel);}
             
                //arrcarros [0]  =new Xxxcarrosescribirtxt ("nissan",100); // esta es un a forma estatica de meter la informacion 
		//arrcarros [1] = new Xxxcarrosescribirtxt ("bmw",200);
		//arrcarros [2] = new Xxxcarrosescribirtxt ("ferrari", 300);
			
        for (i=0;i<arrcarros.length;i++) 
		 {if (arrcarros [i].get_velocidad()>maxt) 
                    {maxt= arrcarros [i].get_velocidad();
                     post=i;}
		 }
        
        System.out.println("en java la velocidad maxima es de " +maxt+ " del carro " +arrcarros[post].get_marca());
      //////////////////////////////////////////////
      
      
        try{//apertura del try general
             
             
             //Escribimos en el fichero un String y un caracter 97 (a)
             try ( FileWriter fw = new FileWriter("velocidades.txt")) //Abro stream, crea el fichero si no existe
             {//apertura del try de escritura
                 fw.write("en txt la velocidad maxima es de " +maxt+ " del carro " +arrcarros[post].get_marca());
                      
             } //cierre del try de escritura
            
             
             
             //Leemos el fichero y lo mostramos por pantalla
             try ( FileReader fr = new FileReader("velocidades.txt"))//Abro el stream, el fichero debe existir y debe de existir dentro de la carpeta del proyecto
             {//apertura del try de escritura
                 int valor=fr.read();  //Leemos el fichero y lo mostramos por pantalla
                 while (valor!=-1)
                     {System.out.print((char)valor);
                     valor=fr.read();}              
             } //cierre del try de escritura
            
        } //cierre del try general
         
         catch(IOException e){
            System.out.println("Error ... necesitas ver mas bax: "+e);
        }
        
    }
    
}
