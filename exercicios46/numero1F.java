//Exercícios pg. 46 - 1(f)
/*Elaborar um programa que apresente como resultado o valor de uma potência de uma base
qualquer elevada a um expoente qualquer, ou seja, de BE, em que B é o valor da base e E o valor
do expoente. Observe que neste exercício não pode ser utilizado o operador de exponenciação do
portuguol (^).*/

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