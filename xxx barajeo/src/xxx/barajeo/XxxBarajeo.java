package xxx.barajeo;

public class XxxBarajeo {

    public static void main(String[] args) {
        // TODO code application logic here
        
        String matriz [][] =new String [2][56];
        String simbolo [] ={"A","1","2","3","4","5","6","7","8","9","10","J","Q","K"};
        int a,contador=0;
        
        
        for ( a=0;a<=13;a++)
             {matriz [1][a]="corazones";
              matriz [1][a+14]="diamantes";
              matriz [1][a+28]="trebol";
              matriz [1][a+42]="espadas";
              
              matriz [0][a]=simbolo[a];
              matriz [0][a+14]=simbolo[a];
              matriz [0][a+28]=simbolo[a];
              matriz [0][a+42]=simbolo[a];
              
              
              } 
        
                // metodo de barajeo
              while (contador<54)
              {
              int ram=(int)Math.round(Math.random()*54);
              
              if (!"0".equals(matriz [0] [ram])) //si la posicion dada es diferente de 0
              {
              System.out.println(matriz [0] [ram]+ " " +matriz [1] [ram]);
              matriz [0] [ram]="0";
              matriz [1] [ram]="0";
              
              contador++;
              }
           
                   
              
              }

    }
    
}