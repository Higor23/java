/**
 * Higor Lemos
 * Lincoln Brito
 * Yullo Bomfim
 */
package provahigorlincolnyullo;

import java.util.Scanner;

public class q01 {
    public static void main(String[] args) {
        int menu=0, 
            fat=0, resultFat=1, 
            base, expoente, resultPotencia=1,
            cont=0;
        
        Scanner s = new Scanner(System.in);
   
        while (menu!=3){
            System.out.println("");
            System.out.println("Menu de opções: ");
            System.out.println("1- Fatorial de um número qualquer (considerar que 0! = 1).");
            System.out.println("2- Potência de uma base qualquer elevada a um expoente qualquer (considerar que n^0 = 1).");
            System.out.println("3- Sair");
        
            menu = s.nextInt();
            
            switch(menu) {
                case 1:
                    System.out.println("Fatorial de: ");
                    fat = s.nextInt();
                    
                    if(fat==0) {
                        resultFat=1;
                    }else{
                       for(cont=1; cont<=fat; cont++) {
                           resultFat *= cont;                         
                       } 
                    }
                    
                    System.out.println(fat + "! = " + resultFat);
                    resultFat = 1;
                    
                    break;
                case 2:
                    System.out.println("Digite a base: ");
                    base = s.nextInt();
                    
                    System.out.println("Digite o expoente: ");
                    expoente = s.nextInt();
                    if (expoente<0 || base<0){
                    System.out.println("Valores não podem ser menores que Zero");   
                       
                    }else if(expoente == 0 ) {
                        resultPotencia = 1;
                        System.out.println(base + "^" + expoente + "=" + resultPotencia );
                    } else if(expoente > 0) {
                        for(cont=1; cont<=expoente; cont++) {
                            resultPotencia *= base;
                        }
                        System.out.println(base + "^" + expoente + "=" + resultPotencia );
                    } else {
                        System.out.println("Expoente deve ser maior que zero");
                    }
                    break;                
            
            }
        }
    }
}
