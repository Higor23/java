﻿//Exercícios pg. 46 - 1(J)
/*Elaborar um programa que apresente os resultados da soma e da média aritmética dos valores
pares situados na faixa numérica de 50 a 70.*/

package exercicios46;


import java.util.Scanner;


public class numero1J {
    public static void main(String[] args) {
        int i = 50, num = 50, media, soma = 0;
        Scanner s = new Scanner(System.in);
        while(i<=70){
            
            soma = soma + num;
            
            i = i+2;
            
        }
        media = soma/21;
        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A média dos valores é: " + media);
        
        
    }
    
}