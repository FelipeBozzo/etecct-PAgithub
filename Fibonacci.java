package fibonacci;
import java.util.Scanner;

public class Fibonacci {
        
    
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
         int I, O, II, OO, III, OOO;
         
         System.out.println("Informe por favor o número que deseja para que"
                 + " sejam subtraídos de si");
         System.out.println("Digite-os: ");
         I = dados.nextInt();
         System.out.println("Digite-os: ");
         O = dados.nextInt();
         System.out.println("Digite-os: ");
         II = dados.nextInt();
         System.out.println("Digite-os: ");
         OO = dados.nextInt();
         System.out.println("Digite-os: ");
         III = dados.nextInt();
         System.out.println("Digite-os: ");
         OOO = dados.nextInt();
        
         
         for(int n = 1; n<=I; n= I-O) {
               System.out.println("O resultado é: "+n);
               break;
         }
         for(int n = 1; n<=II; n= II-OO) {
               System.out.println("O resultado é: "+n);
               break;
         }
         for(int n = 1; n<=III; n= III-OOO) {
               System.out.println("O resultado é: "+n);
               break;
         }
         }
        }