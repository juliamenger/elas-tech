package Aula22.AtividadeDecorator;

public class Main {
    public static void main(String[] args) {
        //Açaí com granola
        Acai pedido1 = new ComGranola(new AcaiSimples());
        System.out.println(pedido1.getDescricao() + " = R$" + pedido1.getPreco());

        //Açaí com granola e morango
        Acai pedido2 = new ComMorango(new ComGranola(new AcaiSimples()));
        System.out.println(pedido2.getDescricao() + " = R$" + pedido2.getPreco());
    }

}
