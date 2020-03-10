//Exercícios pg. 46 - 1(c)
/*Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de
1 até 500.*/

package exercicios46;

public class numero1C {
    public static void main(String[] args) {
        int i = 2, soma = 0;
        
        
        while(i<=10){
            
            soma = i + soma;
            System.out.println(soma);
            i+=2;
        }
    }
    
}
