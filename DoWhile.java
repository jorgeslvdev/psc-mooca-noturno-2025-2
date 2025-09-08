import java.util.Scanner;

public class DoWhile {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        do {
            System.out.println("Digite o numero 0 para sair: " );
            numero = scanner.nextInt();
        } while (numero != 0);

        scanner.close();
    }

}

