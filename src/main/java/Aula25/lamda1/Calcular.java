package Aula25.lamda1;
////Interface Calculo com int calcular(int a, int b).
//Crie três lambdas: soma, multiplicação e a que retorna o maior dos dois. Chame as três e imprima os resultados.
@FunctionalInterface
public interface Calcular {
    int calcular(int a, int b);
}
