package Aula12;

//6. Crie um HashSet vazio. Imprima o isEmpty(). Adicione um valor e imprima o isEmpty() de novo.

import java.util.HashSet;

public class AtividadeHashSet6 {
    public static void main(String[] args) {

        HashSet<String> atividade = new HashSet<>();
        System.out.println(atividade.isEmpty());

        atividade.add("HashSet");
        System.out.println(atividade.isEmpty());
    }
}
