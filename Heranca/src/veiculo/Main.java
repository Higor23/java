
package veiculo;


public class Main {

   
    public static void main(String[] args) {
        Automovel gol = new Automovel("CHT", 4, "Passeio");
        Caminhao scania = new Caminhao("Diesel", 16, 18.000);
        
        gol.mostrar();
        scania.mostrar();
        
    }
    
}
