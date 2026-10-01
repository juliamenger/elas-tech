package Aula08Metodos;
// 1 — Na mesma classe do main, crie um método chamado mostrarBoasVindas() que imprime "Bem-vinda ao curso de Java!". Chame ele no main.

import java.util.Scanner;

public class AtividadeMetodos {



    public static void main(String[] args) {


        mostrarBoasVindas();

        Utiliades.saudar("Júlia");
        Utiliades.saudar("Maria");
        Utiliades.saudar("Ana");

        System.out.println(Utiliades.dobro(10));

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double n1 = sc.nextDouble();
        System.out.println("Digite a segunda nota:");
        double n2 = sc.nextDouble();
        System.out.printf("A média é: %.2f%n", Utiliades.calcularMedia(n1, n2));

    }

    static void mostrarBoasVindas(){
        System.out.println("Bem vinda ao curso de Java!");
    }

}
