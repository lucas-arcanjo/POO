
public class TestaBancoSemCliente {

	public static void main(String[] args) {
		
		Conta contaLucas = new Conta();
		
		System.out.println(contaLucas.pegaSaldo());
		System.out.println(contaLucas.titular);
		contaLucas.titular = new Cliente();
		contaLucas.titular.nome = "Lucas Arcanjo";
		System.out.println(contaLucas.titular.nome);
	}
}
