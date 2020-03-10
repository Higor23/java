package aula28_33_q2;

public class Main {

    public static void main(String[] args) {
        Conta x = new Conta("0001", 1000.00, "Ativo", 500);
        System.out.println("nº da conta = " + x.getNumConta());
        System.out.println("Saldo = " + x.getSaldo());
        System.out.println("Status do Limite = " + x.getStatus());
        System.out.println("Valor do Limite = " + x.getLimite());
        
        x.setSaque(1000.00);
        System.out.println(x.getSaldo());
        
        System.out.println("\n");
        
        Conta y = new Conta("0002", 300.00, "Inativo", 0);
        System.out.println("nº da conta = " + y.getNumConta());
        System.out.println("Saldo = " + y.getSaldo());
        System.out.println("Status do Limite = " + y.getStatus());
        System.out.println("Valor do Limite = " + y.getLimite());
        
        
      
        
        

    }

}
