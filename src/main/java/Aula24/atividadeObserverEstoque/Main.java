package Aula24.atividadeObserverEstoque;

public class Main {

    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        RegistroEstoque registroEstoque = new RegistroEstoque();

        estoque.adicionarObservador(registroEstoque);

        estoque.setQuantidade(2);

        estoque.setQuantidade(5);

    }
}
