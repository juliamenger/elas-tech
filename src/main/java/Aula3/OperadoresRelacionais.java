package Aula3;

public class OperadoresRelacionais {
    public static void main(String[] args) {

    /* 1- Crie variáveis para as notas de duas alunas. Mostre na tela o resultado de: são iguais, são diferentes, a primeira é maior, a primeira é menor para quando:
- a = 10, b = 3
- a = 3, b = 10
- a = 5, b = 5
2- Exiba na tela a == b, sendo a = 10 e b 3.
3- Exiba na tela a != b, sendo a = 10 e b = 3.
4- Dado boolean chovendo = true, retorne na tela o resultado de !chovendo */

        int a = 10;
        int b = 3;
        System.out.println("são iguais? " + (a == b));
        System.out.println("são diferentes? " + (a != b));
        System.out.println("Primeira nota é maior? " + (a > b));
        System.out.println("Primeira nota é menor? " + (a < b));

        boolean estaChovendo = true;
        if (estaChovendo = true) {
            System.out.println("Está chovendo!");
        }
    }
}
