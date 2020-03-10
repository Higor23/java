//Exercícios pg. 46 - 1(a)
/*Apresentar os resultados de uma tabuada de 
multiplicar (de 1 até 10) de um número qualquer.*/

package exercicios46;

import java.util.Scanner;

public class numero1A {
    public static void main(String[] args) {
        int num, cont = 0;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite um valor para obter a tabuada: ");
        num = s.nextInt();
        
        while (cont <=10){
            System.out.println(num + " x " + cont + " = " + cont*num);
            cont++;
            
        }
    }
}
