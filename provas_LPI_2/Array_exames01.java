package provas_LPI_2;

public class Array_exames01 {
	
	private Exame[] banco;
	private int indice;
	
	public Array_exames01() {
		
		banco = new Exame[10];
		indice = 0;
	}
	
	public void InserirExame(Exame x) {
		if(indice <10) {
			banco[indice] = x;
		}
	}
	
	

}
