import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
            String nome = scanner.next();
            
        System.out.println("Digite sua agência: ");
            String agencia = scanner.next();
        
        System.out.println("Digite o número da conta: ");
            int conta = scanner.nextInt();
    
        System.out.println("Digite seu saldo: ");
            String saldoStr = scanner.next();
            double saldo = Double.parseDouble(saldoStr);

        scanner.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nome, agencia, conta, saldo);
    }
}
