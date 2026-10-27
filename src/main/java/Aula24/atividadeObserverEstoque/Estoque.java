package Aula24.atividadeObserverEstoque;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<ObservadorEstoque> observadores = new ArrayList<>();

    public void adicionarObservador(ObservadorEstoque obsEstoque) {
        this.observadores.add(obsEstoque);
    }

    public void setQuantidade(int quantidade) {
        for(ObservadorEstoque obsEstoque : observadores) {
            obsEstoque.atualizar(quantidade);

        }
    }

}
