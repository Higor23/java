/*Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem
dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 7. Se o valor da
média for menor que 7, solicitar a nota de exame, somar com o valor da média e obter nova média.
Se a nova média for maior ou igual a 5, apresentar uma mensagem dizendo que o aluno foi
aprovado em exame. Se o aluno não foi aprovado, indicar uma mensagem informando esta
condição. Apresentar com as mensagens o valor da média do aluno, para qualquer condição.*/
import java.util.Scanner;

public class numero4D {
    public static void main(String[] args) {
        float n1, n2, n3, n4, m, exame;
        
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
        
        if(m >= 7){
            System.out.print("Aluno aprovado com média: " + m);
        
        }else if (m < 5){
            System.out.print("Aluno Reprovado.");
            
        } else
            System.out.print("Digite o valor do exame final: ");
            exame = s.nextFloat();
            System.out.println("Aluno aprovado em exame final com média: " + (m + exame)/2);
 
    }
}
