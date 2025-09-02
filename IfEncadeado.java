import javax.swing.JOptionPane;
public class IfEncadeado {
    public static void main(String[] args) {
        double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno:"));

        if (nota >= 7) {
            JOptionPane.showMessageDialog(null, "Aluno aprovado! :)");
        } else if (nota >= 5) {
            JOptionPane.showMessageDialog(null, "Aluno em recuperação. :v");
        } else {
            JOptionPane.showMessageDialog(null, "Aluno reprovado :(");
        }
    }
}
