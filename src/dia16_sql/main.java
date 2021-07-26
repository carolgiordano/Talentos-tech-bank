package dia19_sql;

import java.sql.*;

public class main {

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:C:/Users/carol/Desktop/" +
                "Hime - Meus Arquivos/PROG/Tech Bank/SQLite/banco-aula-1/exercicio-sql.db")) {
            try (Statement stmt = conn.createStatement()) {
                String query = "select * from academia";
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id"));
                    System.out.println("NOME: " + rs.getString("nome"));
                }
                rs.close();
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

    }
}
