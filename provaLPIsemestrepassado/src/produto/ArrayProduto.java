package produto;

public class ArrayProduto {

    private Produto[] estoque = new Produto[10];

    public void inserirProduto(Produto itens) {
        int i;
        for (i = 0; i < estoque.length; i++) {
            if (estoque[i] == null) {  // Verifica se é nulo. Sendo nulo:
                estoque[i] = itens; // Insere o produto no vetor.
                break;
            } else if (i == estoque.length - 1) {
                System.out.println("Vetor cheio, produto não pôde ser inserido");
            }

        }
    }

    public void imprimirProdutos() {
        for (int i = 0; i < estoque.length; i++) {
            if (estoque[i] == null) {
                break;
            }
            System.out.println((i + 1) + " " + estoque[i].descricao + " "
                    + estoque[i].valor + " " + estoque[i].qtdEstoque);
            //estoque[i].Imprimir();
        }
    }
}
