//Exercícios pg. 46 - 1(i)
/*Elaborar um programa que efetue a leitura de 10 valores numéricos e apresente no final o total do
somatório e a média aritmética dos valores lidos.*/

package exercicios46;

import java.util.Scanner;


public class numero1I {
    public static void main(String[] args) {
        int i =1, num, media, soma = 0;
        Scanner s = new Scanner(System.in);
        while(i<=10){
            
            System.out.print("Digite o " + (i) + "o valor: ");
            num = s.nextInt();
            soma = soma + num;
            
            i++;
            
        }
        media = soma/10;
        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A média dos valores é: " + media);
        
        
    }
    
}
