package Aula24.atividadeObserver;

public class PainelAeroporto implements ObservadorVoo {

    @Override
    public void atualizar(String status) {
        System.out.println("Painel: " + status);
    }
}
