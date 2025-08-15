package capitulo5;

public class Teste3 {

    public static void main(String[] args) {

        Colaborador teste = new Colaborador();

        Colaborador teste2 = teste;

        teste.nome = "Fabio";
        teste.idade = 10;
        teste.matricula = 1254;

        teste2.nome = "Maria";

        Turma turma = new Turma();

        teste.imprimir();
        teste2.imprimir();

    }

}
