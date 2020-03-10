/**
 * Higor Lemos
 * Lincoln Brito
 * Yullo Bomfim
 */
package provahigorlincolnyullo;

import java.util.Scanner;

public class q04 {
    public static void main(String[] args) {
        int numero, cont = 0, divisores = 0;
        Scanner s = new Scanner(System.in);
       
        System.out.println("Digite um número: ");
        numero = s.nextInt();
        
        if(numero > 0 ) {
            for(cont=1;cont<=numero;cont++) {
                if(numero % cont == 0) {
                    divisores++;
                }
            }
            
            if(divisores > 2) {
                System.out.println(numero + " não é primo");
            } else {
                System.out.println(numero + " é primo");
            }
        
        } else {
            System.out.println("Número deve ser maior que zero");
        }
        
        
        
    }    
}
