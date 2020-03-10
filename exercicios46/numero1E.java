//Exercícios pg. 46 - 1(e)
/*Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15. Deve ser
considerado que qualquer número elevado a zero é 1, e elevado a 1 é ele próprio. Observe que
neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^).*/

package exercicios46;

public class numero1E {
    public static void main(String[] args) {
        int exp = 0, i = 0;
        
        while(i<=15){
            
            System.out.println(i + " elevado a 3 é igual a: " + Math.pow(i, 3));
            i++;
            
        }
    }
    
}
