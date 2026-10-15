package PetShop;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {

        Pet[] pets = new Pet[5];

        int opcao = -1;
        int total = 0;

        Scanner sc = new Scanner (System.in);

        while (opcao != 0) {
            System.out.println("=== PETSHOP ===\n" +  "1 - Cadastrar pet\n" + "2 - Listar pets\n" + "3 - Buscar pet\n" + "0 - Sair\n" + "Escolha:");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 0:
                    System.out.println("Até logo!");
                    break;

                case 1:
                    Pet pet = new Pet();

                    System.out.println("Qual o nome do seu pet?");
                    pet.nome = sc.nextLine();

                    System.out.println("Qual a espécie do seu pet?");
                    pet.especie = sc.nextLine();

                    System.out.println("Qual o peso do seu pet?");
                    pet.peso = sc.nextDouble();

                    sc.nextLine();

                    pet.porte = pet.definirPorte();

                    pets[total] = pet;

                    total ++;

                    System.out.println("Pet cadastrado! Agora são " + total + " pet(s).");
                    break;

                case 2:
                    if (total == 0) {
                        System.out.println("Nenhum pet cadastrado.");
                    } else {
                        System.out.println("--- PETS CADASTRADOS ---");
                        for (int i = 0; i < total; i++) {
                            System.out.print(pets[i].nome + " (" + pets[i].especie + ") - ");
                            System.out.printf("%.1f kg - Porte %s\n", pets[i].peso, pets[i].porte);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Qual pet você procura?");

                    String busca = sc.nextLine();

                    boolean achou = false;


                    for (int i = 0; i < total; i++) {
                        if (pets[i].nome.equalsIgnoreCase(busca)) {
                            System.out.print("Encontrado: " + pets[i].nome + " (" + pets[i].especie + ") - ");
                            System.out.printf("%.1f kg\n", pets[i].peso);
                            achou = true;
                        }
                    }

                    if (!achou) {
                        System.out.println("Pet não encontrado.");
                    }

                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        }

    }
}
