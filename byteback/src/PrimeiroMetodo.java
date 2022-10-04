
public class PrimeiroMetodo {

	public static void main(String[] args) {
		
		Conta contaLucas = new Conta();
		contaLucas.saldo = 150;
		System.out.println(contaLucas.saldo);
		contaLucas.deposita(50);
		System.out.println(contaLucas.saldo);
		
		System.out.println(contaLucas.saldo);
		
		Conta contaAline = new Conta();
		contaAline.saldo = 3000;
		
		boolean saqueDeuCerto = contaAline.tranfere(130, contaLucas);
		if (saqueDeuCerto) {
			System.out.println("Tranferência feita com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(contaAline.saldo);
		System.out.println(contaLucas.saldo);
	}
}
