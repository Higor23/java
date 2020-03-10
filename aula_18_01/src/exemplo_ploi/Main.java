
package exemplo_ploi;


public class Main {

   
    public static void main(String[] args) {
       //Animal test = new Animal();
       Mamifero dog = new Mamifero(70.0, 35,4, "malhado");
       Reptil crocodilo = new Reptil(100.0, 40, 3, "Verde");
       dog.imprimir();
       dog.locomover();
       dog.alimentar();
       dog.emitirSom();
       
       crocodilo.Imprimir();
       crocodilo.locomover();
       crocodilo.alimentar();
       crocodilo.emitirSom();
       crocodilo.reproducao();
       
       
    }
    
}
