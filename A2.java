import javax.swing.JOptionPane;

public class AreaCirculo {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite o valor do raio do círculo:");
        double raio = Double.parseDouble(input);
        double area = Math.PI * Math.pow(raio, 2);

        JOptionPane.showMessageDialog(null, String.format("Área do círculo: %.4f", area));
    }
}