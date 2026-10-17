package Aula17;
//c) No main, crie um Retangulo, chame exibirNome() e imprima a área.
//
//d) Agora tente escrever Forma f = new Forma("teste");. O que acontece? Por quê?

public class MainForma {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo("Retangulo", 5.0, 3.5);

        retangulo.exibirNome();
        System.out.println(retangulo.calcularArea());

        //Forma f = new Forma("teste");
        //Pede um metódo. Porque classe abstrata não implementa metódos (como), ela apenas diz o que deve ser feito.
    }
}
