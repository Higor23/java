package exemplo_ploi;

public class Mamifero extends Animal {
    
    public String corDoPelo;
    
    public Mamifero(double peso, int idade, int membros, String corDoPelo){
        super(peso, idade, membros);
        this.corDoPelo = corDoPelo;
        
    }

    public void locomover(){
        System.out.println("Andando");
    }

    public void alimentar(){
        System.out.println("Digestão");
    }

    public void emitirSom(){
        System.out.println("Fala");
    }
    public void Imprimir(){
        super.imprimir();
        System.out.println(this.corDoPelo);
    }

}
