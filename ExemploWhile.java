import java.util.Scanner;
public class ExemploWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        System.out.println("Digite o numero 0 para sair: " );
        numero = scanner.nextInt();

        while (numero != 0) {
            System.out.println("Voce digitou " + numero );
            System.out.println("Digite o numero 0 para sair: " );
            numero = scanner.nextInt();
        }

        scanner.close();
    }
}
