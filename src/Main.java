import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicita ao usuário os dois números a serem operados
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // solicita ao usuário a operação a ser realizada
        System.out.print("Escolha a operação a ser realizada:\n"
                + "1 - Soma\n"
                + "2 - Subtração\n"
                + "3 - Multiplicação\n"
                + "4 - Divisão\n"
                + "5 - Exponencial\n"
                + "Opção: ");
        int opcao = scanner.nextInt();

        // realiza a operação escolhida pelo usuário
        double resultado = 0.0;
        switch (opcao) {
            case 1:
                resultado = Soma.calcular(num1, num2);
                break;
            case 2:
                resultado = Subtracao.calcular(num1, num2);
                break;
            case 3:
                resultado = Multiplicacao.calcular(num1, num2);
                break;
            case 4:
                resultado = Divisao.calcular(num1, num2);
                break;
            case 5:
                resultado = Exponencial.calcular(num1, num2);
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        // mostra o resultado
        mostraInfo(opcao, num1, num2, resultado);
    }

    private static void mostraInfo(int opcao, double num1, double num2, double resultado) {
        String operacao = "";
        switch (opcao) {
            case 1:
                operacao = "soma";
                break;
            case 2:
                operacao = "subtração";
                break;
            case 3:
                operacao = "multiplicação";
                break;
            case 4:
                operacao = "divisão";
                break;
            case 5:
                operacao = "exponencial";
                break;
        }
        System.out.println(String.format("O resultado da %s de %f e %f é: %f", operacao, num1, num2, resultado));
    }
}