package capitulo19.teste.repository;

import capitulo19.teste.Aluno;
import capitulo19.teste.errors.AlunoError;
import capitulo19.teste.errors.AlunoNotNotFound;
;

import java.sql.*;
import java.util.ArrayList;
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

            throw new AlunoNotNotFound("Erro ao consultar um aluno", e);

        } finally {
            closeConetion(mysql);
        }


    }

    @Override
    public List<Aluno> buscarTodos() {

        Connection mysql = ConexaoMysql.getConexao();
        try {

            Statement statement = mysql.createStatement();

            String query = "SELECT * FROM impacta.aluno";
            ResultSet resultSet = statement.executeQuery(query);


            List<Aluno> alunos = new ArrayList<>();
            while (resultSet.next()) {
                int idaluno = resultSet.getInt("idaluno");
                String nome = resultSet.getString("nome");
                String dataNascimento = resultSet.getString("datanascimento");
                String cpf = resultSet.getString("cpf");
                alunos.add(new Aluno(idaluno, nome, dataNascimento, cpf));
            }

            return alunos;

        } catch (SQLException e) {
            throw new AlunoError("Erro ao buscar uma lista de alunos", e);

        } finally {
            closeConetion(mysql);
        }
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
            return null;

        } catch (SQLException e) {

            throw new AlunoError("Erro ao salvar aluno", e);

        } finally {
            closeConetion(mysql);
        }


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

            throw new AlunoError("Erro ao excluir um aluno", e);

        } finally {
            closeConetion(mysql);
        }


    }

    private void closeConetion(Connection connection) {
        Connection mysql = ConexaoMysql.getConexao();
        try {
            if (connection != null) {
                connection.close();

            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    @Override
    public List<Aluno> buscarPorNome(String nome) {
        Connection mysql = ConexaoMysql.getConexao();
        try {
            String query = "SELECT * FROM impacta.aluno WHERE  nome LIKE \"%"+ nome +"%\"";

              PreparedStatement statement  = mysql.prepareStatement(query);

//              statement.setString(1,"%" + nome + "&");

            ResultSet resultSet = statement.executeQuery(query);


            List<Aluno> alunos = new ArrayList<>();
            while (resultSet.next()) {
                int idaluno = resultSet.getInt("idaluno");
                String nome_ = resultSet.getString("nome");
                String dataNascimento = resultSet.getString("datanascimento");
                String cpf = resultSet.getString("cpf");
                alunos.add(new Aluno(idaluno, nome_, dataNascimento, cpf));
            }

            return alunos;

        } catch (SQLException e) {
            throw new AlunoError("Erro ao buscar uma lista de alunos", e);

        } finally {
            closeConetion(mysql);
        }
    }

    @Override
    public Aluno buscarCpf(String cpf) {
        Connection mysql = ConexaoMysql.getConexao();

        try {

            Statement statement = mysql.createStatement();

            String query = "SELECT * FROM impacta.aluno WHERE cpf=" + cpf;
            ResultSet resultSet = statement.executeQuery(query);


            Aluno aluno = null;
            while (resultSet.next()) {
                int idaluno = resultSet.getInt("idaluno");
                String nome = resultSet.getString("nome");
                String dataNascimento = resultSet.getString("datanascimento");
                String cpfEntity = resultSet.getString("cpf");
                aluno = new Aluno(idaluno, nome, dataNascimento, cpfEntity);
            }

            return aluno;
        } catch (SQLException e) {

            throw new AlunoNotNotFound("Erro ao consultar um aluno", e);

        } finally {
            closeConetion(mysql);
        }
    }


}
