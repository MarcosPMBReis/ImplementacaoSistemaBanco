package banco.java.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CadastroClienteService cadastroService = new CadastroClienteService();

        // Método de cadastro
        Cliente cliente = cadastroService.cadastrarCliente();
        
        Conta cc = new ContaCorrente(); // Ou outra classe de conta desejada
        cliente.setConta(cc);
        
        // Exibir o menu de operações enquanto o usuário não desejar deslogar
        boolean sair = false;
        while (!sair) {
            int opcao = exibirMenu();
            switch (opcao) {
                case 1:
                    sacarOperacao(cliente);
                    break;
                case 2:
                    depositarOperacao(cliente);
                    break;
                case 3:
                    transferirOperacao(cliente);
                    break;
                case 4:
                    imprimirExtrato(cliente);
                    break;
                case 5:
                    sair = true;
                    System.out.println("Deslogando do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        }

        // Fechar o scanner ao finalizar
        cadastroService.fecharScanner();
    }

    // Método para exibir o menu de operações
    private static int exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=== Menu de Operações ===");
        System.out.println("1. Sacar");
        System.out.println("2. Depositar");
        System.out.println("3. Transferir");
        System.out.println("4. Imprimir Extrato");
        System.out.println("5. Deslogar do sistema");
        System.out.print("Escolha a opção desejada: ");
        int opcao = scanner.nextInt();
        return opcao;
    }

    // Método para realizar operação de saque
    private static void sacarOperacao(Cliente cliente) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor para sacar: ");
        double valor = scanner.nextDouble();

        // Acessar a conta do cliente e realizar o saque
        cliente.getConta().Sacar(valor);

        System.out.println("Saque realizado com sucesso!");
    }

    // Método para realizar operação de depósito
    private static void depositarOperacao(Cliente cliente) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor para depositar: ");
        double valor = scanner.nextDouble();

        // Acessar a conta do cliente e realizar o depósito
        cliente.getConta().Depositar(valor);

        System.out.println("Depósito realizado com sucesso!");
    }

    // Método para realizar operação de transferência
    private static void transferirOperacao(Cliente cliente) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor para transferir: ");
        double valor = scanner.nextDouble();

        // Simular uma transferência para uma conta de destino (por exemplo, outra conta do cliente)
        Conta contaDestino = new ContaPoupanca(); // Exemplo de outra conta do cliente

        // Acessar a conta do cliente e realizar a transferência
        cliente.getConta().Transferir(valor, contaDestino);

        System.out.println("Transferência realizada com sucesso!");
    }

    // Método para imprimir o extrato da conta
    private static void imprimirExtrato(Cliente cliente) {
        // Acessar a conta do cliente e imprimir o extrato
        cliente.getConta().ImprimirExtrato();

        System.out.println("Extrato impresso com sucesso!");
    }
    }
