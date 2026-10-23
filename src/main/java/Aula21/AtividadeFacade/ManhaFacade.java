package Aula21.AtividadeFacade;

public class ManhaFacade {

    Despertador despertador = new Despertador();
    Cafeteira cafeteira = new Cafeteira();
    Chuveiro chuveiro = new Chuveiro();

    public void acordar() {

        despertador.desligar();
        cafeteira.fazerCafe();
        chuveiro.ligar();

    }
}
