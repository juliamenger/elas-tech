package Aula7;

import java.util.Scanner;

public class AtividadeStrings {
    public static void main(String[] args) {

        String nome;
        String nome2;
        String frase;
        String palavra;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome completo:");
        nome = sc.nextLine();
        System.out.println( "Seu nome tem " + nome.length() + " letras.");

        System.out.println("Digite seu nome:");
        nome = sc.nextLine();
        System.out.println("Seu nome todo em maiúsculo: " + nome.toUpperCase());
        System.out.println("Seu nome todo em minúsculo: " + nome.toLowerCase());

        System.out.println("Digite seu nome");
        nome = sc.nextLine();
        System.out.println("A primeira letra do seu nome é: " + nome.charAt(0));

        System.out.println("Digite uma frase");
        frase =  sc.nextLine();
        System.out.println("Digite uma palavra");
        palavra = sc.nextLine();
        System.out.println("A palavra aparece na frase? " + frase.contains(palavra));

        System.out.println("Digite seu nome");
        nome = sc.nextLine();
        System.out.println("Digite de novo");
        nome2= sc.nextLine();
        System.out.println("Os nomes são iguais? " + nome.equalsIgnoreCase(nome2));


    }
}
