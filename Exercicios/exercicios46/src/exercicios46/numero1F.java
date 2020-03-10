//Exercícios pg. 46 - 1(f)
package exercicios46;

public class numero1F {
    public static void main(String[] args) {
        int i = 1;
        
        System.out.println("0 elevado a 0 é igual a: 0" );
        while(i<=15){
            
            System.out.println(i + " elevado a " + i + " é igual a " + Math.pow(i, i));
            i++;
            
        }
    }
    
}