package produto;

public class Software extends Produto {

    private double versao;

    public Software(String descricao, double valor, int qtdEstoque, double versao) {
        super(descricao, valor, qtdEstoque);

        this.versao = versao;

    }

    public double getVersao() {
        return versao;
    }

    public void setVersao(double versao) {
        this.versao = versao;
    }
    
   
     public void Imprimir(){
        System.out.println(this.getDescricao()+ " " + this.valor + " " + this.qtdEstoque + " " + this.versao);
    }
}
