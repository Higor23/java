package provas_LPI_2;

public class Array_Exames {
	private Exame[] exames;
	private int indice;
	
	public void ArrayExames() {
		exames = new Exame[10];
		indice = 0;
		
	}
	public void InserirExame(Exame x) {
		if(indice<10) {
			exames[indice] = x;
			indice ++;
		}
	}
	
}
