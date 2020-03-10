/*
Higor Lemos do Prado

1 – Fazer um programa em Java que mostre o menu abaixo e ao ser escolhida a opção o programa deve realizar as
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
package trabalhofinal;

import java.util.Scanner;

public class HLP_Q01 {
    public static void main(String[] args) {
        int escolhaMenu=0;
        Scanner s = new Scanner(System.in);
        
        
        while(escolhaMenu!=6){
            System.out.println("|==================Menu===================|");
            System.out.println("1 – Fatorial de um número");
            System.out.println("2 – Somatório de um número");
            System.out.println("3 – Potência de um número");
            System.out.println("4 – Divisão de um número por outro");
            System.out.println("5 – Multiplicação de um número por outro");
            System.out.println("6 - Sair");
            
            System.out.print("Digite o valor correspodente\nà opção desejada: ");
            escolhaMenu = s.nextInt();
            menu(escolhaMenu);
        } 
    }
    
    public static void menu(int entrada){
        Scanner s = new Scanner(System.in);
        int n1, n2;
        
        switch(entrada){
            case 1: 
                System.out.println("");
                System.out.print("Digite o valor para saber qual o seu fatorial: ");
                n1 = s.nextInt();
               
                if(n1 >= 0){
                    fatorial(n1,1,1);
                }else{
                    System.out.println("Por favor infome um valor maior ou igual a zero. ");
                }
                 break;
            case 2:
                System.out.println("Digite um número para saber o seu somatório: ");
                n1 = s.nextInt();
                if(n1 <= 0){
                    System.out.println("Por favor informe um valor positivo. ");
                }else{
                    soma(n1,0,1);
                }
                break;
            case 3:
                System.out.println("Digite o valor da base: ");
                n1 = s.nextInt();
                System.out.println("Digite o valor do expoente:");
                n2 = s.nextInt();
                if(n1>=0 && n2>=0){
                    potencia(n1,n2,1,0);
                }else{
                    System.out.println("Por favor informe somente valores maiores ou iguais a zero. ");
                }
                break;
            case 4: 
                System.out.print("Digite o valor do dividendo: ");
                n1 = s.nextInt();
                System.out.print("Digite o valor do divisor: ");
                n2 = s.nextInt();
                
                if(n1 < 0 || n2 < 0){
                    System.out.println("Não é possível realizar esta operação com números negativos. ");
            
                }else if(n2==0){
                    System.out.println("O divisor precisa ser maior que zero. ");
               }else{
                    divisao(n1,n2,0,0,0);
                }
                break;
            case 5: 
                System.out.print("Digite o primeiro valor da multiplicação: ");
                n1 = s.nextInt();
                System.out.print("Digite o segundo valor da multiplicação: ");
                n2 = s.nextInt();
                
                if(n1 > 0 && n2 > 0){
                    multiplicacao(n1,n2,0,n2);
                }else{
                    System.out.println("Por favor digite somente valores maiores ou iguais a zero. ");
                
                break;
                }
            default:
                System.out.println("");
                System.out.println("Opção inválida, por favor insira um valor correto.");
            }
        }
    static void fatorial(int fat, long resultado, int cont) {
       
        while(cont <= fat){
            resultado *= cont;
            cont++;
        }
        System.out.println("O fatorial de " +fat + " é " + resultado);
        System.out.println("");
    }
    static void soma(int n1, int soma, int cont){
        while(cont <= n1){
            
            soma = n1 + cont;
            cont++;
        }System.out.print("O somatório é: " + soma);
        System.out.println("");
    }
    static void potencia(int base, int expoente, int resultado, int cont){
        while(cont<expoente){
                resultado *= base;
                cont++;
            }
            System.out.println(base + "^" + expoente + "=" + resultado);
    }
    static void divisao(int dividendo, int divisor, int quociente, int resto, int aux){
        quociente = 0;
        aux = dividendo;
        while(aux >= divisor){
            aux = aux - divisor;
            quociente++;

    } resto = aux;
        System.out.println("Quociente: " + quociente);
            System.out.println("Resto: " + resto);
      }
    static void multiplicacao(int n1, int n2, int produto, int cont){
           while(cont > 0){
            produto = produto + n1;
            cont--;
        } 
        System.out.println("O valor da multiplicação é " + produto + ".");
    }
}
