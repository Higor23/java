/*
Desenvolva uma função que recebe o ano de nascimento do usuário e retorna sua idade. 
Faça o cálculo usando o ano atual.
 */
package aula16_09;

public class aula_16_09_03 {
    public static int idade(int anoInicial,int anoFinal) {
        return (anoFinal-anoInicial);
}
   
    
    public static void main(String[] args) {
        int a = 1990;
        int b = 2019;
        
        
        System.out.println(b-a + "");
    }
}