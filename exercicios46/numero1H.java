//Exercícios pg. 46 - 1(h)
/*Elaborar um programa que apresente os valores de conversão de graus Celsius em Fahrenheit, de
10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius. O
programa deve apresentar os valores das duas temperaturas. */

package exercicios46;


public class numero1H {
    public static void main(String[] args) {
        float i=10, F;
        while(i<=100){
            F = (9*i + 160)/5;
            i= i+10;
            System.out.println(F);
            
            
            
        }
        
    }
    
}
