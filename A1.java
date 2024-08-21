import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[5];
        double soma = 0;

        // Leitura dos valores
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
            soma += valores[i];
        }

        // Cálculo da média
        double media = soma / valores.length;

        // Exibição dos valores e da média
        System.out.println("Valores digitados:");
        for (double valor : valores) {
            System.out.println(valor);
        }
        System.out.printf("A média aritmética é: %.2f%n", media);

        scanner.close();
    }
}
