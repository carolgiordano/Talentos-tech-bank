package dia19_sql;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExemploSQLite {

    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:C:/Users/carol/Desktop/" +
                    "Hime - Meus Arquivos/PROG/Tech Bank/SQLite/banco-aula-1/exercicio-sql.db");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                // connection close failed.
                System.err.println(e.getMessage());
            }
        }
    }
}
