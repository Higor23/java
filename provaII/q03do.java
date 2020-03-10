/**
 * Higor Lemos
 * Lincoln Brito
 * Yullo Bomfim
 */
package provahigorlincolnyullo;

import java.util.Scanner;

public class q03do {
    public static void main(String[] args) {
        int m=0,n=1,soma=0,cont;
        Scanner s = new Scanner(System.in);
        
        do {
            System.out.println("Digite M: ");
            m = s.nextInt();
            
            System.out.println("Digite N: ");
            n = s.nextInt();
            
            if(m < 0 || n < 0 ) {
                System.out.println("M e N devem ser maiores que zero");
            }else if(m < n ){               
                for(cont=m; cont<=n; cont++) {
                    soma += cont;
                }           
                System.out.println("Somatório entre o par [M, N] = " + soma); 
            }    

            soma = 0;
        }  while(m<n);
    }
}
