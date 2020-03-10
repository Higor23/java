
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
