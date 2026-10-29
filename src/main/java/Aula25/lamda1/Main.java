package Aula25.lamda1;

public class Main {
    public static void main(String[] args) {
        Saudacao saudacao = () -> System.out.println("oi");
        saudacao.executar();

        Impressora impressoraMaiusc = (String texto) -> System.out.println(texto.toUpperCase());

        Impressora impressoraMinusc = (String texto) -> System.out.println(texto.toLowerCase());

        impressoraMaiusc.imprimir("júlia");
        impressoraMinusc.imprimir("JÚLIA");

        Calcular soma = (a, b) -> a + b;

        Calcular multiplicacao = (a, b) -> a * b;

        Calcular maiorQue = (a, b) -> Math.max(a, b);

        System.out.println(soma.calcular(10,5));

        System.out.println(multiplicacao.calcular(5,2));

        System.out.println(maiorQue.calcular(2,5));
    }
}
