package coordenada;
import java.util.Scanner;

public class Coordenada {
    
public static void main(String[] args) {
int[][]Teste7 = new int[3][3];
        
        Scanner in = new Scanner (System.in);
        
       for(int i=0;i<3;i++){
        for(int n=0;n<3;n++){
            System.out.println("Informe o valor para a coordenada ["+(i+1)+", "
            +(n+1)+"]");
            Teste7[i][n] = Integer.parseInt(in.nextLine());
            
        }
       }
        
        for(int i = 0;i < Teste7.length;i++){
            for(int n = 0;n< Teste7.length;n++){
                System.out.print(Teste7[i][n]+ "   ");
            }
            System.out.println("   ");
        }
        
    }
    
}
    


    
        