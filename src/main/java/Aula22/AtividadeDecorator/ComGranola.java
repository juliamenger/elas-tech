package Aula22.AtividadeDecorator;

public class ComGranola extends AcaiDecorator{
    public ComGranola(Acai acai) {
        super(acai);
    }

    @Override
    public String getDescricao() {
        return acaiEmbrulhado.getDescricao() + " + Granola";
    }

    @Override
    public double getPreco() {
        return acaiEmbrulhado.getPreco() + 2.00;
    }
}
