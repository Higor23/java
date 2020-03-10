
package estudoslpi;

import java.util.Scanner;


public class metodosFuncoes {
     
   /* public static void soma (int a, int b) {
        int s = a + b;
        System.out.println("A soma é " + s);
    }*/
    
    
   /* static int soma(int a, int b){
        int s = a + b;
        return (s);
    }*/
    public static void main(String[] args) {
        int valor1, valor2;
       
        Scanner s = new Scanner(System.in);
        
        System.out.println("Para a saber a soma de dois valores, faça o procedimento a seguir: ");
        System.out.print("Digite o primeiro valor: ");
        valor1 = s.nextInt();
        System.out.print("Digite o segundo valor: ");
        valor2 = s.nextInt();
        
        int sm = soma(valor1,valor2);
        System.out.println("A soma vale " + sm);
        
        System.out.println("");
        System.out.println("Vai começar a contagem");
        System.out.println(contador.contador(1,5));
        System.out.println(""+ fatorial.fatorial(3,1,1));
    }
    
       
}
