package Aula11;

//- Crie uma lista já preenchida com quatro frutas. Imprima a primeira, a última e quantas frutas tem.

import java.util.ArrayList;
import java.util.List;

public class Atividade2 {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>(List.of("Morango", "Banana", "Maçã", "Manga"));
        System.out.println(lista.get(0));
        System.out.println(lista.get(3));
        System.out.println(lista.size());

    }
}
