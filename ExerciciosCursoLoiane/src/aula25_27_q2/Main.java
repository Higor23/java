package aula25_27_q2;

public class Main {

    public static void main(String[] args) {
        Conta x = new Conta();

        x.numero = 01;
        x.saldo = 100.00;
        x.status = "Especial";
        x.limite = 500.00;
        

        double saque = x.sacar(100.00);
        if (saque > (x.limite + x.saldo)) {
            System.out.println("Saldo Insuficiente");
            System.out.println("Saldo = " + (x.saldo - x.saque));

        } else {
            System.out.println("Operação realizada com sucesso.");
            System.out.println("Saldo = " + x.saldo);
        }
        
        x.saldo = x.saldoAtual;

        double saldoAtual = x.depositar(200.00);
        System.out.println("Saldo = " + saldoAtual);
        
        x.saldo = x.saldoAtual;

    }

}
