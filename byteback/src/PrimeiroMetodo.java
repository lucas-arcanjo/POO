
public class PrimeiroMetodo {

	public static void main(String[] args) {
		
		Conta contaLucas = new Conta();
		contaLucas.saldo = 150;
		System.out.println(contaLucas.saldo);
		contaLucas.deposita(50);
		System.out.println(contaLucas.saldo);
		
		boolean saqueDeuCerto = contaLucas.saca(30);
		System.out.println(contaLucas.saldo);
		System.out.println(saqueDeuCerto);
		
	}
}