package AtividadesTestes;

public class CalculadoraDesconto {

    public double aplicarDesconto(double valorCompra, boolean clienteVIP) {
        if (valorCompra<= 0) {
            throw new IllegalArgumentException("Valor da compra não pode ser zero nem negativo");
        } else if (valorCompra<100 && !clienteVIP) {
            return valorCompra;
        }else if (clienteVIP) {
            return valorCompra * 0.90;
        }
        return valorCompra;
    }
}
