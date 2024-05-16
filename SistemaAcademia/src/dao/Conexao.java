/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author aluno
 */
public class Conexao {
    
    private static final String DRIVER = "MySQL"; 
    private static final String URL = "jdbc:mysql://localhost:3306/academia?zeroDateTimeBehavior=CONVERT_TO_NULL"; 
    private static final String USER = "root"; 
    private static final String PASS = "Senha1234"; 
    
    public static Connection getConnection () throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        return DriverMananger.getConnection(URL, USER, PASS);
    };
    
    public static void closeConnection (Connection c) throws SQLException {
        if ( c != null && !c.isClosed()) {
            c.close();
            c.commit();
        }
        
    }
    
    public static void closeConnection (Connection c, PreparedStatement statement) throws SQLException {
        closeConnection(c);
        if (statement != null) {
            statement.close();
        }
    };
    
   
    
}
