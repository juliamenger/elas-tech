package Aula25.lamda1;
//Interface Impressora com void imprimir(String texto).
//Crie duas variáveis diferentes desse tipo usando duas lambdas — uma que imprime o texto em maiúsculo, outra que imprime em minúsculo. Chame as duas.
@FunctionalInterface
public interface Impressora {
    void imprimir(String texto);
}
