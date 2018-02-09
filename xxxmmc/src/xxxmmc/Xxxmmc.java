package xxxmmc;

public class Xxxmmc {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1=3 ,num2=2, num3=6,i,mmc=1,max;
        max=num1*num2*num3;
        
        for (i=2;i<(max);i++)
            { if ((num1%i==0)||(num2%i==0)||(num3%i==0))
                {   if (num1%i==0)
                    {num1/=i;}
                    if (num2%i==0)
                    {num2/=i;}
                    if (num3%i==0)
                    {num3/=i;}
                    
                    
                    mmc*=i;}
            }
       System.out.println(mmc);
    }
    
}
