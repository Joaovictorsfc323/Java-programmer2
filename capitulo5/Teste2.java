package capitulo5;

public class Teste2 {

    public static void main(String[] args) {

        int variavel = 10;

        // Tipo nome da variavel = instancia da classe
        Aluno variavel1 = new Aluno();
        variavel1.nome = "Jose";
        variavel1.idade = 10;
        variavel1.matricula = 12548;

//        variavel1.imprimir();


        Aluno aluno1 = new Aluno();
        aluno1.nome = "Maria";
        aluno1.idade = 25;
        aluno1.matricula = 12549;

//        aluno1.imprimir();


        Professor professor = new Professor();

        professor.nome = "Professor Vitor";
        professor.idade = 52;
        professor.matricula = 10;

//        professor.imprimir();

        Curso curso = new Curso();

        curso.materia = "Matematica";

        Turma turma = new Turma();
        turma.numeroTurma = 15;
        turma.curso = curso;
        turma.aluno1 = variavel1;
        turma.aluno2 = aluno1;
        turma.professor = professor;

        turma.imprimir();
    }


}
