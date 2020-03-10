
public class Poupanca extends Conta {
    private double taxa;
    
    public Poupanca(String id, double saldo, double taxa){
        super(id, saldo);
        this.taxa = taxa;
               
    }
    
    public void renderJuros(){
        creditar(juros);
    }
    
    
}
