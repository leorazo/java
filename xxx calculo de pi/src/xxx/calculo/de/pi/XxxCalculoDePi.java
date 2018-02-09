
package xxx.calculo.de.pi;

public class XxxCalculoDePi {

    public static void main(String[] args) {
        // TODO code application logic here
        long pi=2;
	
	for (int i=2;i<5;i=+2)
	{
		pi=pi*(i/(i-1));
		pi=pi*(i/(i+1));
	}
	
        System.out.println(pi);
	
    
    }
    
}
