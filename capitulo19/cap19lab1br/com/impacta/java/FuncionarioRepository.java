package capitulo19.cap19lab1br.com.impacta.java;


import capitulo19.br.com.impacta.java.model.Funcionario;
import capitulo19.teste.Aluno;

import java.util.List;

public interface FuncionarioRepository {


    Aluno buscarFuncionarioId (int idFuncionario);
    List<Funcionario> buscarPorNome(String nome);

    Funcionario salvar(Funcionario funcionario);



    boolean excluirId(int idFuncionario);
}
