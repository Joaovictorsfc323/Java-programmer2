package capitulo15.cap15_lab01;

import java.util.HashMap;
import java.util.Map;

public class Cap15_Lab01 {
    public static void main(String[] args) {

        Map<String, Integer> pessoaMap = new HashMap<>();

        pessoaMap.put("Roberto", 35);
        pessoaMap.put("Carla", 26);
        pessoaMap.put("Gabriel", 18);
        pessoaMap.put("Bruna", 17);

        pessoaMap.forEach((nome, idade) ->{

            System.out.println("nome"+ nome  + "idade + " + idade );
        });
    }
}
