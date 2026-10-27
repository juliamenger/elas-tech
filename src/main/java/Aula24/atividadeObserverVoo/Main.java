package Aula24.atividadeObserverVoo;

public class Main {
    public static void main(String[] args) {

    Voo voo = new Voo();

    Passageiro passageiro = new Passageiro();
    voo.adicionarObservador(passageiro);

    voo.mudarStatus("Embarque iniciado");

    PainelAeroporto painel = new PainelAeroporto();

    voo.adicionarObservador(painel);

    voo.mudarStatus("Atrasado");

    }
}
