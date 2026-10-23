package Aula21.AtividadeAdapter;

public class PayPalAdapter implements Pagamento {

    @Override
    public void pagar() {
        PayPalAPI payPalAPI = new PayPalAPI();
        payPalAPI.sendPayment();
    }
}
