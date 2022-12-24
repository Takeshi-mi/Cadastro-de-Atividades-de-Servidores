package dbconnection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DBAtividadeServidores {
    Connection connect;
    
    private final String driver = "org.postgresql.Driver";
    private final String url = "jdbc:postgresql://localhost:5432/AtividadeServidores";
    private final String user = "postgres";
    private final String pass = "@ifg2022";
    
    public static void main(String[] args) {
        DBAtividadeServidores db = new DBAtividadeServidores();
        db.connectDB();
    }
    public Connection connectDB() {
        try {
            Class.forName(driver);
            connect = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexão realizada com sucesso");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            
        } catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
            System.out.println("Class not found");
        }
        return connect;
    }
}
