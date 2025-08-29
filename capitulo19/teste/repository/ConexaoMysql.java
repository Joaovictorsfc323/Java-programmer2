package capitulo19.teste.repository;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class ConexaoMysql {


   static Connection getConexao() {

        try {
            String desabilitaSSl = "useSSL=false";
            String defineTimeZone = "serverTimezone=UTC";
            String url = "jdbc:mysql://localhost:3306/impacta?" + desabilitaSSl + "&" + defineTimeZone;
            String login = "root";
            String password = "Imp@ct@";
            Connection connection = DriverManager.getConnection(url, login, password);

            return connection;

        }
        catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("falha na conexão com o mysql");

        }

    }

}
