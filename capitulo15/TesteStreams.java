package capitulo15;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TesteStreams {

    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario(1235, "Maria Silva", "Instrutor", 13_000));
        funcionarios.add(new Funcionario(300, "Maria Aparecida", "Pintor", 19_000));
        funcionarios.add(new Funcionario(1258, "jose silva", "Manutenção", 18_000));
        funcionarios.add(new Funcionario(6589, "Vitor", "Programador", 17_000));
        funcionarios.add(new Funcionario(02, "Alex Mota", "Professor", 15_000));
        funcionarios.add(new Funcionario(1258, "joao", "Analista QA", 1_000));
        funcionarios.add(new Funcionario(325, "Alex ", "Recepcao", 30_000));
        funcionarios.add(new Funcionario(5689, "Mota", "Jogador", 1_000));
        funcionarios.add(new Funcionario(1257, "Bruno", "Instrutor", 10_000_10));

        List<Funcionario> salarioMaores = new ArrayList<>();

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getSalario() > 10_000) {
                salarioMaores.add(funcionario);

            }


        }
        funcionarios.forEach(funcionario -> {
            if (funcionario.getSalario() > 10_000) {
                salarioMaores.add(funcionario);

            }
        });

        salarioMaores.forEach(System.out::println);

        //Stream é uma copia do original sem modificar nada
        // Stream ele é uma forma melhor do for que esa encima
        funcionarios
                .stream()
                .filter(item -> item.getSalario() > 10_000)
                .filter(item -> item.getSalario() < 20_000)
                .sorted((o1, o2) -> o1.getSalario().compareTo(o2.getSalario()))
                //.collect(Collectors.toList()); ele vai guardar list que foi modificada
                .collect(Collectors.toList());
    }
}







