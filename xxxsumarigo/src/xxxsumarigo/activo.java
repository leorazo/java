
package xxxsumarigo;


public class activo {
    public Activo (onResultPro claseQueLlama ,int a , int b)
    {claseQueLlama.onResultGet(a+b);
    }
    
    public interface onResultPro
            
    {public void onResultGet (double Resultado);
            public void onResultFail ();}
    
    
}
