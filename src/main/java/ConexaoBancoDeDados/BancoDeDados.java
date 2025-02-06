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

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/bancojava?useTimezone=true&serverTimezone=UTC&useSSL=false";
        String usuario = "root"; 
        String senha = "AbraSQL123"; 
        Connection conexao = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão com o banco de dados realizada com sucesso!");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver do banco de dados não localizado.");
        } catch (SQLException e) {
            System.out.println("Ocorreu um erro ao acessar o banco de dados.");
            e.printStackTrace();
        } finally {
            try {
                if (conexao != null && !conexao.isClosed()) {
                    conexao.close();
                    System.out.println("Conexão fechada com sucesso.");
                }
            } catch (SQLException e) {
                System.out.println("Erro ao fechar a conexão.");
                e.printStackTrace();
            }
        }
    }
	
    public void checarSeUsuarioContemCPF() throws ClassNotFoundException, SQLException {
        Usuario usu1 = new Usuario();
        Connection conexao1 = null;
        try {
            // use con here
            //USEM ISSO AQUI PARA DML EM BANCO DE DADOS
            ResultSet resultSet;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao1 = DriverManager.getConnection("jdbc:mysql://192.168.15.8:3306/?user=caiofsx", "caiofsx", "database123");
            Statement statement = conexao1.createStatement();
            resultSet = statement.executeQuery("SELECT cpfCliente from ContaBancaria where cpfCliente='" + usu1.getCpf() + "'");
            if (resultSet.next()) {
                usu1.setCpf(resultSet.getString(""));
                usu1.setUsuarioValido(true);
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