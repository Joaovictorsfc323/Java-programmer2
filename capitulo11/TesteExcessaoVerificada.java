package capitulo11;

import jdk.dynalink.beans.StaticClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteExcessaoVerificada {

    // throws ele lança para fora do programa erro
    // Obriga quem pegar codigo deve tratar excepetiom para poder tratar

    public static void main(String[] args) throws SQLException {

        try {
            Connection connection = conectarNoBancoDados();
        } catch (SQLException ex) {
            System.out.println("erro de conexão no banco de dados");
            ex.printStackTrace();
        } finally {
            System.out.println("fim do programa");
        }
    }

    static Connection conectarNoBancoDados() throws SQLException {
        return DriverManager.getConnection("SQLServe:local:3030");

    }

}