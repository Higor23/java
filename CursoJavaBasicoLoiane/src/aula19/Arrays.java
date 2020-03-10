
package aula19;

public class Arrays {

    public static void main(String[] args) {
        // Programa em array para armazenar todas as temperaturas do ano.
        
        double[] temperaturas  = new double [365];
        temperaturas [0] = 32.3;
        temperaturas [1] = 31.5;
        temperaturas [2] = 33.4;
        temperaturas [3] = 35;
        temperaturas [4] = 33;
        
        System.out.println(""+ temperaturas.length);
        System.out.println(""+ temperaturas.length);
        
        for (int i = 0; i < temperaturas.length; i++){
            System.out.println("O valor da temperatora do dia " + (i + 1) + " é: " + temperaturas [i]);
            // [i] é a atual posição do array 
        }
        
        for (double temp : temperaturas){
            System.out.println("O valor da temperatora  é: " + (temp));
        }
    }
    
}
