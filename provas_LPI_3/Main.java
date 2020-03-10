package provas_LPI_3;

public class Main {

	public static void main(String[] args) {
		Retangulos ret01 = new Retangulos(10.5, 12.8);
		Retangulos ret02 = new Retangulos(4.8, 6.5);
		Quadrados quad01 = new Quadrados(8.3);
		Quadrados quad02 = new Quadrados(7.6);
		Circulo circ01 = new Circulo(3);
		Circulo circ02 = new Circulo(4);
		
		Array array = new Array();
		
		array.Inserir(ret01);
		array.Inserir(ret02);
		array.Inserir(quad01);
		array.Inserir(quad02);
		array.Inserir(circ01);
		array.Inserir(circ02);
		
		
		array.Imprimir();

	}

}
