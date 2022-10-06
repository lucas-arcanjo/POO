
public class TesteReferencia {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		f.setSalario(2000);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500);
	
		Gerente g = new Gerente();
		g.setSalario(5000);
		
		ControleBonificacao controleBonificacao = new ControleBonificacao();
		
		controleBonificacao.registra(f);
		controleBonificacao.registra(ev);
		controleBonificacao.registra(g);
		System.out.println(controleBonificacao.getSoma());	
	}

}
