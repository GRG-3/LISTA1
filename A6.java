import javax.swing.JOptionPane;

public class AumentoSalario {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite o salário atual:");
        double salarioAtual = Double.parseDouble(input);
        double aumento = salarioAtual * 0.15;
        double salarioReajustado = salarioAtual + aumento;

        JOptionPane.showMessageDialog(null, String.format("Salário antigo: %.2f%nSalário reajustado: %.2f", salarioAtual, salarioReajustado));
    }
}