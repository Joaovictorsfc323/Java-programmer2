package capitulo19.br.com.impacta.java.model;

import capitulo19.cap19lab1br.com.impacta.java.FuncionarioDAO;

import java.util.Scanner;

public class ExecutarCadastro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de funcionario");
        System.out.println("Digite o nome ");
        String nome = scanner.nextLine();

        System.out.println("Digite o salario");
        double salario =scanner.nextDouble();
        System.out.println("Digite o id do cargo do funcionario");
        int cargoId = scanner.nextInt();

        Funcionario funcionario = new Funcionario(nome,salario,cargoId);
        System.out.println(funcionario);

        FuncionarioDAO dao = new FuncionarioDAO();



    }
}
