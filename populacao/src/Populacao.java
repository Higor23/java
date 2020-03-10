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
        
        Scanner s = new Scanner(System.in);
        int tempo, resultado;
        System.out.println("Uma centena de animais pertencendo a uma espécie "
                + "em perigo está colocada \n" + "numa reserva de proteção. Depois "
                + "de t anos a população p desses animais na \n" +
                "reserva é dada por p, onde p = 100.(t²+5t+25)/(t²+25).\n");
        System.out.println("Digite o tempo (em anos) para saber se ocorrerá alguma alteração "
                + "na população de animais: ");
        tempo = s.nextInt();
        
        resultado = (200*tempo + 500)*(tempo*tempo + 25)-100*(tempo*tempo + 5*tempo + 25)*(2*tempo);
        if(resultado>0){
            System.out.println("A população de animais crescerá no período de tempo informado.");
        }
        else if(resultado < 0){
            System.out.println("A população de animais diminuirá no período de tempo informado.");
        }
        else{
            System.out.println("Não haverá alteração na população de animais no período de tempo informado.");
        }
    }
    
}
