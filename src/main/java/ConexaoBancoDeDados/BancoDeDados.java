/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexaoBancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author CaioFSX
 */
public class BancoDeDados {
    public static void main(String[]args) throws ClassNotFoundException, SQLException{
    Class.forName("com.mysql.cj.jdbc.Driver");
    
    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDb", "user1", "pass")) {
    // use con here
    }
    }
}
