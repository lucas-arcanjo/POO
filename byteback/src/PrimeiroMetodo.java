
public class PrimeiroMetodo {

	public static void main(String[] args) {
		
		Conta contaLucas = new Conta();
		contaLucas.saldo = 150;
		System.out.println(contaLucas.saldo);
		contaLucas.deposita(50.0);
		System.out.println(contaLucas.saldo);
	}
}
