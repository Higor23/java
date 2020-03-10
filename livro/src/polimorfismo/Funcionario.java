package polimorfismo;

public class Funcionario extends PessoaFisica {
	
	private String cartao;
	
	public void setCartao(String cartao) {
		this.cartao = cartao;
	}
	public String getCartao() {
		return cartao;
	}
	
	public void mostraClasse() {
		System.out.println("classe Funcionario");
	}
}
