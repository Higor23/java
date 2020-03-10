
import java.util.Scanner;

public class letraA {
    public static void main(String[] args) {
        
        float tF,tC;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Escreva a temperatura em Celcius: ");
        tC = s.nextFloat();
        tF = (9*tC + 160)/5;
        
        System.out.println("A temperatura em Fahrenheit é: " + tF);
        
        
        
        
        
    }
}
