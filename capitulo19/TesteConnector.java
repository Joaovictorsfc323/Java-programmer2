package capitulo19;

import java.sql.*;

public class TesteConnector {
    public static void main(String[] args) {

        try {
            String desabilitaSSl = "useSSL=false";
            String defineTimeZone = "serverTimezone=UTC";
            String url = "jdbc:mysql://localhost:3306/impacta?" + desabilitaSSl + "&" + defineTimeZone;
            String login = "root";
            String password = "Imp@ct@";
            Connection connection = DriverManager.getConnection(url, login, password);

            // Statement ela serve para consulta banco
            Statement statement = connection.createStatement();

            String query = ("select * from impacta.aluno where idaluno = 4");
            boolean status = statement.execute(query);


            System.out.println("status consulta" + status);

            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {

                System.out.println("idaluno:" + resultSet.getInt("idaluno"));
                System.out.println("nome:" + resultSet.getString("nome"));
                System.out.println("dataNascimento:" + resultSet.getString("dataNascimento"));
                System.out.println("cpf:" + resultSet.getString("cpf"));
            }

            System.out.println("fim da execução do Select");

            String queryInto = "insert into impacta.aluno (NOME,DATANASCIMENTO, CPF) " +
                    "values ('Josefina2', '10/05/1991','12323434292');";


            boolean statusInsercao = statement.execute(queryInto);
            System.out.println(statusInsercao);

            String querySelect = ("select * from impacta.aluno where idaluno = 9");
            ResultSet resultSetInto = statement.executeQuery(querySelect);

            while (resultSetInto.next()) {

                System.out.println("idaluno:" + resultSetInto.getInt("idaluno"));
                System.out.println("nome:" + resultSetInto.getString("nome"));
                System.out.println("dataNascimento:" + resultSetInto.getString("dataNascimento"));
                System.out.println("cpf:" + resultSetInto.getString("cpf"));
            }

            System.out.println("fim da execução Insert Info");


        } catch (SQLException ex) {
            ex.printStackTrace();

        }

    }


}
