package torresdehanoi;

public class TORRESDEHANOI {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] torre1 = new int[4];  
        torre1 [0]=4;
        torre1 [1]=3;
        torre1 [2]=2;
        torre1 [3]=1;
        
         int torre2[]=new int [4];
         int torre3[]=new int [4];
         
        int cont1=0,cont2=1,cont3=1,i;
          
     for (i=0;4>i;i++)
     {if (torre1[i]>0)
     {cont1=cont1+1;}
     if (torre2[i]>0)
     {cont2=cont2+1;}
     if (torre3[i]>0)
     {cont3=cont3+1;}
     }
        cont1=cont1-1;
       cont2=cont2-1;
        cont3=cont3-1;
        
       
    if (torre1[cont1]>torre2[cont2])
    {torre2[cont2]=torre1[cont1];
     torre1[cont1]=0;}
   
    
     if (torre1[cont1]>torre3[cont3])
     {torre3[cont3]=torre1[cont1];
     torre1[cont1]=0;}
     
     if (torre2[cont2]>torre1[cont1])
     {torre1[cont1] =torre2[cont2];
     torre2[cont2]=0;}
     
     if (torre2[cont2]>torre3[cont3])
     {torre3[cont3] =torre2[cont2];
     torre2[cont2]=0;}
     
     if (torre3[cont3]>torre1[cont1])
     {torre1[cont1] =torre3[cont3];
     torre3[cont3]=0;}
     
     if (torre3[cont3]>torre2[cont2])
     {torre2[cont2] =torre3[cont3];
     torre3[cont3]=0;}
     
   
  
      System.out.println(torre1[cont1]+" "+torre2[cont2]+" "+torre3[cont3]);
     
        
         }
        
   
            
                 
         
    }
    

