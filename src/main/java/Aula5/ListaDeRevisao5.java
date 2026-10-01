package Aula5;

import java.util.Scanner;

public class ListaDeRevisao5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Digite o nome do produto: ");
            produto.nome = sc.nextLine();
            System.out.println("Digite o preço do produto: ");
            produto.preco = sc.nextDouble();
            sc.nextLine();
            if (produto.preco>100) {
                System.out.printf("Produto caro! Preço do produto: %.2f\n", produto.preco);
            }
            else {
                System.out.printf("Produto com preço acessível! Preço do produto: %.2f\n", produto.preco);
            }

        }

    }
}

