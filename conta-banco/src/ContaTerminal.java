import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        //Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner

        System.out.print("Digite o numero da conta: ");
        int numero = scanner.nextInt(); // Lê um número inteiro
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Porfavor digite o numero da agencia:   ");
        String agencia = scanner.nextLine(); // Lê uma String

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); // Lê uma Stting

        System.out.println("Seu saldo inicial é:");
        Double saldo = scanner.nextDouble();

        System.out.println("\nConta criada com sucesso!");
        System.out.println("Olá " + nome + ", sua conta foi registrada.");
        System.out.println("Número da conta: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Saldo disponível: R$ " + saldo);

        scanner.close(); // Fecha o Scanner para evitar vazamento de recursos
    }

}
