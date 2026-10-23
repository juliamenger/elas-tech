package Aula22.AtividadeDecorator;

public abstract class AcaiDecorator implements Acai {
    protected Acai acaiEmbrulhado;

    public AcaiDecorator(Acai acai) {
        this.acaiEmbrulhado = acai;
    }
}
