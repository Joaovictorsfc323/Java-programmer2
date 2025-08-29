package capitulo19.teste.core;

import capitulo19.teste.Aluno;
import capitulo19.teste.repository.AlunoRepository;
import capitulo19.teste.repository.AlunoRepositoryImplementacao;

public class TesteSalvaAluno {

    public static void main(String[] args) {
        AlunoRepository repository = new AlunoRepositoryImplementacao();

        Aluno aluno = new Aluno("Franscisco", "31/03/2001", "36925814752");


        Aluno alunoRepository = repository.salvar(aluno);
    }
}
