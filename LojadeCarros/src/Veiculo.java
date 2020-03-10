
public class Veiculo {

    protected double motor;
    protected double n_rodas;

    public Veiculo(double motor, double n_rodas) {
        this.motor = motor;
        this.n_rodas = n_rodas;

    }
    public void setRodas(double n_rodas){
        this.n_rodas = n_rodas;
    }
    public double get_rodas(){
        return n_rodas;
 
    }
  

}
