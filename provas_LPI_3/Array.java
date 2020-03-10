package provas_LPI_3;

public class Array {
	
	private Forma_Geometrica[] array;
	private int indice;
	
	public Array(){
		this.indice = 0;
		array = new Forma_Geometrica[6];
	}
	
	public void Inserir(Forma_Geometrica x){
		try {
			array[indice] = x;
			indice ++;
		}
		catch (Exception e){
			System.out.println("Cheio");
		}
	}
	
	public void Imprimir() {
		try {
			for(int i = 0; i < indice; i++) {
				System.out.println("Área = " + array[indice].calculoArea());
				System.out.println("Perímetro = " + array[indice].calculoPerimetro());
			}
		}
		catch(Exception e){
			System.out.println("Banco de dados cheio.");
		}
	}
	
}	
	
//	public void Inserir(Forma_Geometrica x) {
//		if(indice < 5) {
//			array[indice] = x;
//		}
//		else {
//			System.out.println("Banco de dados cheio");
//		}
//	}
	


