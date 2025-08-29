package capitulo19.teste.repository;

import capitulo19.teste.Aluno;
;

import java.sql.*;
import java.util.List;

public class AlunoRepositoryImplementacao implements AlunoRepository {
    @Override
    public Aluno buscarAlunoId(int idaAluno) {
        Connection mysql = ConexaoMysql.getConexao();

        try {

            Statement statement = mysql.createStatement();

            String query = "SELECT * FROM impacta.aluno WHERE idaluno =" + idaAluno;
            ResultSet resultSet = statement.executeQuery(query);


            Aluno aluno = null;
            while (resultSet.next()) {
                int idaluno = resultSet.getInt("idaluno");
                String nome = resultSet.getString("nome");
                String dataNascimento = resultSet.getString("datanascimento");
                String cpf = resultSet.getString("cpf");
                aluno = new Aluno(idaluno, nome, dataNascimento, cpf);
            }

            return aluno;
        } catch (SQLException e) {

            e.printStackTrace();
        }


        return null;
    }

    @Override
    public List<Aluno> buscarTodos() {
        return null;
    }

    @Override
    public Aluno salvar(Aluno aluno) {
        Connection mysql = ConexaoMysql.getConexao();
        try {

            String query = "INSERT INTO impacta.aluno(nome, datanascimento,cpf) VALUES (?,?,?)";
            PreparedStatement preparedStatement = mysql.prepareStatement(query);

            preparedStatement.setString(1, aluno.getNome());
            preparedStatement.setString(2, aluno.getDataNascimento());
            preparedStatement.setString(3, aluno.getCpf());

            int status = preparedStatement.executeUpdate();
            if (status > 0) {
                System.out.println("aluno salvo no mysql");

            }

        } catch (SQLException e) {
            e.printStackTrace();

        }

        return null;
    }

    @Override
    public Aluno atualizar(Aluno aluno) {
        return null;
    }

    @Override
    public boolean excluirId(int idAluno) {
        Connection mysql = ConexaoMysql.getConexao();
        try {

            String query = "DELETE FROM impacta.aluno WHERE idaluno =(?)";
            PreparedStatement preparedStatement = mysql.prepareStatement(query);
            preparedStatement.setInt(1, idAluno);

            int status = preparedStatement.executeUpdate();
            return status > 0 ? true : false;

        } catch (SQLException e) {
            e.printStackTrace();

        }

        return false;
    }
}
