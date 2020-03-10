package aula25;

public class Carro {

    String modelo;
    String marca;
    int capCombustivel;
    int numPassageiros;
    double consumoCombustivel;

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");

    }
}
