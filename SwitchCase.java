import javax.swing.JOptionPane;

public class SwitchCase {
    public static void main(String[] args) {
        // Entrada de dados
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        char operador = JOptionPane.showInputDialog("Digite o operador (+, -, *, /):").charAt(0);

        int resultado;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                JOptionPane.showMessageDialog(null, "Soma: " + resultado);
                break;

            case '-':
                resultado = num1 - num2;
                JOptionPane.showMessageDialog(null, "Subtração: " + resultado);
                break;

            case '/':
                if (num2 == 0) {
                    JOptionPane.showMessageDialog(null, "Divisão por zero não é permitida.");
                } else {
                    resultado = num1 / num2;
                    JOptionPane.showMessageDialog(null, "Divisão: " + resultado);
                }
                break;

            case '*':
                resultado = num1 * num2;
                JOptionPane.showMessageDialog(null, "Multiplicação: " + resultado);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Operador inválido.");
        }
    }
}
