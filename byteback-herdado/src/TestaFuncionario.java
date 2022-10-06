
public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario lucas = new Funcionario();
		
		lucas.setNome("lucas");
		lucas.setCpf("132.184.871-87");
		lucas.setSalario(3000.0);

		System.out.println(lucas.getBonificacao());
		
	}

}
