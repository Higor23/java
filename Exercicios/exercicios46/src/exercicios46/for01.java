//Exercícios pg. 46 - 1(a) - for
package exercicios46;

import java.util.Scanner;

public class for01 {
    public static void main(String[] args) {
        int num, cont;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite um valor para obter a tabuada: ");
        num = s.nextInt();
        for(cont = 0; cont <=10;cont++){
            System.out.println(num + " x " + cont + " = " + cont*num);
    
        }
    }
    
}
