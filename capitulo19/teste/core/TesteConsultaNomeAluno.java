package capitulo19.teste.core;

import capitulo19.teste.Aluno;
import capitulo19.teste.repository.AlunoRepository;
import capitulo19.teste.repository.AlunoRepositoryImplementacao;

public class TesteConsultaNomeAluno {

    public static void main(String[] args) {

        AlunoRepository repository = new AlunoRepositoryImplementacao();

        repository
                .buscarPorNome("Josefina")
                .forEach(System.out::println);

    }
}
