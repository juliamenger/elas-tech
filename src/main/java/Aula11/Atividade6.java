package Aula11;
//- Crie uma lista com cinco nomes. Peça um nome à pessoa e diga se ele está na lista e em qual posição. Se não estiver, avise.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>(List.of("Maria", "Morgana", "Júlia", "Natacha", "Alicia"));

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um nome");
        String nome = sc.nextLine();

        if (lista.contains(nome)) {

        System.out.println("Seu nome está na lista. Sua posição é: " + lista.indexOf(nome));

        } else {
            System.out.println("Seu nome não está na lista");
        }


    }
}
