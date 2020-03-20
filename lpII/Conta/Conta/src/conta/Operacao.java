
package conta;


public class Operacao {
    private double valor;
    private TipoOperacao tipo;
    private Conta conta;
    private Data data; //Não sei utilizar a classe Data, não tivemos esse conteúdo.

    public Operacao(double valor, TipoOperacao tipo, Conta conta, Data data) {
        this.valor = valor;
        this.tipo = tipo;
        this.conta = conta;
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoOperacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoOperacao tipo) {
        this.tipo = tipo;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
   
    
    
    
    
}
