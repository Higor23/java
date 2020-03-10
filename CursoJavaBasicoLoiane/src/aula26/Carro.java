package aula26;

public class Carro {

    String modelo;
    String marca;
    double capCombustivel;
    int numPassageiros;
    double consumoCombustivel;

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");

    }

    double obterAutonomia() {
        return capCombustivel * consumoCombustivel;
    }
}
