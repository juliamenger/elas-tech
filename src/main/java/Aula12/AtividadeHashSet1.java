package Aula12;

//1. Crie um HashSet de nomes e adicione quatro valores, sendo um deles
//   repetido. Imprima o conjunto e o tamanho. Repare no que aconteceu
//   com o repetido.

import java.util.HashSet;
import java.util.List;

public class AtividadeHashSet1 {
    public static void main(String[] args) {

        HashSet<String> nomes = new HashSet<>();
        nomes.addAll(List.of("Ana", "Bia", "Carla", "Ana"));
        System.out.println(nomes.size());
        System.out.println(nomes);

    }
}
//Não imprimiu o repetido.
