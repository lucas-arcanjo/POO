
public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
}
