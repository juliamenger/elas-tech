package PetShop;

import java.util.ArrayList;
import java.util.HashSet;

public class PetService {
    ArrayList<Pet> pets = new ArrayList<>();

    public void cadastrarPet (String nome, String especie, double peso) {
        Pet pet;

        if (especie.equalsIgnoreCase("Cachorro")) {
            pet = new Cachorro();
        } else if (especie.equalsIgnoreCase("Gato")) {
            pet = new Gato();
        } else {
            pet = new Pet();
        }

        pet.nome = nome;
        pet.especie = especie;
        pet.peso = peso;
        pet.porte = pet.definirPorte();
        pets.add(pet);

    }

    public int quantidadePets() {
        return pets.size();
    }

    public void listarPets() {
        if (pets.isEmpty()) {
            System.out.println("Nenhum pet cadastrado.");
        } else {
            System.out.println("--- PETS CADASTRADOS ---");
            for (Pet pet : pets) {
                System.out.print(pet.nome + " (" + pet.especie + ") - ");
                System.out.printf("%.1f kg - Porte %s\n", pet.peso, pet.porte);
                pet.emitirSom();
            }

        }
    }

    public Pet buscarPet(String busca) {
        //boolean achou = false;

        for (Pet pet : pets) {
            if (pet.nome.equalsIgnoreCase(busca)) {
                return pet;
                /* System.out.print("Encontrado: " + pets.get(i).nome + " (" + pets.get(i).especie + ") - ");
                System.out.printf("%.1f kg\n", pets.get(i).peso);
                achou = true; */
            }
        }
        return null;

        /* if (!achou) {
           // System.out.println("Pet não encontrado.");
        } */

    }

    public void listarEspecies () {
        HashSet<String> especies = new HashSet<>();

        for (Pet pet : pets) {
            especies.add(pet.especie);
        }
        System.out.println("--- ESPÉCIES CADASTRADAS ---");

        for(String especie : especies) {
            System.out.println("- " + especie);
        }

        System.out.println("Total de espécies diferentes: " + especies.size());
    }

    public void executarServicos(String nome) {
        ArrayList<Servico> servicos = new ArrayList<>();
        servicos.add(new Banho());
        servicos.add(new Tosa());
        servicos.add(new Consulta());

        for (Servico servico: servicos) {
            servico.executar(nome);
        }
    }
}
