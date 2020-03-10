/*Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem
dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 5. Se o aluno não
foi aprovado, indicar uma mensagem informando esta condição. Apresentar junto das mensagens o
valor da média do aluno para qualquer condição.*/

import java.util.Scanner;


public class numero4C {
    public static void main(String[] args) {
        float n1, n2, n3, n4, m;
        
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        n1 = s.nextFloat();
        System.out.print("Digite a segunda nota: ");
        n2 = s.nextFloat();
        System.out.print("Digite a terceira nota: ");
        n3 = s.nextFloat();
        System.out.print("Digite a quarta nota: ");
        n4 = s.nextFloat();
        
        m = (n1 + n2 + n3 + n4)/4;
        
        if(m >= 5){
            System.out.println("O aluno foi aprovado com média: " + m);
        }
        else{
            System.out.println("O aluno foi reprovado com média: " + m);
        }
        
        
    }
    
}
