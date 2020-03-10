//Exercícios pg. 41 - 4(H)
import java.util.Scanner;


public class numero4H {
    public static void main(String[] args) {
        int a, b, c, d, e, vM;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        a = s.nextInt();
        System.out.print("Digite o segundo valor: ");
        b = s.nextInt();
        System.out.print("Digite o terceiro valor: ");
        c = s.nextInt();
        System.out.print("Digite o quarto valor: ");
        d = s.nextInt();
        System.out.print("Digite o quinto valor: ");
        e = s.nextInt();
        
        vM = a;
        
        if(vM < b){
            vM = b;
        } 
        
        if(vM < c){
            vM = c;
        }
        if(vM < d){
            vM = d;
                } 
        if(vM < e){
            vM = e;
        }
        System.out.println("O maior valor é: " + vM);
    }
}
   
        
       