
public class Produtos {
    private String descricao;
    private double precoAtual, preco;
    private int quantidade, novaQuantidade;
    
    
    public void setPreco(double precoAtual){
        preco = precoAtual;
}
    public double getPreco(){
        return preco;
    }
       
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
     public String getDescricao(){
        return descricao;
    }
     
     public void setQuantidade(int novaQuantidade){
         quantidade = novaQuantidade + quantidade;
         
     }
     public int getQuantidade(){
         return quantidade;
         
     }
}

