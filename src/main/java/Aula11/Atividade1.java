package Aula11;

//- Crie uma lista vazia de nomes. Adicione três nomes e imprima a lista inteira.

import java.util.ArrayList;
import java.util.List;

public class Atividade1 {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        lista.addAll(List.of("Júlia", "Maria", "Ana"));
        System.out.println(lista);

    }
}
