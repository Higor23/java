/* Slide Vetor
1 - a) Ler 12 elementos de uma matriz tipo vetor, colocá-los em ordem decrescente
       e apresentar os elementos ordenados.
 */
package estudoprovaiii;

import java.util.Scanner;

public class ex1letraaslide {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num[] = new int[12], i, j,x;
        
        for (i = 0;i<12; i++){
            System.out.print("Digite o " + (i+1) + "o número: ");
            num[i] = s.nextInt();
            
        }System.out.println("");
        
        for(i=0;i<12;i++){
            System.out.println("Posição " + i + " número " + num[i]);
            
        }System.out.println("");
        for(i=0;i<11;i++)
            for(j=i+1;j<12;j++){
            if(num[i] < num[j]){
                x = num[i];
                num[i] = num[j];
                num[j] = x;
            }
        }
        System.out.println("Estes foram os números digitados e ordenados: ");
        for (i=0;i<12;i++)
            System.out.println("Posição " + (i) + " número: " + num[i]);
        
    }
   
}
