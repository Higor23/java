
import java.util.Scanner;


public class numero4E {
    public static void main(String[] args) {
        int a, b, c, x;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Digite o valor de a: ");
        a = s.nextInt();
        System.out.print("Digite o valor de b: ");
        b = s.nextInt();
        System.out.print("Digite o valor de c: ");
        c = s.nextInt();
        
        if(a > b){
            x = a;
            a = b;
            b = x;
            
        } if(a > c){
            x = a;
            a = c;
            c = x;
        
        }if (b > c){
            x = b;
            b = c;
            c = x;
        }  
        System.out.println("Os valores de a, b e c em ordem crescente são: " + a + " " + b + " " +  c);
    }
    
}
