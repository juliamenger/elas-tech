package Aula5;

/*3 - Usando um do-while e um switch, crie um menu interativo. O menu deve oferecer três opções:
1 - Ver camisas
2 - Ver calças
3 - Sair
Se a pessoa digitar 1 ou 2, exiba uma mensagem confirmando a escolha. Se digitar uma opção inválida, avise. O laço só deve ser quebrado (encerrado) quando a pessoa digitar 3.*/

import java.util.Scanner;

public class ListaDeRevisao3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcoes;

            do {
                System.out.println("Escolha uma opção:\n" + "1 - Ver camisas\n" + "2 - Ver calças\n" + "3 - Sair");
                opcoes = sc.nextInt();

                switch (opcoes) {
                    case 1:
                        System.out.println("Ver Camisas");
                        break;
                    case 2:
                        System.out.println("Ver Calças");
                        break;
                    case 3:
                        System.out.println("Sair");
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
            }
            while (opcoes !=3);

    }
}
