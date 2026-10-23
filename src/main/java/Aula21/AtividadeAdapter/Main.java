package Aula21.AtividadeAdapter;

public class Main {
    public static void main(String[] args) {
        //1. Escreva, como comentário, a linha que tentaria usar PayPalAPI direto como Pagamento (a que não compila).
        //Pagamento pg = new PayPalAPI();

        //2. Crie uma variável do tipo Pagamento usando o adapter e chame pagar().
        Pagamento pg = new PayPalAdapter();
        pg.pagar();
    }
}
