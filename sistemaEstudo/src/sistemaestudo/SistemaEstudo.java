/*1 – Fazer um programa em Java que mostre o menu abaixo e ao ser escolhida a opção o programa deve realizar as
operações necessárias sempre utilizando estruturas de repetição e não as funções pré-definidas do Java.
Todas as operações do menu, inclusive o mesmo, obrigatoriamente devem ser realizadas por sub-rotinas (função ou
procedimento) com passagem de parâmetros (são proibidas as variáveis globais).
Devem ser feitas todas as validações dos números digitados para que as operações apenas aceitem números válidos para
as opções do menu.
O menu deve aparecer sempre ao final de cada operação e o programa só deve ser finalizado quando o usuário escolher a
opção “6 – Sair”.
Menu
1 – Fatorial de um número
2 – Somatório de um número
3 – Potência de um número
4 – Divisão de um número por outro
5 – Multiplicação de um número por outro
6 – Sair
Observações:
Opção 1: aceitar apenas valores >= 0
Opção 2: aceitar apenas valores > 0
Opção 3: Opção 1: aceitar apenas valores >= 0 tanto para a base quanto para o expoente; deve ser feita através de um laço
e não utilizando o comando Math.pow;
Opção 4: deve ser feita através de um laço com subtrações sucessivas e não através do operador / e na resposta deve
conter o quociente e o resto da divisão;
Opção 5: deve ser feita através de um laço com somas sucessivas e não através do operador *.
 */
package sistemaestudo;

public class SistemaEstudo {

    public static void main(String[] args) {
        System.out.println(fatorial (3,1,1));
        System.out.println(somatorio(3,4));
        System.out.println(potencia(2,3,1,0));
        

    }
    public static int fatorial(int fat, int result, int cont){
        
        for (cont = 1; cont <= fat; cont ++){
        result = result*cont;
    }return result;
    }
    
   public static float somatorio(float x , float y){
        float soma = x + y;
        return soma;
   }
   
   public static int potencia(int base, int exp, int cont, int result){
       
       while (cont < exp){
           result = result + base * cont;
           cont++;
           
       }return result;
       
   }   
}

