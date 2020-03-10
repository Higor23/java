/* Ordenação de elementos de um vetor - Método 01 */

package estudoprovaiii;

import java.util.Scanner;


public class Ordenacao01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num[] = new int[5];
        int cont, i,j,aux;
        
        for (cont=0;cont<5;cont++){
            System.out.println("Digite o " + (cont+1) + "o número: ");
            num[cont] = entrada.nextInt();
        }
        System.out.println("Estes foram os números digitados: ");
        for(cont = 0; cont<5; cont++)
            System.out.println("Posição " + (cont) + " numero: " + num[cont]);
        for(i=0;i<4;i++)
            for(j=i+1;j<5;j++){
            if(num[i] > num[j]){
                aux = num[i];
                num[i] = num[j];
                num[j] = aux;
            }
        }
        System.out.println("Estes foram os números digitados e ordenados: ");
        for (cont=0;cont<5;cont++)
            System.out.println("Posição " + (cont) + " número: " + num[cont]);
    } 
    
}