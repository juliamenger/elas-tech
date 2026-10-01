package Aula2;

public class operacoes {
    public static void main(String[] args) {

        //Crie variáveis para um nome, uma cidade e uma idade. Mostre em uma única linha: "Meu nome é Ana, moro em Salvador e tenho 28 anos."
        String nome = "Ana";
        String cidade = "Salvador";
        int idade = 28;
        System.out.println("Meu nome é " + nome + ", moro em " + cidade + " e tenho " + idade + " anos");

        //Crie variáveis para o nome de um produto ("Caneca"), o preço (12.50) e a quantidade (4). Mostre: "Comprei 4 unidades de Caneca por R$ 12.5 cada. Total: R$ 50.0"
        String produto = "Caneca";
        double precoProduto = 12.50;
        int quantidadeProduto = 4;
        double totalProdutos = precoProduto * quantidadeProduto;
        System.out.println("Comprei " + quantidadeProduto + " unidades de " + produto + " por R$ " + precoProduto + " cada. Total: R$" + totalProdutos);

        //Crie duas variáveis com números inteiros. Mostre a soma em uma frase completa, assim: "A soma de 15 e 4 é igual a 19."
        int numero1 = 15;
        int numero2 = 4;
        int soma = numero1 + numero2;
        System.out.println("A soma de " + numero1 + " e " + numero2 + " é igual a " + soma);

        //Explique em um comentário por que deram resultados diferentes.
        System.out.println("2 + 2 = " + 2 + 2); //aqui ele só está digitando o número 2, duas vezes, concatenação.
        System.out.println("2 + 2 = " + (2 + 2)); // aqui, como tem o parantêses, ele está de fato, somando.

        //Crie variáveis para dois números inteiros de valor a = 10 e b = 3 e mostre na tela: soma, subtração, multiplicação, divisão e resto.
        int a = 10;
        int b = 3;
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Resto: " + (a % b));

        //Crie variáveis para dois números decimais de valor a = 10 e b = 3 e mostre na tela: soma, subtração, multiplicação, divisão e resto.
        double decimalA = 10;
        double decimalB = 3;
        System.out.println("Soma: " + (decimalA + decimalB));
        System.out.println("Subtração: " + (decimalA - decimalB));
        System.out.println("Multiplicação: " + (decimalA * decimalB));
        System.out.println("Divisão: " + (decimalA / decimalB));
        System.out.println("Resto: " + (decimalA % decimalB));

       //Crie variáveis para três notas (8, 6 e 10). Mostre a soma e a média.
        double nota1 = 8;
        double nota2 = 6;
        double nota3 = 10;
        double somaNotas = (nota1 + nota2 + nota3);
        double mediaNotas = (somaNotas /3);
        System.out.println("Soma das notas: " + somaNotas + ". Média das notas: " +mediaNotas);

        // Faça a operação a + b * c, sendo a = 3, b = 4 e c = 5.
       int operadorA = 3;
       int operadorB = 4;
       int operadorC = 5;
       double operacao =  (operadorA + operadorB * operadorC);
       double operacao2 = ((operadorA + operadorB) * operadorC);

       //Desafio: Crie uma variável com 3785 segundos. Mostre quantos minutos inteiros isso dá e quantos segundos sobram.
        //Dica: segundos/60 dá os minutos. segundos % 60 mostra os segundos restantes.
        int segundos = 3785;
        int minutos = (segundos / 60);
        int segundosRestantes = (segundos % 60);
        System.out.println(segundos);
        System.out.println(minutos);
        System.out.println(segundosRestantes);

    }
}
