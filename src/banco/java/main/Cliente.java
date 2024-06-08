package banco.java.main;

public class Cliente {

    private String titular;
    private String senhaAplicativo;
    private Conta conta; // Atributo para armazenar a conta do cliente

    public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	// Construtor
    public Cliente(String titular, String senhaAplicativo) {
        this.titular = titular;
        this.senhaAplicativo = senhaAplicativo;
    }

    // Getters e Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getSenhaAplicativo() {
        return senhaAplicativo;
    }

    public void setSenhaAplicativo(String senhaAplicativo) {
        this.senhaAplicativo = senhaAplicativo;
    }
}