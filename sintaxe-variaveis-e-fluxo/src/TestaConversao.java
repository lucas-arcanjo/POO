
public class TestaConversao {

	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor); 
		
		float pontoFlutuante = 3.14f;
		int valorMaximoDeInt = 2000000000;
		
		long numeroGrande = 3000000000L; 
		short valorPequeno = 5646;
		byte menorAinda = 127;
		
		double valor1 = 0.1;
		double valor2 = 0.2;
		double total = valor1 + valor2;
		System.out.println(total);
	}
}
