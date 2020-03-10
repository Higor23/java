/*Efetuar a leitura de três valores (variáveis A, B e C) 
e apresentá-los dispostos em ordem crescente.*/

import java.util.Scanner;


public class numero4F {
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
            
        }
        
        else if(a > c){
            x = a;
            a = c;
            c = x;
        
        }else if(b > c){
            x = b;
            b = c;
            c = x;      
    }
    System.out.println("Os valores de a, b e c em ordem crescente são: " + a + " " + b + " " +  c);
}
}
