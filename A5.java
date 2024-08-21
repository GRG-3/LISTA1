import java.util.Scanner;

public class DescontoProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Digite o percentual de desconto: ");
        double descontoPercentual = scanner.nextDouble();

        double desconto = valorProduto * (descontoPercentual / 100);
        double valorComDesconto = valorProduto - desconto;

        System.out.printf("Nome do produto: %s%n", nomeProduto);
        System.out.printf("Valor antigo: %.3f%n", valorProduto);
        System.out.printf("Valor com desconto: %.3f%n", valorComDesconto);

        scanner.close();
    }
}