package banco.java.main;

import java.util.Scanner;

public class CadastroClienteService {

    private Scanner scanner;

    public CadastroClienteService() {
        this.scanner = new Scanner(System.in);
    }

    public Cliente cadastrarCliente() {
        System.out.println("Cadastro de Cliente:");
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua senha do aplicativo: ");
        String senha = scanner.nextLine();

        // Criando e retornando um novo Cliente com os dados informados
        return new Cliente(nome, senha);
    }

    // Método para fechar o scanner quando não for mais necessário
    public void fecharScanner() {
        scanner.close();
    }
}
