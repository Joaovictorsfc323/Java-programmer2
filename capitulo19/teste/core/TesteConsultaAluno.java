package capitulo19.teste.core;

import capitulo19.teste.Aluno;
import capitulo19.teste.repository.AlunoRepository;
import capitulo19.teste.repository.AlunoRepositoryImplementacao;

public class TesteConsultaAluno {

    public static void main(String[] args) {

        AlunoRepository repository = new AlunoRepositoryImplementacao();

        Aluno aluno = repository.buscarAlunoId(6);

        if(aluno != null){
            System.out.println(aluno.toString());

        }

    }
}
