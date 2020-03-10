
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
