package provas_LPI_2;

public class Colesterol extends Exame {
	private double ldl;
	
	public Colesterol(int id, String nome, double preco, double ldl) {
		super(id, nome, preco);
		this.ldl = ldl;
		
	}
	public void qualidadeColesterol() {
		if(ldl < 100) {
			System.out.println("Ótimo");
		}
		else if(ldl >= 101 && ldl <= 129){
			System.out.println("Valor desejável");
			
		}
		else if(ldl>= 130 && ldl <=159) {
			System.out.println("Valor limítrofe");
		}
		else {
			System.out.println("Valor alto");
		}
	}
	

}
