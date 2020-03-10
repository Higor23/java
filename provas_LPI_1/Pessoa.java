package provas_LPI_1;

public class Pessoa {
	private String nome;
	private int idade;
	private double altura;
	
	public Pessoa(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
		
	}
	
	public int getIdade() {
		return idade;
		
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void Imprimir() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
	}
	
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Madalena" , 32, 1.75);
		Pessoa pessoa2 = new Pessoa("Israel", 36, 1.84);
		
		pessoa1.Imprimir();
		System.out.println();
		pessoa2.Imprimir();
		
	}

}
