package rh;

public class Desenvolvedor extends Empregado {
	
	public Desenvolvedor(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	public double getBonificacao() {
		return salario*0.15;
	}
	
	public void Imprimir() {
		System.out.println("Nome: " + nome);
		System.out.println("CPF " + cpf);
		System.out.println("Salário: " + salario);
		System.out.println();
	}

}
