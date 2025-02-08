/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexaoBancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import PacoteInterfaceVisual.Usuario.Usuario;
import java.sql.ResultSet;

/**
 *
 * @author CaioFSX
 */
public class BancoDeDados {

    public void checarSeUsuarioContemCPF() throws ClassNotFoundException, SQLException {
        Connection conexao1 = null;
        try {
            // use con here
            //USEM ISSO AQUI PARA DML EM BANCO DE DADOS
            ResultSet resultSet;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao1 = DriverManager.getConnection("jdbc:mysql://192.168.15.8:3306/?user=caiofsx", "caiofsx", "database123");
            Statement statement = conexao1.createStatement();
            resultSet = statement.executeQuery("SELECT cpfCliente from ContaBancaria where cpfCliente='" + Usuario.getCpf() + "'");
            if (resultSet.next()) {
                Usuario.setCpf(resultSet.getString(""));
                Usuario.setUsuarioValido(true);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver do Banco de dados não localizado!");
        } catch (SQLException ex) {
            System.out.println("Erro durante a conexão com o banco de dados! Erro:" + ex.getMessage());
        } finally {
            if (conexao1 != null) {
                conexao1.close();
            }
        }
    }
}