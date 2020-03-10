//Exercícios pg. 46 - 1(a) - do while
package exercicios46;


import java.util.Scanner;

public class doWhile1A {
    public static void main(String[] args) {
        int num, cont = 0;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite um valor para obter a tabuada: ");
        num = s.nextInt();
        
        do{
            System.out.println(num + " x " + cont + " = " + cont*num);
            cont++;
            
        }while (cont <=10);
    }
}

  
        
