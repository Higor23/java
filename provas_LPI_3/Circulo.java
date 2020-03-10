package provas_LPI_3;

public class Circulo implements Forma_Geometrica {
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	

	@Override
	public double calculoPerimetro() {
		double perimetro = (2*3.14*raio);
		return perimetro;
	}


	@Override
	public double calculoArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
