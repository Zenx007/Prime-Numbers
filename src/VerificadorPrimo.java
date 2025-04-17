public class VerificadorPrimo {
    public static void main(String[] args) {
        int numero = 17; // Altere para o número que deseja verificar
        boolean ehPrimo = verificarPrimo(numero);

        if (ehPrimo) {
            System.out.println(numero + " é primo!");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }

    public static boolean verificarPrimo(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        // Verifica divisores até a raiz quadrada de n (otimizado)
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}