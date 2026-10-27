package Aula24.atividadeObserverVoo;

import java.util.ArrayList;

public class Voo {
    private ArrayList<ObservadorVoo> observadores = new ArrayList<>();

    public void adicionarObservador(ObservadorVoo o) {
        this.observadores.add(o);
    }

    public void mudarStatus(String status) {
        for(ObservadorVoo observadorVoo : observadores) {
            observadorVoo.atualizar(status);
        }
    }

}
