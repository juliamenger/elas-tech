package Aula12;

//4. Crie um HashSet com três CPFs e imprima. Depois remova um deles e imprima de novo, junto com o tamanho.

import java.util.HashSet;
import java.util.List;

public class AtividadeHashSet4 {
    public static void main(String[] args) {

        HashSet<String> CPFs = new HashSet<>();
        CPFs.addAll(List.of("999.999.000-99", "000.777.000-77", "444.000.444-00"));
        System.out.println(CPFs);

        CPFs.remove("444.000.444-00");
        System.out.println(CPFs);
        System.out.println(CPFs.size());
    }
}
