
public class TestaGetSet {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setNumero(1227);
		System.out.println(conta.getNumero());
		
		Cliente lucas = new Cliente();
		
		lucas.setNome("lucas");
		System.out.println(lucas.getNome());
		
		Conta contaTitular = new Conta();
		contaTitular.setTitular(lucas);
		
		System.out.println(contaTitular.getTitular().getNome());
		
		contaTitular.getTitular().setProfissao("developer");
		System.out.println(contaTitular.getTitular().getProfissao());
	}
}
