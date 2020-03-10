package aula28_33_q2;

public class Conta {

    private String numConta;
    private double saldo;
    private String status;
    private double limite;
    private double saque;

    public Conta(String numConta, double saldo, String status, double limite) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.status = status;
        this.limite = limite;
    }
    
    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
      public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        if (saque > (limite + saldo)) {

            System.out.println("Saldo Insuficiente para o valor de saque desejado");
        } else {
            this.saldo = saldo - saque;
        }
    }
    public String getStatus(){
        return status;
          
    }
    public void setStatus(String status){
        this.status = status;
        
    }
    public double getLimite(){
      return limite;
    }
    public void setLimite(double limite){
        this.limite = limite;
        
    }
    
}
