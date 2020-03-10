

package animais_abstract;


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
        System.out.println("Peixes");
    }
    public void emitirSom(){
        System.out.println("Rugido");
    }
    public void imprimir(){
        super.Imprimir();
        System.out.println(this.corDoPelo);
    }
}
