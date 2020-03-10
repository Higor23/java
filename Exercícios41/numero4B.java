//Exercícios pg. 41 - 4(b)

/*Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o número lido como sendo um
valor positivo, ou seja, o programa deverá apresentar o módulo de um número fornecido. Lembre-se
de verificar se o número fornecido é menor que zero; sendo, multiplique-o por -1.*/

import java.util.Scanner;



public class numero4B {
    public static void main(String[] args) {
        float V;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite um valor positivo ou negativo: ");
        V = s.nextFloat();
        
        if (V < 0){
            V = V*-1;
        }
        System.out.println("O valor é: " + V);
        
        
        
    }
    
}
