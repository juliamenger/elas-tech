package Aula21.AtividadeFactory;

public class Main {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.getAnimal("cachorro");
        animal.emitirSom();
        Animal animal2 = AnimalFactory.getAnimal("gato");
        animal2.emitirSom();

    }
}
