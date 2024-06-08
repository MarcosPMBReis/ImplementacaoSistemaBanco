package banco.java.main;

public interface ServicesConta {
	public void Sacar (double valorSaque);
	public void Depositar (double valorDeposito);
	public void Transferir(double valorTransferiod, Conta contaDestino);
	public void ImprimirExtrato();
}
