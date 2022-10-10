
public class TestaConta {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111, 1111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 2222);
		cp.deposita(200.0);
		
		cp.tranfere(10.0, cc);
		
		System.out.println(cp.getSaldo());
		
	}
}
