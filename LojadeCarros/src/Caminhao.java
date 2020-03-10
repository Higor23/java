
public class Caminhao extends Veiculo{
    
    private double carga;
    public Caminhao(double motor, double n_rodas, double carga){
        super (motor, n_rodas);
        this.carga = carga;
        
        
    }
    public void setcarga(double carga){
        this.carga = carga;
    }
    public double getcarga(double carga){
        return carga;
        
    }
    public void mostrar(){
        System.out.println(motor + "" + n_rodas + ""+ carga);
    }
           
}
