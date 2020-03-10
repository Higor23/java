/**
 * Higor Lemos
 * Lincoln Brito
 * Yullo Bomfim
 */
package provahigorlincolnyullo;

import java.util.Scanner;

public class q02wh {
    public static void main(String[] args) {
        int numAtual=-1, cont=0, soma=0, numPares=0, numImpares=0, resultMultiplicacao=1;
        double media = 0.0;
        Scanner s = new Scanner(System.in);
        
        while(numAtual!=0) {      

            System.out.println("Digite um número: ");
            numAtual = s.nextInt();
            
            if(numAtual < 0) {
                System.out.println("Número inválido");
            } else if(numAtual !=0 ){               
                resultMultiplicacao *= numAtual;
                
                if(numAtual % 2 == 0) {
                    numPares++;
                }else{
                    numImpares++;
                }
                
                soma += numAtual;
                cont++;
            }
            
        }
        media = (cont > 0 ) ? (double) soma / cont : 0;
        resultMultiplicacao = (cont == 0) ? 0 : resultMultiplicacao;
        
        
        System.out.println("A multiplicação é " + resultMultiplicacao + "\nA média aritmética é " + media + "\nA quantidade de números pares é igual a " + numPares + "\nA quantidade de números ímpares é igual a " + numImpares );
    }
}
