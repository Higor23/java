//Exercícios pg. 41 - 4(b)
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
