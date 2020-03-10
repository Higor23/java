
package veiculo;

public class Veiculo {
    protected String motor;
    protected int n_rodas;

    public Veiculo(String motor, int n_rodas) {
        this.motor = motor;
        this.n_rodas = n_rodas;
    }
    
    public void setMotor(String motor){
        this.motor = motor;
    }
    public String getMotor(){
        return motor;
        
    }
    public void setRodas(int n_rodas){
        this.n_rodas = n_rodas;
    }
    
    public int getN_Rodas(){
        return n_rodas;
    }  
}
