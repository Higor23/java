package provas_LPI_3;

public class Retangulos extends Quadrilateros implements Forma_Geometrica {
	
	private double base, altura;
	

	public Retangulos(double base,  double altura) {
		super(base, base, altura, altura);
		this.base = base;
		this.altura = altura;
	}
	@Override
	public double calculoPerimetro() {
		double perimetro = (base*2) + (altura*2);
		return perimetro;
	}

	@Override
	public double calculoArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void Imprimir() {
		System.out.println("Empregado");
	}

	

}
