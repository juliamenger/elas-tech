package Aula11;

import java.util.HashMap;

public class AulaHashMap {
    public static void main(String[] args) {


    /*..put("Ana", 28);
    //        .get("Ana");
    //        .getOrDefault("Zoe", 0);
    //        .containsKey("Ana");
    //        .containsValue(28);
    //        .remove("Ana");
    //        .size();
    //        .isEmpty();
    //        .keySet();
    //        .values();
    //        putAll(Map.of()) */

        HashMap<String, String> emails = new HashMap<>();
        emails.put("Ana", "ana@gmail.com");
        System.out.println(emails.get("Ana"));

    }
}
