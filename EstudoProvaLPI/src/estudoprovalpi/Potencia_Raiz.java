
package estudoprovalpi;

import java.util.Scanner;

public class Potencia_Raiz {
    public static void main(String[] args) {
        int x, y;
        Scanner s = new Scanner(System.in);
        System.out.println("Escreva a base: ");
        x = s.nextInt();
        System.out.println("Escreva o expoente: ");
        y = s.nextInt();
        
        System.out.println("" + Math.sqrt(x));
        System.out.println("" + Math.pow(x, y));
        
        
    }
    
}
