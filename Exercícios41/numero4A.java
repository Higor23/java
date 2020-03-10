//Exercícios pg. 41 - 4(a)
import java.util.Scanner;
/*Ler dois valores numéricos inteiros e apresentar 
o resultado da diferença do maior pelo menor valor.*/

public class numero4A {
    public static void main(String[] args) {
        int VA, VB, V;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        VA = s.nextInt();
        
        System.out.println("Digite o segundo valor: ");
        VB = s.nextInt();
        
        if (VA > VB){
            V = VA - VB;
           
        }
        else{
            V = VB - VA;
        }
        
        System.out.println("A diferença entre os dois valores é: " + V);
        
    }
    
}
