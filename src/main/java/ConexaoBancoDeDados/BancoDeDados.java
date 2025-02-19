/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexaoBancoDeDados;

import PacoteInterfaceVisual.Usuario.Boleto;
import PacoteInterfaceVisual.Usuario.Extrato;
import PacoteInterfaceVisual.Usuario.ListaDeBancos;
import PacoteInterfaceVisual.Usuario.OperacoesBancarias;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import PacoteInterfaceVisual.Usuario.Usuario;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

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
                System.out.println("OK, " + Usuario.getUsuarioValido());
            } else {
                System.out.println("NOT OK, " + Usuario.getUsuarioValido());
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

    public void CadastrarUsuarioNoBancoDeDados() throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root", "root", "1234");
            Statement statement = conexao1.createStatement();
            statement.execute("use bancojava");
            String sql = "insert into Usuarios(cpf,nome,email,saldo,senha,senha4digitos,numeroConta) values " + "('" + Usuario.getCpf() + "'," + "'" + Usuario.getNome() + "'," + "'" + Usuario.getEmail() + "'," + "" + Usuario.getSaldo() + "," + "'" + Usuario.getSenha() + "'," + "" + Usuario.getSenha4Digitos() + "," + "" + Usuario.getNumeroConta() + ");";
            statement.execute(sql);
            System.out.println(sql);
            Usuario.setUsuarioRealizouCadastro(true);
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

    public void RealizarLoginBancoDeDados() throws ClassNotFoundException, SQLException {
        try {
            ResultSet resultSet;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root", "root", "1234");
            Statement statement = conexao1.createStatement();
            statement.execute("use bancojava");
            String sql = "select senha from Usuarios where senha= " + "'" + Usuario.getSenha() + "'" + " and cpf=" + "'" + Usuario.getCpf() + "';";
            resultSet = statement.executeQuery(sql);
            System.out.println(sql);
            if (resultSet.next()) {
                Usuario.setUsuarioValido(true);
                System.out.println("Usuario com CPF: " + Usuario.getCpf() + " e senha: " + resultSet.getString("senha") + " logado com sucesso!");
            } else {
                Usuario.setUsuarioValido(false);
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

    public void VerificarEmailUsuarioPeloBancoDeDados() throws ClassNotFoundException, SQLException {
        try {
            ResultSet resultSet;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root", "root", "1234");
            Statement statement = conexao1.createStatement();
            statement.execute("use bancojava");
            String sql = "select email from Usuarios where email= " + "'" + Usuario.getEmail() + "'" + " and cpf=" + "'" + Usuario.getCpf() + "';";
            resultSet = statement.executeQuery(sql);
            System.out.println(sql);
            if (resultSet.next()) {
                Usuario.setUsuarioValido(true);
                System.out.println("Usuario com CPF: " + Usuario.getCpf() + " e email: " + resultSet.getString("email") + " foi encontrado email!");
            } else {
                Usuario.setUsuarioValido(false);
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

    public void AlterarSenhaUsuarioPeloBancoDeDados() throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root", "root", "1234");
            Statement statement = conexao1.createStatement();
            statement.execute("use bancojava");
            String sql = "update Usuarios set senha= " + "'" + Usuario.getSenha() + "'" + "where cpf=" + "'" + Usuario.getCpf() + "';";
            statement.execute(sql);
            System.out.println(sql);
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

    public void consultarSaldoPeloBancoDeDados() throws ClassNotFoundException, SQLException {
        try {
            ResultSet resultSet;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root", "root", "1234");
            Statement statement = conexao1.createStatement();
            statement.execute("use bancojava");
            String sql = "select saldo from Usuarios where cpf= " + "'" + Usuario.getCpf() + "';";
            resultSet = statement.executeQuery(sql);
            System.out.println(sql);
            if (resultSet.next()) {
                Usuario.setSaldo(resultSet.getDouble("saldo"));
                System.out.println("Usuario com CPF: " + Usuario.getCpf() + " e saldo: R$" + resultSet.getDouble("saldo"));
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

    public void transferirViaPixPeloBancoDeDados() throws ClassNotFoundException, SQLException {
        try {
            ResultSet resultSet;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root", "root", "1234");
            Statement statement = conexao1.createStatement();
            statement.execute("use bancojava");
            String sql = "select saldo from Usuarios where cpf= " + "'" + OperacoesBancarias.getChavePixCpf() + "';";
            resultSet = statement.executeQuery(sql);
            System.out.println(sql);
            //Reduzir saldo da conta LOGADA
            if (resultSet.next()) {
                LocalDateTime dataHorarioAgoraSemFormatacao = LocalDateTime.now();
                DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.of("America/Sao_Paulo"));
                String dataHorarioFormatado = formatacao.format(dataHorarioAgoraSemFormatacao);
                statement.execute("update usuarios set saldo =" + (resultSet.getDouble("saldo") + OperacoesBancarias.getQuantiaTransferencia()) + "where cpf= " + "'" + OperacoesBancarias.getChavePixCpf() + "';");
                //resultSet = statement.executeQuery("select saldo from Usuarios where cpf= "+"'"+Usuario.getCpf()+"';");
                //Usuario.setSaldo(resultSet.getDouble("saldo"));
                statement.execute("update usuarios set saldo =" + (Usuario.getSaldo() - OperacoesBancarias.getQuantiaTransferencia()) + "where cpf= " + "'" + Usuario.getCpf() + "';");
                //EXTRATO PARA QUEM TRANSFERIU O DINHEIRO
                statement.execute("insert into extrato (cpf,data_horario,descricao,valor,tipo) values " + "('" + Usuario.getCpf() + "'," + "'" + dataHorarioFormatado + "'," + "'Transferência via Pix'" + "," + OperacoesBancarias.getQuantiaTransferencia() + "," + "'débito');");
                //EXTRATO PARA QUEM RECEBEU O DINHEIRO
                statement.execute("insert into extrato (cpf,data_horario,descricao,valor,tipo) values " + "('" + OperacoesBancarias.getChavePixCpf() + "'," + "'" + dataHorarioFormatado + "'," + "'Transferência via Pix'" + "," + OperacoesBancarias.getQuantiaTransferencia() + "," + "'crédito');");
                Usuario.setSaldo(Usuario.getSaldo() - OperacoesBancarias.getQuantiaTransferencia());
                System.out.println("Transferencia realizada pelo pix, quantia de: R$" + OperacoesBancarias.getQuantiaTransferencia() + " para a conta de chave pix: " + OperacoesBancarias.getChavePixCpf());
                OperacoesBancarias.setChavePixValida(true);
            } else {
                OperacoesBancarias.setChavePixValida(false);
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

    public void consultarExtratoNoBancoDeDados() throws ClassNotFoundException, SQLException {
        try {
            ResultSet resultSet;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root", "root", "1234");
            Statement statement = conexao1.createStatement();
            statement.execute("use bancojava");
            String sql = "select data_horario,descricao,valor,tipo from extrato where cpf= " + "'" + Usuario.getCpf() + "';";
            resultSet = statement.executeQuery(sql);
            System.out.println(sql);
            while (resultSet.next()) {
                Extrato.addDataExtratoLista(resultSet.getString("data_horario"));
                Extrato.addDescricaoExtratoLista(resultSet.getString("descricao"));
                Extrato.addValorExtratoLista(resultSet.getDouble("valor"));
                Extrato.addTipoCreditoDebitoExtratoLista(resultSet.getString("tipo"));
                //Usuario.setSaldo(resultSet.getDouble("saldo"));
                //System.out.println("Usuario com CPF: "+Usuario.getCpf()+" e saldo: R$"+resultSet.getDouble("saldo"));
            }
            for (String resultado : Extrato.getDataExtratoLista()) {
                System.out.print(resultado + ",");
            }
            for (String resultado2 : Extrato.getDescricaoExtratoLista()) {
                System.out.print(resultado2 + ",");
            }
            for (Double resultado3 : Extrato.getValorExtratoLista()) {
                System.out.print(resultado3 + ",");
            }
            for (String resultado4 : Extrato.getTipoCreditoDebitoExtratoLista()) {
                System.out.print(resultado4 + ",");
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

    public void criarSenha4DigitosPeloBancoDeDados() throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root", "root", "1234");
            Statement statement = conexao1.createStatement();
            statement.execute("use bancojava");
            String sql = "update Usuarios set senha4digitos= " + Usuario.getSenha4Digitos() + " where cpf=" + "'" + Usuario.getCpf() + "';";
            statement.execute(sql);
            System.out.println(sql);
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

    public void buscarSenha4DigitosPeloBancoDeDados() throws ClassNotFoundException, SQLException {
        try {
            ResultSet resultSet;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root", "root", "1234");
            Statement statement = conexao1.createStatement();
            statement.execute("use bancojava");
            String sql = "select senha4digitos from Usuarios where cpf=" + "'" + Usuario.getCpf() + "';";
            resultSet = statement.executeQuery(sql);
            System.out.println(sql);
            if (resultSet.next()) {
                Usuario.setSenha4Digitos(resultSet.getInt("senha4digitos"));
                System.out.println("Usuario com CPF: " + Usuario.getCpf() + " e senha4digitos: " + resultSet.getInt("senha4digitos"));
            } else {
                Usuario.setUsuarioValido(false);
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

    public void realizarPagamentoBoletoPeloBancoDeDados() throws ClassNotFoundException, SQLException {
        //consultarSaldoPeloBancoDeDados();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root", "root", "1234");
            Statement statement = conexao1.createStatement();
            statement.execute("use bancojava");
            String sql = "update Usuarios set saldo= " + (Usuario.getSaldo() - (Boleto.getValorBoleto() / 100.0)) + " where cpf=" + "'" + Usuario.getCpf() + "';";
            //ALTERACAO PARA CHEATCODE DE DEPOSITO VIA BOLETO ===== <ABAIXO> ========
            if(Boleto.getCodigoBanco().equals("999")){
                sql = "update Usuarios set saldo= " + (Usuario.getSaldo() + (Boleto.getValorBoleto() / 100.0)) + " where cpf=" + "'" + Usuario.getCpf() + "';";
            }
            //ALTERACAO PARA CHEATCODE DE DEPOSITO VIA BOLETO ===== <ACIMA> ========
            statement.execute(sql);
            System.out.println(sql);
            DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            LocalDateTime dataAgora = LocalDateTime.now();
            //ALTERACAO PARA CHEATCODE DE DEPOSITO VIA BOLETO ===== <ABAIXO> ========
            if(Boleto.getCodigoBanco().equals("999")){
                statement.execute("insert into extrato (cpf,data_horario,descricao,valor,tipo) values " + "('" + Usuario.getCpf() + "'," + "'" + dataAgora.format(formatacao) + "'," + "'Depósito via Boleto'" + "," + Boleto.getValorBoleto() / 100.0 + "," + "'crédito');");
            } else {
                statement.execute("insert into extrato (cpf,data_horario,descricao,valor,tipo) values " + "('" + Usuario.getCpf() + "'," + "'" + dataAgora.format(formatacao) + "'," + "'Pagamento de Boleto'" + "," + Boleto.getValorBoleto() / 100.0 + "," + "'débito');");
            }
            //ALTERACAO PARA CHEATCODE DE DEPOSITO VIA BOLETO ===== <ACIMA> ========
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

    public void consultarListaDeBancosPeloBancoDeDados() throws ClassNotFoundException, SQLException {
        try {
            ResultSet resultSet;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root", "root", "1234");
            Statement statement = conexao1.createStatement();
            statement.execute("use bancojava");
            String sql = "select nomeBanco,codigoBanco from lista_bancos where codigoBanco=" + "'" + Boleto.getCodigoBanco() + "';";
            resultSet = statement.executeQuery(sql);
            System.out.println(sql);
            if (resultSet.next()) {
                ListaDeBancos.setNomeBanco(resultSet.getString("nomeBanco"));
                ListaDeBancos.setCodigoBancoLista(resultSet.getString("codigoBanco"));
                ListaDeBancos.setCodigoValido(true);
            } else {
                ListaDeBancos.setCodigoValido(false);
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

    public void alterarEmailUsuarioPeloBancoDeDados() throws ClassNotFoundException, SQLException {
        try {
            ResultSet resultSet;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root", "root", "1234");
            Statement statement = conexao1.createStatement();
            statement.execute("use bancojava");
            String sql = "select email from Usuarios where email= " + "'" + Usuario.getEmail() + "';";
            resultSet = statement.executeQuery(sql);
            System.out.println(sql);
            if (resultSet.next()) {
//                Usuario.setUsuarioValido(true);
//                System.out.println("Usuario com CPF: "+Usuario.getCpf()+" e senha: "+resultSet.getString("senha")+" logado com sucesso!");
                Usuario.setEmailNaoExistenteBanco(false);
            } else {
                statement.execute("update Usuarios set email= " + Usuario.getEmail() + " where cpf=" + "'" + Usuario.getCpf() + "';");
                Usuario.setEmailNaoExistenteBanco(true);
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

    public void filtrarExtratoPeloBancoDeDados() throws ClassNotFoundException, SQLException {
        try {
            ResultSet resultSet;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root", "root", "1234");
            Statement statement = conexao1.createStatement();
            statement.execute("use bancojava");
            String sql = "select data_horario,descricao,valor,tipo from extrato where STR_TO_DATE(data_horario, '%d/%m/%Y') BETWEEN STR_TO_DATE" + "('" + Extrato.getFiltroIntervaloInicio() + "'," + "'%d/%m/%Y') AND STR_TO_DATE" + "('" + Extrato.getFiltroIntervaloTermino() + "', '%d/%m/%Y') and cpf=" + "'" + Usuario.getCpf() + "';";
            resultSet = statement.executeQuery(sql);
            System.out.println(sql);
            Extrato.setFiltroIntervaloValido(false);
            while (resultSet.next()) {
                Extrato.setFiltroIntervaloValido(true);
                Extrato.addDataExtratoLista(resultSet.getString("data_horario"));
                Extrato.addDescricaoExtratoLista(resultSet.getString("descricao"));
                Extrato.addValorExtratoLista(resultSet.getDouble("valor"));
                Extrato.addTipoCreditoDebitoExtratoLista(resultSet.getString("tipo"));
                //Usuario.setSaldo(resultSet.getDouble("saldo"));
                //System.out.println("Usuario com CPF: "+Usuario.getCpf()+" e saldo: R$"+resultSet.getDouble("saldo"));
            }
            for (String resultado : Extrato.getDataExtratoLista()) {
                System.out.print(resultado + ",");
            }
            for (String resultado2 : Extrato.getDescricaoExtratoLista()) {
                System.out.print(resultado2 + ",");
            }
            for (Double resultado3 : Extrato.getValorExtratoLista()) {
                System.out.print(resultado3 + ",");
            }
            for (String resultado4 : Extrato.getTipoCreditoDebitoExtratoLista()) {
                System.out.print(resultado4 + ",");
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
    public void consultarNomeUsuarioPeloBancoDeDados() throws ClassNotFoundException, SQLException{
        try {
            ResultSet resultSet;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root", "root", "1234");
            Statement statement = conexao1.createStatement();
            statement.execute("use bancojava");
            String sql = "select nome from Usuarios where cpf= " + "'" + Usuario.getCpf() + "';";
            resultSet = statement.executeQuery(sql);
            System.out.println(sql);
            if (resultSet.next()) {
                Usuario.setNome(resultSet.getString("nome"));
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
    public void consultarEmailUsuarioPeloBancoDeDados()throws ClassNotFoundException, SQLException{
        try {
            ResultSet resultSet;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root", "root", "1234");
            Statement statement = conexao1.createStatement();
            statement.execute("use bancojava");
            String sql = "select email from Usuarios where cpf=" + "'" + Usuario.getCpf() + "';";
            resultSet = statement.executeQuery(sql);
            System.out.println(sql);
            if (resultSet.next()) {
                Usuario.setUsuarioValido(true);
                Usuario.setEmail(resultSet.getString("email"));
                System.out.println("Usuario com CPF: " + Usuario.getCpf() + " e email: " + resultSet.getString("email") + " foi encontrado email!");
            } else {
                Usuario.setUsuarioValido(false);
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
    
    public void recarregarCelularPeloBancoDeDados() throws ClassNotFoundException, SQLException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root", "root", "1234");
            Statement statement = conexao1.createStatement();
            statement.execute("use bancojava");
            String sql = "update Usuarios set saldo= " + (Usuario.getSaldo()-Usuario.getValorRecarga()) + " where cpf=" + "'" + Usuario.getCpf() + "';";
            statement.execute(sql);
            System.out.println(sql);
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
