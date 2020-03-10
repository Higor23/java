package veiculo;

public class Automovel extends Veiculo {

    private String tipo;
    
    public Automovel(String motor, int n_rodas, String tipo){
        super(motor, n_rodas);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void mostrar(){
        System.out.println("motor: " + motor + " \nnº de rodas: " + n_rodas + " \nTipo: " + tipo + "\n");
    }

}
