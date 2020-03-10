package produto;

public class Produto {

    protected String descricao;
    protected double valor;
    protected int qtdEstoque;


    public Produto(String descricao, double valor, int qtdEstoque) {
        this.descricao = descricao;
        this.valor = valor;
        this.qtdEstoque = qtdEstoque;

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public void Imprimir() {
        System.out.println(this.descricao + " " + this.valor + " " + this.qtdEstoque);
    }
}
