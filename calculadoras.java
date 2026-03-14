import java.util.Scanner;

public class calculadoras {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcao;

        do {

        System.out.println("========================================");
        System.out.println("       SISTEMA DE CALCULADORAS");
        System.out.println("========================================");
        System.out.println();   
        System.out.println("1 - Calculadora de CDI");
        System.out.println("2 - Operações Basicas");
        System.out.println("3 - Juros Compostos");
        System.out.println("4 - Histórico de Operações");
        System.out.println("5 - Sair");
        System.out.println();
        System.out.print("Escolha uma opção: ");
        
        opcao = input.nextInt();

        switch (opcao) {

            case 1:

        String decisao;
        
        do {
        
        System.out.println("========================================");
        System.out.println("        CALCULADORA DE CDI");
        System.out.print("========================================");
        System.out.println();
        System.out.print("Taxa CDI atual: 14.15% ao ano"); 
        System.out.println();   
        System.out.println();  
        System.out.printf("Digite o valor do saldo inicial: ");
        float saldo = input.nextFloat();

        System.out.printf("Digite o período (meses): ");
        int periodo = input.nextInt();

        double saldoFinal = saldo * (1 + ((14.15/100) / 12) * periodo);

        System.out.printf("Seu saldo final será de: R$ %.2f ", saldoFinal);
        System.out.println();
        System.out.println();
        System.out.println();

        input.nextLine();
        System.out.println("Deseja fazer outro calculo?(S / N)");
        decisao = input.nextLine();

        } while (decisao.equalsIgnoreCase("s"));
    

        System.out.println("Retorno ao menu");
        System.out.println();
        
        break;

        case 2:
       
        do {
        
        System.out.println("========================================");
        System.out.println("    CALCULADORA DE OPERAÇÕES");
        System.out.print("========================================");
        System.out.println();

        System.out.printf("Digite o primeiro valor: ");
        float valor1 = input.nextFloat();

        System.out.printf("Digite o segundo valor: ");
        float valor2 = input.nextFloat();

        System.out.printf("Escolha uma operação: \n + Soma \n - Subtração \n * Multiplicação \n / Divisão \n");
        System.out.print("---> : ");
        input.nextLine();
        String op = input.nextLine();

        switch (op) {
            case "+":
                System.out.printf("A soma entre %.2f e %.2f é: %.2f\n", valor1, valor2, valor1 + valor2);
                break;

            case "-":
                System.out.printf("A subtração entre %.2f e %.2f é: %.2f\n", valor1, valor2, valor1 - valor2);
                break;

            case "*":
                System.out.printf("A multiplicação entre %.2f e %.2f é: %.2f\n", valor1, valor2, valor1 * valor2);
                break;

            case "/":
                System.out.printf("A divisão entre %.2f e %.2f é: %.2f\n", valor1, valor2, valor1 / valor2);
                break;

            default:
                System.out.println("Houve Algum erro...");
        }
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Deseja fazer outro calculo?(S / N)");
        decisao = input.nextLine();

        } while (decisao.equalsIgnoreCase("s"));
    

        System.out.println("Retorno ao menu");
        System.out.println();
        
            break;

        case 3:

        String escolha;

            do {
                
           
        System.out.println("========================================");
        System.out.println("    JUROS COMPOSTOS");
        System.out.print("========================================");
        System.out.println();

        System.out.print("Digite o valor do capital inicial: ");
        float capitalAtual = input.nextFloat();
        System.out.print("Digite a taxa de juros (% ao mês): ");
        float taxaJuros = input.nextFloat();
        System.out.print("Digite o período (meses): ");
        int meses = input.nextInt();
        System.out.println();

        float capitalInicial = capitalAtual;
        for (int i = 0; i  < meses; i++) {
            capitalAtual += (capitalAtual * (taxaJuros/100));
            System.out.printf("Mês %d: R$ %.2f\n", i + 1, capitalAtual);
        }

        System.out.println();
        System.out.printf("Seu capital inicial foi de: R$ %.2f\n", capitalInicial);
        System.out.printf("Seu capital final do período foi de: R$ %.2f\n", capitalAtual);
        float lucro = capitalAtual - capitalInicial;
        System.out.printf("Seu lucro foi de:  R$ %2.f\n", lucro);
        System.out.println();
        System.out.println("Deseja fazer outro calculo?(S / N)");
        input.nextLine();
        escolha = input.nextLine();

         } while (escolha.equalsIgnoreCase("s"));

        System.out.println("Retorno ao menu");
        System.out.println();
        
        break;    

        case 4:

        break;

        case 5:
            input.close();
            break;

        default:
            System.out.println("Houve Algum erro, por favor selecione novamente...");
        }

        } while (opcao != 4);
    input.close();
    }
}