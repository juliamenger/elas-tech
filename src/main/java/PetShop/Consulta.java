package PetShop;

public class Consulta implements Servico {

    @Override
    public void executar(String nome) {
        System.out.println("Levando " + nome + " para a consulta...");
    }
}
