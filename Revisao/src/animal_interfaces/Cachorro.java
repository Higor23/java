package animal_interfaces;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao {
	private int tamanho;
	private String raca;
	
	public Cachorro(int tamanho, String raca) {
		this.tamanho = tamanho;
		this.raca = raca;
	}
	
	public int getTamanho() {
		return tamanho;
		
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public String raca() {
		return raca;
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public void amamentar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void levarVeterinario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void brincar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void levarPassear() {
		// TODO Auto-generated method stub
		
	}

}
