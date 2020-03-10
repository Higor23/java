/*
Higor Lemos do Prado - BSI
Questão 22 
Uma centena de animais pertencendo a uma espécie em perigo está colocada 
numa reserva de proteção. Depois de t anos a população p desses animais na 
reserva é dada por p, onde p=100.(t²+5t+25)/(t²+25).
 */

import java.util.Scanner;

public class Populacao {

    public static void main(String[] args) {

        System.out.println("Uma centena de animais pertencendo a uma espécie "
                + "em perigo está colocada \n" + "numa reserva de proteção. Depois "
                + "de t anos a população p desses animais na \n"
                + "reserva é dada por p, onde p = 100.(t²+5t+25)/(t²+25).\n");

        System.out.println("Digite o tempo (em anos) para saber se ocorrerá alguma alteração "
                + "na população de animais: ");

        Scanner input = new Scanner(System.in);

        if (input.nextDouble() < 0) {
            do {

                System.out.println("Valor incorreto.");
                System.out.println("Digite o tempo (em anos) para saber se ocorrerá alguma alteração "
                        + "na população de animais: ");
                break;
            } while (input.nextDouble() < 0);
        } else {

        }

        double tempo = input.nextDouble();

        System.out.println("Digite o valor correspondente à população atual da espécie: ");

        double populacao = input.nextDouble();

        double testeDerivada = pontoMaximo(tempo, populacao);

        double testePopulacao = variacaoPopulacao(tempo, populacao);

        System.out.println("Resultado derivada= " + testeDerivada);

        if (testeDerivada > 0) {
            System.out.println("A população de animais crescerá no período de tempo informado.");
            System.out.println("Média de crescimento da populacao de animais = " + testePopulacao / 12 + "/mês");
            System.out.println("População total do período = " + testePopulacao);
        } else if (testeDerivada < 0) {
            System.out.println("A população de animais diminuirá no período de tempo informado.");
            System.out.println("Média de redução da populacao de animais = " + testePopulacao / 12 + "/mês");
            System.out.println("População total do período = " + testePopulacao);
        } else {
            System.out.println("Não haverá alteração na população de animais no período de tempo informado.");
        }
    }

    public static double pontoMaximo(double tempo, double populacao) {

        double t2 = Math.pow(tempo, 2);
        double t4 = Math.pow(tempo, 2);
        double p = populacao;

        double resultado = (p * (2 * tempo + 5) * (t2 + 25) - p * (t2 + 5 * tempo + 25) * (2 * tempo))
                / (t4 + 2 * t2 * 25 + 25 * 25);
        return resultado;
    }

    public static double variacaoPopulacao(double tempo, double populacao) {
        if (tempo < 5) {
            populacao = (100 * tempo) / 5;

        } else if (tempo > 5) {
            populacao = 500 / tempo;
        }
        return populacao;
    }
}
