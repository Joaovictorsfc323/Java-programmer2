package capitulo19.cap19lab1br.com.impacta.java;

import capitulo19.br.com.impacta.java.model.Funcionario;
import capitulo19.teste.Aluno;

import java.util.List;

public class Implemnetacao implements FuncionarioRepository {


    @Override
    public Aluno buscarFuncionarioId(int idFuncionario) {


        return null;
    }

    @Override
    public List<Funcionario> buscarPorNome(String nome) {


        return null;
    }

    @Override
    public Funcionario salvar(Funcionario funcionario) {
        return null;
    }

    @Override
    public boolean excluirId(int idFuncionario) {
        return false;
    }
}
