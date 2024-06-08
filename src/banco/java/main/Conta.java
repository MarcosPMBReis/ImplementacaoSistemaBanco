package banco.java.main;

public abstract class Conta implements ServicesConta{
	
	protected static String AGENCIA_PADRAO = "0001";
	protected static int SEQUENCIAL = 0001;
	protected static double SALDOPADRAO = 0;
	
	
	protected String numAgencia;
	protected int numConta;
	protected double SaldoConta;
	protected static Cliente titular;
	
	public Conta(Cliente titular) {
		this.numAgencia = AGENCIA_PADRAO;
		this.numConta = SEQUENCIAL++;
		SaldoConta = SALDOPADRAO;
		Conta.titular = titular;

	}
	
	public String getNumAgencia() {
		return numAgencia;
	}
	public int getNumConta() {
		return numConta;
	}
	public double getSaldoConta() {
		return SaldoConta;
	}
	
	public void ImprimirExtrato() {
		// TODO Auto-generated method stub
		System.out.println(String.format("Agencia: %s", this.numAgencia));
		System.out.println(String.format("Conta: %d", this.numConta));
		System.out.println(String.format("Saldo: %.2f", this.SaldoConta));
	}	
	
	@Override
	public void Sacar(double valorSaque) {
		// TODO Auto-generated method stub
		this.SaldoConta -= valorSaque;
	}

	@Override
	public void Depositar(double valorDeposito) {
		// TODO Auto-generated method stub
		this.SaldoConta += valorDeposito;
	}

	@Override
	public void Transferir(double valorTransferiod, Conta contaDestino) {
		// TODO Auto-generated method stub
		this.Sacar(valorTransferiod);
		contaDestino.Depositar(valorTransferiod);
	}
	
}
