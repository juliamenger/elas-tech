package PetShop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {

        PetService service = new PetService();

        FilaBanho filaBanho = new FilaBanho();

        int opcao = -1;

        Scanner sc = new Scanner (System.in);

        while (opcao != 0) {
            System.out.println("=== PETSHOP ===\n" +
                    "0 - Sair\n" +
                    "1 - Cadastrar pet\n" +
                    "2 - Listar pets\n" +
                    "3 - Buscar pet\n" +
                    "4 - Ver quais espécies estão cadastradas\n" +
                    "5 - Entrar na fila do banho\n" +
                    "6 - Atender o próximo\n" +
                    "7 - Executar serviços\n" +
                    "Escolha:");

            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {

                    case 0:
                        System.out.println("Até logo!");

                        break;

                    case 1:

                        System.out.println("Qual o nome do seu pet?");
                        String nome = sc.nextLine();

                        System.out.println("Qual a espécie do seu pet?");
                        String especie = sc.nextLine();

                        System.out.println("Qual o peso do seu pet?");
                        Double peso = sc.nextDouble();
                        sc.nextLine();

                        service.cadastrarPet(nome, especie, peso);

                        System.out.println("Pet cadastrado! Agora são " + service.quantidadePets() + " pet(s).");

                        break;

                    case 2:
                        service.listarPets();

                        break;

                    case 3:
                        System.out.println("Qual pet você procura?");

                        String busca = sc.nextLine();

                        Pet pet = service.buscarPet(busca);
                        if (pet != null) {
                            mostrarFicha(pet);
                            System.out.println("---");
                            mostrarFicha(pet, "=== FICHA DO PET ===");
                        } else {
                            System.out.println("Pet não encontrado.");
                        }

                        break;

                    case 4:
                        service.listarEspecies();

                        break;

                    case 5:
                        System.out.println("Nome do pet pra entrar na fila: ");
                        nome = sc.nextLine();
                        filaBanho.entrarNaFila(nome);

                        break;

                    case 6:
                        filaBanho.atenderProximo();

                        break;

                    case 7:
                        System.out.println("Nome do Pet: ");
                        nome = sc.nextLine();
                        service.executarServicos(nome);

                        break;


                    default:
                        System.out.println("Opção inválida.");
                }

            } catch (InputMismatchException e) {
                        System.out.println("Digite apenas números!");
                        sc.nextLine();
                }

        }

    }

    static void mostrarFicha(Pet pet) {
        System.out.println("Nome: " + pet.nome);
    }

    static void mostrarFicha(Pet pet, String titulo) {
        System.out.println(titulo);
        System.out.println("Nome: " + pet.nome);
        System.out.println("Espécie: " + pet.especie);
        System.out.printf("Peso: %.1f kg\n", pet.peso);
        System.out.println("Porte: " +pet.porte);
    }
}
