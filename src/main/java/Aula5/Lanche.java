package Aula5;

//1 - Crie um programa que peça ao usuário para digitar o nome de um lanche e o valor dele. Em seguida, verifique: se o valor for maior que R$ 30.00, aplique um desconto de R$ 5.00. No final, exiba uma mensagem usando concatenação e printf para formatar o preço com duas casas decimais.
//Exemplo de saída: "O lanche Xis-Bacon custa R$ 28.50 \n"

import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String lanche;
        double valorLanche;

        System.out.println("Qual lanche você quer para hoje?");
        lanche = sc.nextLine();
        System.out.println("Seu lanche escolhido foi:  "+ lanche);

        System.out.println("Quanto é o seu lanche?");
        valorLanche = sc.nextDouble();


        if (valorLanche>30.00) {
            valorLanche-=5.00;
        }

        System.out.printf("O lanche " + lanche + " fica: %.2f\n", valorLanche);

    }
}
