package capitulo5;

public class Turma {


    int numeroTurma;
    Curso curso;
    Aluno aluno1;
    Aluno aluno2;
    Professor professor;


    public void imprimir() {

        System.out.println("curso: " + numeroTurma);

        curso.imprimir();
        aluno1.imprimir();
        aluno2.imprimir();
        professor.imprimir();

    }
}
