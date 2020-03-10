
public class Supermercado {


    public static void main(String[] args) {
        Produtos x = new Produtos();
        x.setDescricao("Arroz");
        x.setPreco(300);
        x.setQuantidade(2);
        x.setQuantidade(4);
        
       
        
        System.out.println("Descrição: " + x.getDescricao()+"\nPreco: " + x.getPreco()+ "\nQuantidade: " + x.getQuantidade());

    }
    
}
