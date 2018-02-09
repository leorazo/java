package xxxdamas;

public class XXXdamas {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int j, sy=0, sx;
                
        int ejey [] = {0,0,1,2,5,6,7}, ejex [] = {0,2,4,6,1,3,5,7,0,2,4,6};
        
      for(j=0 ;j<24 ;j++ )
           
      { 
          if (0!=j%4){sy=sy+0;}
         else {sy++;}
          
          System.out.print(ejey [sy]);
           
          System.out.print(",");
          
          sx=j%12;
          System.out.print(ejex [sx]) ;
             
        System.out.print(",");
        
        if (j<12){System.out.println("r");}
         else {System.out.println("b");}
 
         }
        
    
}}
