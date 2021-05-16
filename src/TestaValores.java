
public class TestaValores {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1234, 15190);
		
		System.out.println(conta.getAgencia());
		// a conta está inconsistente
		// conta.setAgencia(-50);
		// conta.setNumero(-100);
		
		conta.setAgencia(4321);
		
		Conta conta2 = new Conta(4321, 877669);
		Conta conta3 = new Conta(4321, 999990);
		Conta conta4 = new Conta(5678, 909090);
		
		System.out.println(Conta.getTotal());
	}

}
