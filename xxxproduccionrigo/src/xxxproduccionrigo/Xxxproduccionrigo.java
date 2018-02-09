
package xxxproduccionrigo;

public class Xxxproduccionrigo {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int ma=6000,  l1tma=20,   l2tma=30;
        int mq=4800 ,  l1tmq=30,   l2tmq=10;     //l1 es supuesto
        
        int l1ben=15,   l2ben=10 , ben;
        
        int l1 ,l2;
        int c1, a1,b1;
        int c2,a2,b2;
        int c3,a3,b3;
         
       // ma=l1tma+l2tma; sis de acuaciones
       // mq=l1tmq+l2tmq;
        
        
       c1= (-l2tmq)*(ma); 
       a1=l1tma*(-l2tmq);
       b1= l2tma*(-l2tmq);
        
       c2= (l2tma)*(mq); 
       a2=l1tmq*(l2tma);
       b2= l2tmq*(l2tma);
       
       c3=c1+c2;
       a3=a1+a2;
       b3=b1+b2;
       
       l1=c3/a3;
       
       l2=(ma-(l1tma*l1))/l2tma;
       
       ben=l1*l1ben+l2*l2ben;
       
       
        System.out.println("se produciran L1 "+l1+" y de L2 "+l2);
        System.out.println("los beneficios son $" +ben);
        
        //modifique el tiempo de l1 en tiempo de maquinado, porque el resultado debe 
        //ser positivo para que la produccion sea real
        
        
        
        
        
        
        
        
        
        
    }
    
}
