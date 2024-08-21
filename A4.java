import javax.swing.JOptionPane;
import java.util.Calendar;

public class NomeIdade {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        String anoNascimentoStr = JOptionPane.showInputDialog("Digite o ano de nascimento:");
        int anoNascimento = Integer.parseInt(anoNascimentoStr);
        
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        int idade = anoAtual - anoNascimento;

        JOptionPane.showMessageDialog(null, String.format("Você se chama %s e possui %d anos de idade!", nome, idade));
    }
}