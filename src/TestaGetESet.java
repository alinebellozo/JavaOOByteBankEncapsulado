
public class TestaGetESet {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1234, 15190);
		// conta.numero = 1234;
		conta.setNumero(1234);
		System.out.println(conta.getNumero());
		
		Cliente aline = new Cliente();
		// conta.titular = aline;
		aline.setNome("Aline Bellozo");
		
		conta.setTitular(aline);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Tradutora");
		// em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Tradutora");
		
		System.out.println(titularDaConta);
		System.out.println(aline);
		System.out.println(conta.getTitular());
	
	}
}
