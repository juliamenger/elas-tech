package Aula12;

//5. Crie um HashSet com três frutas e percorra ele com for, imprimindo uma por linha.

import java.util.HashSet;
import java.util.List;

public class AtividadeHashSet5 {
    public static void main(String[] args) {

        HashSet<String> frutas = new HashSet<>(List.of("morango", "banana", "maçã"));

        for (String fruta : frutas)
            System.out.println(fruta);
    }
}
