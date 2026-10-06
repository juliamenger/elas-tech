package Aula11;

/*      .add(); adicionar
        .get(); acessar, pegar
        .size(); tamanho da lista
        .contains(); se contem tal valor, retorna true ou false
        .indexOf(); fala em qual posicao esta tal valor
        .remove(); remover, coloca a posicao
        .set(); substituir, "replace", coloca a posicao e depois passa o valor
        .isEmpty(); saber se esta vazia
        .addAll(List.of()); adicionar varios */

import java.util.ArrayList;
import java.util.List;

public class AulaArrayList {
    public static void main(String[] args) {

        //ArrayList<Integer> lista = new ArrayList<>(List.of(1,2,3));

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(100);
        lista.addAll(List.of(1, 2, 3, 4, 5));
        System.out.println(lista);

        lista.set(0, 98);
        System.out.println(lista);

        System.out.println(lista.contains(98));

        lista.add(0,7);
        System.out.println(lista);

        System.out.println(lista.indexOf(7));
    }
}
