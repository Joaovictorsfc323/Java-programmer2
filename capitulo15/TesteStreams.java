package capitulo15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TesteStreams {

    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario(1235, "Maria Silva", "Instrutor", 9_000));
        funcionarios.add(new Funcionario(300, "Maria Aparecida", "Pintor", 9_000));
        funcionarios.add(new Funcionario(1258, "jose silva", "Manutenção", 18_000));
        funcionarios.add(new Funcionario(6589, "Vitor", "Programador", 17_000));
        funcionarios.add(new Funcionario(02, "Alex Mota", "Professor", 15_000));
        funcionarios.add(new Funcionario(1258, "joao", "Analista QA", 1_000));
        funcionarios.add(new Funcionario(325, "Alex ", "Recepcao", 30_000));
        funcionarios.add(new Funcionario(5689, "Mota", "Jogador", 1_000));
        funcionarios.add(new Funcionario(1257, "Bruno", "Instrutor", 10_000_10));
        funcionarios.add(new Funcionario(1257, "zidane", "Instrutor", 10_000_10));

        List<Funcionario> salarioMaiores = new ArrayList<>();

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getSalario() > 10_000) {
                salarioMaiores.add(funcionario);

            }


        }
        funcionarios.forEach(funcionario -> {
            if (funcionario.getSalario() > 10_000) {
                salarioMaiores.add(funcionario);

            }
        });

        salarioMaiores.forEach(System.out::println);

        //Stream é uma copia do original sem modificar nada
        // Stream ele é uma forma melhor do for que esa encima
//        List<Funcionario> salarioFuncionarios = funcionarios
//                .stream()
//                .filter(item -> item.getSalario() > 10_000)
//                .filter(item -> item.getSalario() < 20_000)
//                .sorted((o1, o2) -> o1.getSalario().compareTo(o2.getSalario()))
//                .sorted(Comparator.comparing(Funcionario::getSalario))
//                .limit(1)
//                .collect(Collectors.toList());
//
//        salarioFuncionarios.forEach(System.out::println);


//        Funcionario funcionarioMaiorSalario = funcionarios
//                .stream()
//                .max((o1, o2) -> o1.getSalario().compareTo(o2.getSalario()))
//                .get();
//
//        System.out.println(funcionarioMaiorSalario);
//
//        Funcionario funcionarioMenorSalario = funcionarios
//                .stream()
//                .min((o1, o2) -> o1.getSalario().compareTo(o2.getSalario()))
//                .get();
//
//        System.out.println(funcionarioMenorSalario);

//

        funcionarios
                .stream()
                .sorted((o1, o2) -> o1.compareTo(o2))
                .distinct()
                .forEach(System.out::println);


      long quantidadeItens = funcionarios
              .stream()
              .count();

        System.out.println(quantidadeItens);

        funcionarios.forEach(item -> System.out.println(item.getCargo()));

        funcionarios
                .stream()
         //       .map(item -> item.getCargo())
                .map(Funcionario::getCargo)
                .forEach(System.out::println);

        funcionarios
                .stream()
                .map(item -> {
                    return "cargo:" + item.getCargo() + ",Salario:" + item.getSalario();
                })
                .forEach(System.out::println);


    }
}







