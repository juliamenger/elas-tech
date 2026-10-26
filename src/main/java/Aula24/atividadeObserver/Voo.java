package Aula24.atividadeObserver;

import java.util.ArrayList;

public class Voo {
    private ArrayList<ObservadorVoo> observadorVoos = new ArrayList<>();

    public void adicionarObservador(ObservadorVoo o) {
        this.observadorVoos.add(o);
    }

    public void mudarStatus(String status) {
        for(ObservadorVoo observadorVoo : observadorVoos) {
            observadorVoo.atualizar(status);
        }
    }

}
