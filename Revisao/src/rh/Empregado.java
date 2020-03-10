package rh;

public abstract class Empregado {
	protected String nome;
	protected String cpf;
	protected double salario;
	
	public Empregado (String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		
	}
	public abstract double getBonificacao();
	
	public void Imprimir() {
	}

}
