package PetShop;

import java.util.ArrayDeque;

public class FilaBanho {
    private ArrayDeque<String> fila = new ArrayDeque<>();

    public void entrarNaFila (String nome) {
        fila.add(nome);
        System.out.println(nome + " entrou na fila");
        mostrarFila();
    }

    public void mostrarFila() {
        System.out.println("Fila agora: " + fila);
    }

    public void atenderProximo() {
        if (fila.isEmpty()) {
            System.out.println("Não há pets na fila");
        } else {
            String proximo = fila.poll();
            System.out.println("Próximo da fila: " + proximo);
            System.out.println("Atendendo " + proximo + "...");
            mostrarFila();
        }
    }
}
