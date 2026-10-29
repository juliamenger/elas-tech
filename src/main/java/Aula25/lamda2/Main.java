package Aula25.lamda2;

public class Main {
    static void repetirAcao(Acao acao) {
        acao.executar();
        acao.executar();
    }

    static void mostrarResultado(Operacao op, int valor) {
        System.out.println(op.aplicar(valor));
    }

    static void executarSe(Condicao cond, int valor, Acao acao) {
        if (cond.testar(valor) == true) {
            acao.executar();
        }
    }

    public static void main(String[] args) {
        repetirAcao(() -> System.out.println("Oi"));

        mostrarResultado((valor) -> valor*2, 5);

        executarSe((int n) -> n % 2 == 0, 7, () ->System.out.println("é par!"));
    }
}

