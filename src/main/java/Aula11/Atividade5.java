package Aula11;

//- Crie uma lista com seis nomes e imprima todos usando um laço, no formato `"0: Ana"`. (Dica: i + ": " + comando para pegar posição da lista)

import java.util.ArrayList;
import java.util.List;

public class Atividade5 {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>(List.of("Maria", "Ana", "Isabela", "Gabriela", "Júlia", "Morgana"));
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + ": " + lista.get(i));
        }
    }
}
