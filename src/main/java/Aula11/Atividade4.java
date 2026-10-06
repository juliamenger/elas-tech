package Aula11;
//- Crie uma lista com quatro cidades. Remova a da posição 1 e imprima quantas sobraram.

import java.util.ArrayList;
import java.util.List;

public class Atividade4 {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>(List.of("Seul", "Lisboa", "Paris", "Tóquio"));
        lista.remove(1);
        System.out.println(lista.size());

    }

}
