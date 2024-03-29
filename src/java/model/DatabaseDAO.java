package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseDAO {
    public final String URL="jdbc:mysql://localhost:3306/sistema_salao";
    public final String USER="root";
    public final String SENHA="";
    public Connection conn;
    
    public DatabaseDAO() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
    }
    
    public void conectar() throws Exception{
        conn = DriverManager.getConnection(URL, USER, SENHA);
    }
    
    public void desconectar() throws Exception{
        conn.close();
    }
    
}
