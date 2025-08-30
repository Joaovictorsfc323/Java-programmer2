package capitulo19.teste.repository;

import capitulo19.teste.Aluno;

import java.util.List;

public interface AlunoRepository {

    Aluno buscarAlunoId (int idaAluno);
    List<Aluno> buscarTodos();
    List<Aluno> buscarPorNome(String nome);
    Aluno buscarCpf(String cpf);

    Aluno salvar (Aluno aluno);
    Aluno atualizar(Aluno aluno);


    boolean excluirId (int isAluno);
}
