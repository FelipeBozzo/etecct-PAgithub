
package jogodeperguntas;
import java.util.Scanner;
public class JogodePerguntas {

    public static void main(String[] args) {
    String resposta;
       Scanner jogo = new Scanner(System.in);
       
        System.out.println("Na programação Java, quando declaramos um número inteiro, a variável é int. Mas quando declaramos um número quebrado, sua variável é?");
        System.out.println("double");
        System.out.println(".equals");
        System.out.println("int");
        System.out.println("String");
      resposta=jogo.next();
      if (resposta.equals("double"))
      {
      System.out.println("Nas aulas de PA nos foi apresentado uma variável para palavras, e ela é?");
        System.out.println("String");
        System.out.println(".equals");
        System.out.println("int");
        System.out.println("var");
        System.out.println("Reescreva a correta");
      }
       else {
        System.out.println("Resposta incorreta, recomece");
        }
      
      resposta=jogo.next();
            if (resposta.equals("String")) 
                    {
                        System.out.println("Parabéns, você tem prestado atenção nas aulas");
                    }
            else {
        System.out.println("Resposta incorreta, recomece");
        }
        }
   } 

