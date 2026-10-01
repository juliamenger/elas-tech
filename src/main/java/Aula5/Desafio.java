package Aula5;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        int opcao = 0;

        Scanner sc = new Scanner(System.in);

        while (opcao !=2) {

            System.out.println("Quer iniciar? \n1. Continuar \n2. Sair");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    Aluna aluna = new Aluna();

                    System.out.println("Digite sua primeira nota:");
                    aluna.nota = sc.nextDouble();
                    System.out.println("Digite sua segunda nota:");
                    aluna.nota2 = sc.nextDouble();
                    sc.nextLine();
                    aluna.media = ((aluna.nota + aluna.nota2) /2);
                    System.out.println("Qual seu nome?");
                    aluna.nome = sc.nextLine();

                    if (aluna.media>=6) {
                        aluna.passou = true;
                    }
                    else {
                        aluna.passou = false;
                    }
                    if (aluna.passou) {
                        aluna.resultado = "Aprovada";
                    }
                    else {
                        aluna.resultado = "Reprovada";
                    }

                    System.out.printf( "O nome da aluna é %s, sua primeira nota foi %.1f, sua segunda nota foi %.1f e sua média final foi %.1f. Aluna aprovada: %s%n",
                            aluna.nome,
                            aluna.nota,
                            aluna.nota2,
                            aluna.media,
                            aluna.resultado);
                    break;

                case 2:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Voltando ao menu.");

            }
        }


    }
}
