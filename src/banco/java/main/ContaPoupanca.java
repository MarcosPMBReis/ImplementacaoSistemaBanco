package banco.java.main;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(String numAgencia, int numConta, double saldoConta) {
		super(titular);

		// TODO Auto-generated constructor stub
	}

	public ContaPoupanca() {
		// TODO Auto-generated constructor stub
		super(titular);
	}
	
	public void ImprimirExtrato() {
		System.out.println("===EXTRATO CONTA POUPANÇA===");
		super.ImprimirExtrato();
	}
	

}
