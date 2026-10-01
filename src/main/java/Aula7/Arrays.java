package Aula7;

public class Arrays {
    public static void main(String[] args) {
        int[] notas = {3, 4, 7, 9};
        int[] outrasNotas = new int[3];

        System.out.println(notas[1]);
        System.out.println(notas.length);

        for (int i = 0; i < notas.length; i++) {
            System.out.println("A nota é: " + notas[i]);
        }

    }

}
