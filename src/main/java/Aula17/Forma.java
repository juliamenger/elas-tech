package Aula17;
//um atributo nome;
//um construtor que recebe o nome;
//um método normal exibirNome(), que imprime o nome da forma;
//um método abstrato calcularArea(), que retorna um double.

public abstract class Forma {
    String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public void exibirNome() {
        System.out.println(nome);
    }
    public abstract double calcularArea();
}
