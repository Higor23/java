/* Busca em vetores com Array.binarySearch */
package estudoprovaiii;

import java.util.Arrays;

public class Vetor04 {
    public static void main(String[] args) {
        int vet[] = {3, 7, 6, 1, 9, 4, 0};
        for(int v:vet) {
            System.out.print(v + " ");
        }
        System.out.println("");
        
        int p = Arrays.binarySearch(vet, 3);
                
        System.out.print("Encontrei o valor na posição " + p);
        System.out.println("");
    }
}
