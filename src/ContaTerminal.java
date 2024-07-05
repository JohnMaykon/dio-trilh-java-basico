import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        /*Conhecer e importar a classe Scanner
         *Exibir as mensagens para o nosso usuário
         *Obter pela scanner os valores digitados no terminal
         *Exibir a mensagem de conta criada*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor Digite o Nome do Cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.println("Por favor Digite o numero da conta: ");
        int conta = scanner.nextInt();
        System.out.println("Por favor Digite o numero da Agencia: ");
        int agencia = scanner.nextInt();

        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, "
                + nomeCliente
                + " obrigado por criar uma conta em nosso banco, sua agência é: "
                + agencia
                + ",sua conta é: " + conta + " e seu saldo:" + saldo + " já está disponível para saque.");
    }
}