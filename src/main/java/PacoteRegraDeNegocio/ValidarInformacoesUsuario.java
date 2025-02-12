/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PacoteRegraDeNegocio;

import ConexaoBancoDeDados.BancoDeDados;
import PacoteInterfaceVisual.PaginaCriarConta;
import PacoteInterfaceVisual.PaginaPedirSenhaLogin;
import PacoteInterfaceVisual.Usuario.Usuario;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Random;
import javax.mail.Session;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author CaioFSX
 */
public class ValidarInformacoesUsuario {

    public ValidarInformacoesUsuario() {
    }

    public void checarUsuarioPeloCPF() throws ClassNotFoundException, SQLException {
        BancoDeDados b1 = new BancoDeDados();
        b1.checarSeUsuarioContemCPF();
        if (Usuario.getUsuarioValido()) {
            PaginaPedirSenhaLogin p1 = new PaginaPedirSenhaLogin();
            p1.setVisible(true);
        } else {
            PaginaCriarConta p1 = new PaginaCriarConta();
            p1.setVisible(true);
        }
    }

    public void CadastrarUsuario() throws ClassNotFoundException, SQLException {
        Random random = new Random();
        Usuario.setNumeroConta(1000 + random.nextInt(9000));
        BancoDeDados b1 = new BancoDeDados();
        b1.CadastrarUsuarioNoBancoDeDados();
        //System.out.println("Usuario cadastrado com os registros:\ncpf:"+Usuario.getCpf()+"\nnome:"+Usuario.getNome()+"\nemail:"+Usuario.getEmail()+"\nsenha:"+Usuario.getSenha());
    }

    public void RealizarLogin() throws ClassNotFoundException, SQLException {
        BancoDeDados b1 = new BancoDeDados();
        b1.RealizarLoginBancoDeDados();
    }

    public void VerificarEmailUsuario() throws ClassNotFoundException, SQLException {
        BancoDeDados b1 = new BancoDeDados();
        b1.VerificarEmailUsuarioPeloBancoDeDados();
        if (Usuario.getUsuarioValido()) {
            SimpleEmail e1 = new SimpleEmail();
            e1.setHostName("smtp.gmail.com");
            e1.setSmtpPort(465);
            e1.setAuthenticator(new DefaultAuthenticator("caioximendes1@gmail.com", "uzip qush rdzs bijo"));
            e1.setSSLOnConnect(true);
            try {
                Random random = new Random();
                e1.setFrom("caioximendes1@gmail.com");
                e1.setSubject("BANCO JAVA: E-mail de Recuperação de Senha");
                Usuario.setCodigoRecuperacao(1000 + random.nextInt(9000));
                e1.setMsg("Olá, você está recebendo este e-mail com o código de recuperação de senha\nSeu Código é: " + Usuario.getCodigoRecuperacao());
                e1.addTo(Usuario.getEmail());
                e1.send();
                System.out.println("Email enviado!");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void AlterarSenhaUsuario() throws ClassNotFoundException, SQLException {
        BancoDeDados b1 = new BancoDeDados();
        b1.AlterarSenhaUsuarioPeloBancoDeDados();
    }

    public void consultarSaldo() throws ClassNotFoundException, SQLException {
        BancoDeDados b1 = new BancoDeDados();
        b1.consultarSaldoPeloBancoDeDados();
    }

    public void transferirViaPix() throws ClassNotFoundException, SQLException{
        BancoDeDados b1 = new BancoDeDados();
        b1.transferirViaPixPeloBancoDeDados();
    }
    public void consultarExtrato()throws ClassNotFoundException, SQLException{
        BancoDeDados b1 = new BancoDeDados();
        b1.consultarExtratoNoBancoDeDados();
    }
    public void criarSenha4Digitos() throws ClassNotFoundException, SQLException{
        BancoDeDados b1 = new BancoDeDados();
        b1.criarSenha4DigitosPeloBancoDeDados();
    }
}
