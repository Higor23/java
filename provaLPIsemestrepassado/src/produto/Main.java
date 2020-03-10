package produto;

public class Main {

    public static void main(String[] args) {
        
        Software programa1 = new Software("Word", 2.3, 30, 10.6);
        Software programa2 = new Software("Excel", 2.8, 10, 20.5);
        //programa1.Imprimir();
        

        ArrayProduto itens = new ArrayProduto();
        itens.inserirProduto(new Produto("Arroz", 10.2, 2));
        itens.inserirProduto(new Produto("Feijão", 2.5, 3));
        itens.inserirProduto(new Produto("Feijão", 2.5, 3));
        itens.inserirProduto(new Produto("Feijão", 2.5, 3));
        itens.inserirProduto(new Produto("Feijão", 2.5, 3));
        itens.inserirProduto(new Produto("Feijão", 2.5, 3));
        itens.inserirProduto(new Produto("Feijão", 2.5, 3));
        itens.inserirProduto(new Produto("Peixe cru", 2.5, 3));
        itens.inserirProduto(new Produto("Feijão", 2.5, 3));
        itens.inserirProduto(new Produto("Salame", 2.5, 3));
        itens.inserirProduto(new Produto("Feijão", 2.5, 3));

        itens.imprimirProdutos();

    }

}
