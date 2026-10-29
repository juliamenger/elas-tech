package Aula25.lamda2;
//Interface Acao com void executar().
//Crie um metodo static void repetir(Acao acao) que chama acao.executar() duas vezes.
//No main, chame repetir passando uma lambda que imprime "oi".
//Repare que você não cria variável, a lambda vai direto como argumento.
@FunctionalInterface
public interface Acao {
    void executar();

}
