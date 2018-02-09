package javaapplication22;

public class factorizacion {

    public static void main(String[] args) {
        // TODO code application logic here
     
        int x,entrada=121,i,ii;
        
        x=entrada;
        
        for (ii=2;ii<=x;ii++)
        {   for (i=2;i<=x;i++)
            {   if (i==1){break;}
         
            if ((entrada%i)==0)
            {entrada/=i; System.out.println(i);}
        
            }
        }
        
        }
            
            
        
    }
    

