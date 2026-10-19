package PetShop;

public class Tosa implements Servico {

    @Override
    public void executar(String nome) {
        System.out.println("Tosando " + nome + "...");
    }
}
