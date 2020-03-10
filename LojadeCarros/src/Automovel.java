
public class Automovel extends Veiculo{
    private String tipo;

        
    public Automovel(double motor, double n_rodas, String tipo) {
        
        super(motor, n_rodas);
        this.tipo = tipo;       
    }
    public void settipo(String tipo){
        this.tipo = tipo;
    }
    
    public String gettipo(String tipo){
        return tipo;
    }
    
    public void mostrar(){
        System.out.println(motor + n_rodas + tipo);
    }

}
