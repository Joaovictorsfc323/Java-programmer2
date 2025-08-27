package capitulo15;

import java.util.HashMap;
import java.util.Map;

public class TesteMap {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();


        // map ele realiza um update do nome novo inserido
        // sempre tem que ter dois valor se for somente um valor tem que adicionar null map.put("494796258-57", null);

        map.put("494796258-57", "Jao da silva");
        map.put("117453180-03", "Mary da Silva");
        map.put("494796258-57", "Ricardao da silva");

        map.forEach((chave, valor) -> {
            System.out.println(chave + " : " + valor);

        });
        // <> sempre tem que ser dois valor ex String
        Map<Integer, Funcionario> funcionarioMap = new HashMap<>();
        Funcionario funcionario =
                new Funcionario(123, "joao", "instrutor", 1000D);

        Funcionario  funcionario2 =
                new Funcionario(125, "Roberto", "instrutor", 1000D);

        funcionarioMap.put(funcionario.getMatricula(), funcionario);
        funcionarioMap.put(funcionario2.getMatricula(), funcionario2);

        // porque funcionarioMap.forEach(System); porque ele precisa dois valor

        funcionarioMap.forEach((chave, funcionario1) ->
                System.out.println("chave:" + chave + "-" + funcionario1.getNome())

        );

        System.out.println(funcionarioMap.get(123));
        System.out.println(funcionarioMap.size());
        System.out.println(funcionarioMap.remove(123));
        funcionarioMap.clear();

    }
}
