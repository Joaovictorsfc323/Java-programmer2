package capitulo15;

import java.util.*;

public class TesteSet {

    public static void main(String[] args) {

        // set ele não deixa repeticao de setLIst de String

        Set<String> paises = new TreeSet<>();
   boolean addBolean = paises.addAll(Arrays.asList("Brasil", "Japao", "Argentina",
           "Bolivia", "Paraguai", "Brasil"));

   paises.add("brasil");

   paises.forEach(System.out::println);
    }
}
