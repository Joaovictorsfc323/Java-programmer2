package capitulo15;

import java.util.ArrayList;
import java.util.List;

public class MeuArray {

    public static void main(String[] args) {

        List<String> minhaLIsta = new ArrayList();
        minhaLIsta.add("meu primeiro item");
        minhaLIsta.add("meu segundo item");

        minhaLIsta.forEach(item -> System.out.println(item));

        minhaLIsta.forEach(item -> {

            System.out.println(item.toUpperCase());
        });

        minhaLIsta.forEach(item -> {

            System.out.println(item);
        });
    }
}
