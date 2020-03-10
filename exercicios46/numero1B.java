//Exercícios pg. 46 - 1(b)
/*Apresentar o total da soma obtida dos cem primeiros 
números inteiros (1+2+3+4+...+98+99+100).*/
package exercicios46;

public class numero1B {
    public static void main(String[] args) {
        int i = 1, soma = 0;
        
        while(i<=100){
            soma = soma + i;
            i++;
            System.out.println(soma);
        }
        
    }
    
}
