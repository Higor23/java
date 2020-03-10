package veiculo;

public class Caminhao extends Veiculo {

    private double carga;

    public Caminhao(String motor, int n_rodas, double carga) {
        super(motor, n_rodas);

    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public double getCarga() {
        return carga;

    }
    public void mostrar(){
        System.out.println("motor: " + motor + "\nnº de rodas: " + n_rodas + "\nCarga: " + carga);
    }
}
