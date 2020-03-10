package provas_LPI_2;

public class Exame_Sangue extends Exame{
	private char rh;
	private char tipo_sangue;
	
	public Exame_Sangue(char rh, char tipo_sangue, int id, String nome, double preco) {
		super(id, nome, preco);
		this.rh = rh;
		this.tipo_sangue = tipo_sangue;
	}
	
	public void Imprimir() {
		System.out.println("RH "+ rh);
		System.out.println("Tipo: " + tipo_sangue); 
		System.out.println("ID: " + id); 
		System.out.println("Nome: " + nome); 
		System.out.println("Preço: " + preco);
		 
	}

}
