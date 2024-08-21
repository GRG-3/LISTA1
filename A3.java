import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Digite o valor por hora: ");
        double valorPorHora = scanner.nextDouble();

        double salario = horasTrabalhadas * valorPorHora;

        System.out.printf("Salário: %.2f%n", salario);

        scanner.close();
    }
}