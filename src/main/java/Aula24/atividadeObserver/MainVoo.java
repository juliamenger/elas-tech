package Aula24.atividadeObserver;

public class MainVoo {
    public static void main(String[] args) {

    Voo voo = new Voo();

    Passageiro passageiro = new Passageiro();

    voo.mudarStatus("Embarque iniciado");

    PainelAeroporto painel = new PainelAeroporto();
    voo.mudarStatus("Atrasado");

    }
}
