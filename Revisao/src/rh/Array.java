package rh;

public class Array {
	
	private int indice;
	private Empregado[] array;
	
	
	public Array() {
		this.indice = 0;
		array = new Empregado[4];	
	}
	
	public void setEmpregado(Empregado p) {
		if(indice < 4) {
			array[indice] = p;
			indice++;
		}
		else {
			System.out.println("A lista está lotada.");
			System.out.println();
		}
			
	}
	
	public void Imprimir() {
		for(int i = 0; i < indice; i++) {
			array[i].Imprimir();
		}
	}
}
	
