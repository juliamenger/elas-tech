package Aula17;

public class MainProduto {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setNome("Caderno");
        produto.setPreco(25.90);
        produto.setQuantidade(10);

        produto.setPreco(-5.0);

        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());
    }
}

