package provas_LPI_3;

public abstract class Quadrilateros implements Forma_Geometrica {
	protected double baseA;
	protected double baseB;
	protected double alturaA;
	protected double alturaB;
	
	public Quadrilateros(double baseA, double baseB, double alturaA, double alturaB) {
		this.baseA = baseA;
		this.baseB = baseB;
		this.alturaA = alturaA;
		this.alturaB= alturaB;
	}
	
	public abstract double calculoPerimetro();
	public abstract double calculoArea();
	


}
