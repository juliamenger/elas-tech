package AtividadesTestes;

import Aula23.CalculadoraSimples;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDescontoTest {
        private CalculadoraDesconto calculadoraDesc;

    @BeforeEach
    void criarObjeto() {
        calculadoraDesc = new CalculadoraDesconto();
    }

    @Test
    void teste1() {
        double resultado = calculadoraDesc.aplicarDesconto(50, false);

        assertEquals(50, resultado);
    }

    @Test
    void teste2() {
        double resultado = calculadoraDesc.aplicarDesconto(200, true);

        assertEquals(180, resultado);
    }

    @Test
    void teste3() {
        assertThrows(IllegalArgumentException.class, () -> calculadoraDesc.aplicarDesconto(-10, false));
    }
}