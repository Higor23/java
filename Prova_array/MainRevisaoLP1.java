package aulas;

import java.util.Scanner;

public class MainRevisaoLP1 {

    public static void main(String[] args) {
                Scanner read = new Scanner(System.in);
        
    Gerente gerente1 = new Gerente("Manda Chuvas", "111.111.111-11", 1000, 100);
    Gerente gerente2 = new Gerente("Blau-blau", "222.222.222-22", 2000, 200);
    Desenvolvedor desenvolvedor1 = new Desenvolvedor("Yullo Bomfim", "333.333.333-33",4000);
    Desenvolvedor desenvolvedor2 = new Desenvolvedor("Yullo Costa", "444.444.444-44",8000);
    
    gerente1.getBonificacao();
    gerente2.getBonificacao();
    desenvolvedor1.getBonificacao();
    desenvolvedor2.getBonificacao();
    
    gerente1.imprimir();
    gerente2.imprimir();
    desenvolvedor1.imprimir();
    desenvolvedor2.imprimir();
   
    ArrayFuncionarios array = new ArrayFuncionarios();
    array.inserir(gerente1);
    array.inserir(gerente2);
    array.inserir(desenvolvedor1);
    array.inserir(desenvolvedor2);

        
    System.out.println("Digite um número de CPF para consulta: ");
    String cpf = read.next();
         
    boolean verificar = array.verificar(cpf);
    if(verificar)
        System.out.println("Este CPF está cadastrado em nosso Sistema: "+ cpf);

    else
        System.out.println("CPF não cadastrado em nosso Sistema.");
    }
}
