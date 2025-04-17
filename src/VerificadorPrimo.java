import java.util.Scanner;

public class VerificadorPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        do {
            System.out.print("Digite um número para verificar se é primo: ");
            int numero = scanner.nextInt();

            boolean ehPrimo = verificarPrimo(numero);

            if (ehPrimo) {
                System.out.println(numero + " é primo!");
            } else {
                System.out.println(numero + " não é primo.");
            }

            System.out.print("Você deseja continuar? (S/N): ");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("N")) {
                continuar = false;
            } else if (resposta.equalsIgnoreCase("S")) {
                continuar = true;
            }

        } while(continuar);

        scanner.close();
    }

    public static boolean verificarPrimo(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}