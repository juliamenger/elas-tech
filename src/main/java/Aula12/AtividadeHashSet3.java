package Aula12;

//3. Crie um ArrayList com nomes repetidos. Use new HashSet<>(lista) para tirar os repetidos. Imprima os dois e compare.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class AtividadeHashSet3 {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>(List.of("Júlia", "Ana", "Júlia", "Ana"));
        System.out.println(nomes);

        HashSet<String> lista = new HashSet<>(List.of("Júlia", "Ana", "Júlia", "Ana"));
        System.out.println(lista);
    }
}
