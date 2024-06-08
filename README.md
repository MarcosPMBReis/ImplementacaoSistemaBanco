# Sistema Bancário em Java

Este projeto implementa um sistema bancário básico em Java, incluindo cadastro de clientes, contas corrente e poupança, e operações bancárias como depósito, saque, e transferência.

## Funcionalidades

- Cadastro de clientes com nome e senha do aplicativo.
- Criação de contas corrente e poupança associadas aos clientes.
- Operações: depósito, saque, transferência e impressão de extrato.
- Interface de linha de comando para interação com o sistema.

## Tecnologias Utilizadas

- Java
- IDE de sua preferência (Eclipse, IntelliJ, etc.)

## Como Utilizar

1. Clone o repositório.
2. Abra o projeto em sua IDE.
3. Execute o arquivo `Main.java`.
4. Siga as instruções no console para realizar operações bancárias.

## Exemplo de Uso

```java
// Exemplo de código Java para demonstrar operações bancárias:
Cliente cliente = new Cliente("Nome do Cliente", "senha123");
Conta contaCorrente = new ContaCorrente();
cliente.setConta(contaCorrente);

cliente.getConta().Depositar(100.0); // Deposita 100.0 na conta
cliente.getConta().Sacar(50.0);      // Saca 50.0 da conta
cliente.getConta().ImprimirExtrato(); // Imprime o extrato da conta
```

# Contribuições

- Contribuições são bem-vindas!
- Sinta-se à vontade para enviar pull requests com melhorias.
- Abra issues para reportar problemas ou sugestões.

# Sobre o Autor

- Olá! Eu me chamo Marcos e sou um programador iniciante nessa jornada de transição para a tecnologia.
- Este projeto foi uma continuação do projeto da DIO (Digital Innovation One).
- Estou aprendendo e aprimorando minhas habilidades em Java e desenvolvimento de sistemas.

## Redes Sociais

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Profile-blue?style=flat&logo=linkedin)](https://www.linkedin.com/in/marcos-paulo-reis-1118b61bb/)
[![GitHub](https://img.shields.io/badge/GitHub-Profile-green?style=flat&logo=github)](https://github.com/MarcosPMBReis)
