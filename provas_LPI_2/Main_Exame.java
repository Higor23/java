package provas_LPI_2;

public class Main_Exame {

	public static void main(String[] args) {
		Exame_Sangue exame01 = new Exame_Sangue('+' , 'A', 1, "João", 100.00);
		Exame_Sangue exame02 = new Exame_Sangue('-' , 'B', 2, "Maria", 200.00);
		Colesterol exame03 = new Colesterol(3, "Rafaela", 115.00, 300.45 );
		Colesterol exame04 = new Colesterol(3, "Rafaela", 115.00, 300.45 );

		exame01.Imprimir();
		exame02.Imprimir();
		exame03.qualidadeColesterol();
		exame04.qualidadeColesterol();
		

		Array_Exames exames = new Array_Exames();

		exames.InserirExame(exame01);
		exames.InserirExame(exame02);
		exames.InserirExame(exame03);
		exames.InserirExame(exame04);
		
//		Array_exames01 banco = new Array_exames01();
//		
//		banco.InserirExame(exame01);
//		banco.InserirExame(exame02);
//		banco.InserirExame(exame03);
//		banco.InserirExame(exame04);
//		
//		banco.Imprimir();
		
	}

}
