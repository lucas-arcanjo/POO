
public class TesteReferencia {

	public static void main(String[] args) {
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500);
	
		Gerente g = new Gerente();
		g.setSalario(5000);
		
		ControleBonificacao controleBonificacao = new ControleBonificacao();
		
		controleBonificacao.registra(ev);
		controleBonificacao.registra(g);
		System.out.println(controleBonificacao.getSoma());	
	}

}
