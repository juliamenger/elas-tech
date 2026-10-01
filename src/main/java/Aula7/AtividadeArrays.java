package Aula7;

import java.util.Scanner;

public class AtividadeArrays {
    public static void main(String[] args) {

        //1 — Crie um array com os nomes de 5 pessoas. Mostre o primeiro, o terceiro e o último.

        String[] nomes = {"Júlia", "Alicia", "Samuel", "Benjamin", "Robson"};

        System.out.println(nomes[0]);
        System.out.println(nomes[2]);
        System.out.println(nomes[4]);


        //2 — Crie um array com as notas {8, 6, 10, 7, 9}. Usando um laço, mostre todas, uma por linha, assim: "Nota 1: 8".

        int[] notas = {8, 6, 10, 7, 9};



        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i+1) + ": " + notas[i]);
        }

        //3 — Com o mesmo array de notas, calcule e mostre a soma e a média.
        int soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        int media = soma / notas.length;

        System.out.println("A soma das notas é: " + soma);
        System.out.println("A média das notas é: " + media);

        // 4 — Peça 5 números para a pessoa, guarde num array, e depois mostre todos de trás pra frente.

        Scanner sc = new Scanner(System.in);

        int [] numeros = new int [5];


        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite 1 número: ");
            numeros[i] = sc.nextInt();

        }

        for (int i = numeros.length-1; i >= 0; i--) {
            System.out.println(numeros[i]);

        }


    }


}
