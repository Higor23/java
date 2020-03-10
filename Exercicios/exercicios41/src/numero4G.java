//Exercícios pg. 41 - 4(g)
import java.util.Scanner;

public class numero4G {
    public static void main(String[] args) {
        int a, b, c, d;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        a = s.nextInt();
        System.out.print("Digite o segundo valor: ");
        b = s.nextInt();
        System.out.print("Digite o terceiro valor: ");
        c = s.nextInt();
        System.out.print("Digite o quarto valor: ");
        d = s.nextInt();
        
        System.out.println("Os números divisíveis por 2 e 3 são: ");
        if(a % 2 == 0 && a % 3 == 0 ){
            System.out.println(a);
        }
        
        if (b % 2 == 0 && b % 3 == 0){
            System.out.println(b);
        }
        if(c % 2 == 0 && c % 3 == 0){
            System.out.println(c);
        }
        if(d % 2 == 0 && d % 3 == 0){
            System.out.println(d);
        }
    }
}
    
