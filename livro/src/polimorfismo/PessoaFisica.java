package polimorfismo;

public class PessoaFisica extends Pessoa {
	
	private String cpf;
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void mostraClasse() {
		System.out.println("classe PessoaFisica");
	}

}
