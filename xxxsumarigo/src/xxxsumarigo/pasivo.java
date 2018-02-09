
package xxxsumarigo;


public class pasivo implements activo.onResultPro  {
    
    public Pasivo ()
    { Activo activo  =new Activo(this.2,3);
    }
    
    @Override
    public void onResultGet (double resultado)       
    {System.out.println("el resultado es "+resultado);}
    
     @Override
    public void onResultFail ()
    {}
    
    
}
