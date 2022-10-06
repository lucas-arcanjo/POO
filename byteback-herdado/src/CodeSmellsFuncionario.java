
public class CodeSmellsFuncionario {

	String nome;
	String cpf;
	double salario;
	private int tipo; // 0 == funcionário / 1 == gerente / 2 == diretor
	
	public double getBonificacao() {
		if (tipo == 0) {
			return salario * 0.1;
		} else if (tipo == 1) {
			return salario;
		} else {
			return salario + 1000.0;
		}
		
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
