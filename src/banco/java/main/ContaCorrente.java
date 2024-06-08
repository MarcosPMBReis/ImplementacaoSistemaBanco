package banco.java.main;

public class ContaCorrente extends Conta{

	public ContaCorrente(String numAgencia, int numConta, double saldoConta) {
		super(titular);

		// TODO Auto-generated constructor stub
	}
//	@Override

	public ContaCorrente() {
		// TODO Auto-generated constructor stub
		super(titular);
	}

	public void ImprimirExtrato() {
		System.out.println("===EXTRATO CONTA CORRENTE===");
		super.ImprimirExtrato();
	}
}
