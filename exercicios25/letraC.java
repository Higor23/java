
import java.util.Scanner;


public class letraC {
    public static void main(String[] args) {
        double V, H, R;
        
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o raio da lata: ");
        R = s.nextFloat();
        
        System.out.print("Digite a altura da lata: ");
        H = s.nextFloat();
        V = Math.pow(R,2)*H;
        
        System.out.print("O volume é: " + V);
        
        
        
    }
    
}
