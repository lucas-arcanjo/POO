
public class CodeSmellsTestaFuncionario {

	public static void main(String[] args) {
		
		CodeSmellsFuncionario lucas = new CodeSmellsFuncionario();
		
		lucas.setSalario(3000.0);
		lucas.setTipo(2);

		System.out.println(lucas.getBonificacao());
		
	}

}
