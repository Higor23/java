
package switchcase;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        char letra;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println();
        System.out.println("Digite uma vogal: ");
        letra = s.next().charAt(0);
        
        switch (letra)
        {
            case 'a': case 'A':
                System.out.println("Vogal a ");
                break;
            case 'e': case 'E':
                System.out.println("Vogal e ");
                break;
            case 'i': case 'I':
                System.out.println("Vogal i ");
                break;
            case 'o': case 'O':
                System.out.println("Vogal o ");
                break;
            case 'u': case 'U':
                System.out.println("Vogal U");
                break;
            default:
                System.out.println("Não é vogal");
        }
    }
    
}
