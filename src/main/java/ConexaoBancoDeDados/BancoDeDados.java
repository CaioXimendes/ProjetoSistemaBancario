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
    Connection conexao1 = null;
    public void checarSeUsuarioContemCPF() throws ClassNotFoundException, SQLException {
        try {
            // use con here
            //USEM ISSO AQUI PARA DML EM BANCO DE DADOS
            ResultSet resultSet;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root", "root", "1234");
            Statement statement = conexao1.createStatement();
            statement.execute("use bancojava");
            resultSet = statement.executeQuery("SELECT cpf from Usuarios where cpf='" + Usuario.getCpf() + "'");
            if (resultSet.next()) {
                Usuario.setCpf(resultSet.getString("cpf"));
                Usuario.setUsuarioValido(true);
                System.out.println("OK, "+ Usuario.getUsuarioValido());
            } else{
                System.out.println("NOT OK, "+Usuario.getUsuarioValido());
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
    public void CadastrarUsuarioNoBancoDeDados() throws ClassNotFoundException, SQLException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root", "root", "1234");
            Statement statement = conexao1.createStatement();
            statement.execute("use bancojava");
            String sql = "insert into Usuarios(cpf,nome,email,saldo,senha,senha4digitos,numeroConta) values "+"('"+Usuario.getCpf()+"',"+"'"+Usuario.getNome()+"',"+"'"+Usuario.getEmail()+"',"+""+Usuario.getSaldo()+","+"'"+Usuario.getSenha()+"',"+""+Usuario.getSenha4Digitos()+","+""+Usuario.getNumeroConta()+");";
            statement.execute(sql);
            System.out.println(sql);
            Usuario.setUsuarioRealizouCadastro(true);
        } catch(ClassNotFoundException ex){
            System.out.println("Driver do Banco de dados não localizado!");
        } catch(SQLException ex){
            System.out.println("Erro durante a conexão com o banco de dados! Erro:" + ex.getMessage());
        }
        finally{
            if(conexao1 != null){
                conexao1.close();
            }
        }
    }
    public void RealizarLoginBancoDeDados() throws ClassNotFoundException, SQLException{
        try{
            ResultSet resultSet;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root", "root", "1234");
            Statement statement = conexao1.createStatement();
            statement.execute("use bancojava");
            String sql = "select senha from Usuarios where senha= "+"'"+Usuario.getSenha()+"'"+" and cpf="+"'"+Usuario.getCpf()+"';";
            resultSet = statement.executeQuery(sql);
            System.out.println(sql);
            if(resultSet.next()){
                Usuario.setUsuarioValido(true);
                System.out.println("Usuario com CPF: "+Usuario.getCpf()+" e senha: "+resultSet.getString("senha")+" logado com sucesso!");
            }
            else{
                Usuario.setUsuarioValido(false);
            }
            
        } catch(ClassNotFoundException ex){
            System.out.println("Driver do Banco de dados não localizado!");
        } catch(SQLException ex){
            System.out.println("Erro durante a conexão com o banco de dados! Erro:" + ex.getMessage());
        }
        finally{
            if(conexao1 != null){
                conexao1.close();
            }
        }
    }
    public void VerificarEmailUsuarioPeloBancoDeDados() throws ClassNotFoundException, SQLException{
        try{
            ResultSet resultSet;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root", "root", "1234");
            Statement statement = conexao1.createStatement();
            statement.execute("use bancojava");
            String sql = "select email from Usuarios where email= "+"'"+Usuario.getEmail()+"'"+" and cpf="+"'"+Usuario.getCpf()+"';";
            resultSet = statement.executeQuery(sql);
            System.out.println(sql);
            if(resultSet.next()){
                Usuario.setUsuarioValido(true);
                System.out.println("Usuario com CPF: "+Usuario.getCpf()+" e email: "+resultSet.getString("email")+" foi encontrado email!");
            }
            else{
                Usuario.setUsuarioValido(false);
            }
            
        } catch(ClassNotFoundException ex){
            System.out.println("Driver do Banco de dados não localizado!");
        } catch(SQLException ex){
            System.out.println("Erro durante a conexão com o banco de dados! Erro:" + ex.getMessage());
        }
        finally{
            if(conexao1 != null){
                conexao1.close();
            }
        }
    }
    public void AlterarSenhaUsuarioPeloBancoDeDados() throws ClassNotFoundException, SQLException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root", "root", "1234");
            Statement statement = conexao1.createStatement();
            statement.execute("use bancojava");
            String sql = "update Usuarios set senha= "+"'"+Usuario.getSenha()+"'"+"where cpf="+"'"+Usuario.getCpf()+"';";
            statement.execute(sql);
            System.out.println(sql);
        } catch(ClassNotFoundException ex){
            System.out.println("Driver do Banco de dados não localizado!");
        } catch(SQLException ex){
            System.out.println("Erro durante a conexão com o banco de dados! Erro:" + ex.getMessage());
        }
        finally{
            if(conexao1 != null){
                conexao1.close();
            }
        }
    }
}