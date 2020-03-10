
import java.util.Scanner;

public class letraB {
    public static void main(String[] args) {
        float tF,tC;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Escreva a temperatura em Fahreheit: ");
        tF = s.nextFloat();
        tC = ((tF - 32)*5)/9;
        
        System.out.println("A temperatura em Celsius é: " + tC);
    }
    
}
