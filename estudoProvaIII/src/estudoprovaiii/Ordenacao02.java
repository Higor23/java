
package estudoprovaiii;

import java.util.Scanner;

public class Ordenacao02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome[] = new String[5], aux;
        int cont, i, j;
        for (cont=0;cont<nome.length;cont++){
            System.out.println("Digite o " + (cont+1) + "o nome: ");
            nome[cont] = entrada.next();
        }
            System.out.println("Estes são os valores digitados: ");
            for (cont=0;cont<nome.length;cont++)
                System.out.println("Posição " + (cont) + "nome: " + nome[cont]);
            for(i=0;i<(nome.length-1);i++)
                for(j=i;j<nome.length;j++){
                    if (nome[i].compareToIgnoreCase(nome[j]) > 0){
                        aux = nome[i];
                        nome[i] = nome[j];
                        nome[j] = aux;
                    }
                
            }
               System.out.println("Estes foram os números digitados e ordenados: ");
               for (cont=0;cont<nome.length;cont++)
                   System.out.println("Posição " + (cont) + "número: " + nome[cont]);
    }
}