public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	void deposita(Double valor) {
		this.saldo += valor;
	}
}