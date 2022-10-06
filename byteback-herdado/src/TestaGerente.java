
public class TestaGerente {

	public static void main(String[] args) {
		
		Gerente aline = new Gerente();
		
		aline.setNome("Aline");
		aline.setCpf("478.178.772-91");
		aline.setSalario(5000.0);
		aline.setSenha(222);

		System.out.println(aline.autentica(222));
		System.out.println(aline.getBonificacao());
	}

}
