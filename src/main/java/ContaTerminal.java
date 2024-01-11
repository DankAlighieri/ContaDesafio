import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numero = 0;
        double saldo = 0.0;
        String agencia, nomeCliente;
        try (Scanner terminal = new Scanner(System.in).useLocale(Locale.US)) {

            System.out.println("Por favor, digite a agencia");
            agencia = terminal.nextLine();
            System.out.println("Por favor, digite o nome");
            nomeCliente = terminal.nextLine();
            System.out.println("Por favor, digite o numero");
            try {
                numero = terminal.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira apenas numeros para o numero da conta.");
                System.exit(1);
            }
            System.out.println("Por favor, digite o saldo");
            try {
                saldo = terminal.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira apenas numeros para o saldo.");
                System.exit(1);
            }
        }

            System.out.println("Olá, " + nomeCliente + "! Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}

