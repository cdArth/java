/**
 * calculadora
 */
/**
 * calculadora
 */
import java.io.Console;

 public class calculadora {

         public static void Menu(double num1)

        {
            Console cnsl = System.console();

            if (num1 == 0)
            {
                System.out.println("Digite o primeiro número:");
                num1 = Double.parseDouble(cnsl.readLine());
            }
            

            System.out.println("Digite o segundo número:");
            double num2 = Double.parseDouble(cnsl.readLine());


            System.out.println("Escolha uma opção:");
            System.out.println("so - somar");
            System.out.println("s - subtrair");
            System.out.println("m - multiplicar");
            System.out.println("d - dividir");
            System.out.println("a- Apagar");
            System.out.println("Para sair, digite sair...");
            System.out.println("Sua opção? ");
            String resposta = cnsl.readLine("Resposta: ");

            Calculo(num1, num2, resposta);
            
        }

        public static void Calculo(double num1,double num2, String resposta)
        {
            double final1;
            Console cnsl = System.console();
            switch (resposta)
            {
                case "so":
                    final1 = num1 + num2;
                    System.out.println("Seu resultado: {num1} + {num2} = " + final1);
                    Menu(final1);
                    break;
                case "s":
                    final1 = num1 - num2;
                    System.out.println("Seu resultado: {num1} - {num2} = " + final1);
                    Menu(final1);
                    break;
                case "m":
                final1 = num1 * num2;
                System.out.println("Seu resultado: {num1} * {num2} = " + final1);
                    Menu(final1);
                    break;
                case "d":
                    final1 = num1 / num2;
                    System.out.println("Seu resultado: {num1} / {num2} = " + final1);
                    Menu(final1);
                    break;
                case "a":
                    Menu(0);
                    break;
                case "sair":
                    System.out.println("Saindo...");
                    cnsl.readLine();
                    break;                    
                default:
                    break;

            }
            
        }

        public static void Main(String[] args)
        {
            
            
            System.out.println("Calculadora Console");
            Menu(0);
            
            
            
            
        }
    }
 