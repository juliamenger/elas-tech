package Aula22;

public class Main {
    public static void main(String[] args) {
        //Café puro
       Cafe pedido1 = new CafeSimples();
        System.out.println(pedido1.getDescricao() + " = R$" + pedido1.getPreco());

        //Café com leite
        Cafe pedido2 = new ComLeite(new CafeSimples());
        System.out.println(pedido2.getDescricao() + " = R$" + pedido2.getPreco());

        //Café com leite E chocolate
        Cafe pedido3 = new ComChocolate(new ComLeite(new CafeSimples()));
        System.out.println(pedido3.getDescricao() + " = R$" + pedido3.getPreco());

        //Café com chocolate E leite
        Cafe pedido4 = new ComLeite(new ComChocolate(new CafeSimples()));
        System.out.println(pedido4.getDescricao() + " = R$" + pedido4.getPreco());

    }
}
