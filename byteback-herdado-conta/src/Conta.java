public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		total++;
//		System.out.println("estou criando uma conta, total de contas " + total);
		this.agencia = agencia;
		this.numero = numero;
	}
	
	void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean tranfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.saldo += valor;
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}

	public double getNumero() {
		return this.numero;
	}
	 
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("o número não pode ser menor ou igual a zero");
			return;
		}
		this.numero = numero;
	}
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("a agencia não pode ser menor ou igual a zero");
			return;
		}
		this.agencia = agencia;
	}
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return total;
	}
}