package aula30;

public class Carro {

    String modelo;
    String marca;
    double capCombustivel;
    int numPassageiros;
    double consumoCombustivel;

    public Carro(String marca, String modelo, int numPassageiros,
            double capCombustivel, double consumoConbustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoConbustivel;
        System.out.println("Chamando o construtor com 3 parâmetros");

    }
     public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        
        System.out.println("Chamando o construtor com 2 parâmetros");
       
    }
      

 

}


