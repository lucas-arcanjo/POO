
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente lucas = new Cliente();
		
		lucas.nome = "Lucas Arcanjo";
		lucas.cpf = "111.111.111-11";
		lucas.profissao = "programador";
		
		Conta contaLucas = new Conta();
		contaLucas.titular = lucas;
		
		System.out.println(contaLucas.titular.nome);
		
	}
}
