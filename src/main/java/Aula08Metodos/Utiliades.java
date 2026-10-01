package Aula08Metodos;


import java.util.Scanner;

public class Utiliades {

    //2 — Crie um método saudar(String nome) que imprime "Olá, [nome]! Tudo bem?". Chame ele três vezes, passando nomes diferentes.

    static void saudar (String nome) {
        System.out.println("Olá, " + nome + "! Tudo bem?");
    }

    //3 — Crie um método dobro(int numero) que devolve o dobro do número recebido. No main, chame ele e mostre o resultado.

    static int dobro (int numero) {
        int dobro = numero * 2;
        return dobro;

    }

    /* 4 — Crie um método calcularMedia(double n1, double n2) que devolve a média das duas notas. No main, peça as duas notas com Scanner e mostre a média com duas casas decimais. */

    static double calcularMedia(double n1, double n2) {
        double media = (n1 + n2) / 2;
        return media;
    }

    /*5 — Crie um método ehMaiorDeIdade(int idade) que devolve true ou false. No main, peça a idade e use o retorno do método dentro de um if para imprimir se a pessoa é maior ou menor de idade.*/

    static boolean ehMaiorDeIdade(int idade) {

        return false;
    }


}
