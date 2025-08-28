package capitulo19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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

            String query =("select * from impacta.aluno where idaluno = 2");
            boolean status = statement.execute(query);


            System.out.println("status consulta" + status);

        } catch (SQLException ex) {
            ex.printStackTrace();

        }

    }


}
