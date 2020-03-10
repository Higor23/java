package heranca;

public class UsaFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Lucas");
		funcionario.setCpf("23211009298-4");
		funcionario.setCartao("RH845");
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getCpf());
		System.out.println(funcionario.getCartao());

	}

}
