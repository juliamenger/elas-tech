package Aula5;

public class NovosPets {
    public static void main(String[] args) {

        Pet gato = new Pet();

        gato.nome = "Kaio";
        gato.raca = "Tigrado";
        gato.peso = 4.500;

        Pet cachorro = new Pet();
        cachorro.nome = "Kiara";
        cachorro.raca = "Border Collie";
        cachorro.peso = 13.800;

        System.out.println("Meu pet é um Gato. O nome dele é: " + gato.nome + ". A raça dele é: " + gato.raca + ". O peso dele é: " + gato.peso);

        System.out.println("Meu pet é um Cachorro. O nome dele é: " + cachorro.nome + ". A raça dele é: " + cachorro.raca + ". O peso dele é: " + cachorro.peso);
    }
}


