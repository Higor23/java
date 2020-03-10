
package exemplo_ploi;


public class Reptil extends Animal{
    
    public String corDaEscama;

    public Reptil(double peso, int idade, int membros, String corDaEscama){
        super(peso, idade, membros);
        this.corDaEscama = corDaEscama;
    }
    public void locomover(){
        System.out.println("Rastejando");
    }

    public void alimentar(){
        System.out.println("Digestão");
    }

    public void emitirSom(){
        System.out.println("Silêncio");
    }
    public void Imprimir(){
        super.imprimir();
        System.out.println(this.corDaEscama);
    }
    public void reproducao(){
        System.out.println("Pondo Ovos");
    }
    
    
    
}
