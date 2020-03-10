package provas_LPI_3;

public class Quadrados extends Quadrilateros implements Forma_Geometrica {
	
	private double base;
	
	
	public Quadrados(double base) {
		super(base, base, base, base);
		this.base = base;
	}


	@Override
	public double calculoPerimetro() {
		double perimetro = base*4;
		return perimetro;
	}


	@Override
	public double calculoArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
