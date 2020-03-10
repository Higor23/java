package rh;

public class Main {

	public static void main(String[] args) {
		Gerente gerente1 = new Gerente("Madalena", "021.234.344-45", 4000.00, 26.98);
		Gerente gerente2 = new Gerente("Milalis", "045.234.634-63", 3800.00, 26.98);
		Desenvolvedor desenvolvedor1 = new Desenvolvedor("Joana", "044.234.785-43", 5000.00);
		Desenvolvedor desenvolvedor2 = new Desenvolvedor("Natanael", "026.285.743-92", 4500.00);
		
		gerente1.Imprimir();
		gerente2.Imprimir();
		desenvolvedor1.Imprimir();
		desenvolvedor2.Imprimir();
		
		
		System.out.println(" ");
		
		System.out.println(gerente1.getBonificacao());
		System.out.println(gerente2.getBonificacao());
		System.out.println(desenvolvedor1.getBonificacao());
		System.out.println(desenvolvedor2.getBonificacao());
		System.out.println();
		
		Array array = new Array();
		
		array.setEmpregado(gerente2);
		array.setEmpregado(gerente1);
		array.setEmpregado(desenvolvedor1);
		array.setEmpregado(desenvolvedor2);
		array.setEmpregado(desenvolvedor2);
		
		array.Imprimir();
		
		
		
		
		
		
		
		
		
	}

}
