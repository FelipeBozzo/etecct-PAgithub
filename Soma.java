package soma;
import java.util.Scanner;
public class Soma {

    public static void main(String[] args) {
int[][]Teste5 = new int[4][4];

Scanner in = new Scanner (System.in);

        int valor=0;
        
        for(int i=0;i<4;i++){
        for(int n=0;n<4;n++){
            System.out.println("Informe o valor para a coordenada ["+(i+1)+", "
            +(n+1)+"]");
            Teste5[i][n] = Integer.parseInt(in.nextLine());
            
        }
       }
        
        int coluna = [1],[1][],[];
        
        System.out.println();
        System.out.print("Essa é a soma de todos os elementos: "+valor);
        System.out.println();
        
    }
    
}
