package provas_LPI_2;

public abstract class Exame {
	protected int id;
	protected String nome;
	protected double preco;
	
	public Exame(int id, String nome, double preco) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}
	
	public abstract void Imprimir();

}
