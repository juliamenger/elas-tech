package Aula11;
//- Crie uma lista com quatro nomes. Troque o nome da posição 2 por outro e imprima a lista antes e depois.

import java.util.ArrayList;
import java.util.List;

public class Atividade3 {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>(List.of("Maria", "Ana", "Isabela", "Gabriela"));
        System.out.println(lista);

        lista.set(2, "Cristina");
        System.out.println(lista);

    }
}
