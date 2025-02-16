/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PacoteRegraDeNegocio;

import ConexaoBancoDeDados.BancoDeDados;
import PacoteInterfaceVisual.PaginaCriarConta;
import PacoteInterfaceVisual.PaginaPedirSenhaLogin;
import PacoteInterfaceVisual.Usuario.Boleto;
import PacoteInterfaceVisual.Usuario.Usuario;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;
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

    public void transferirViaPix() throws ClassNotFoundException, SQLException {
        BancoDeDados b1 = new BancoDeDados();
        b1.transferirViaPixPeloBancoDeDados();
    }

    public void consultarExtrato() throws ClassNotFoundException, SQLException {
        BancoDeDados b1 = new BancoDeDados();
        b1.consultarExtratoNoBancoDeDados();
    }

    public void criarSenha4Digitos() throws ClassNotFoundException, SQLException {
        BancoDeDados b1 = new BancoDeDados();
        b1.criarSenha4DigitosPeloBancoDeDados();
    }

    public void buscarSenha4Digitos() throws ClassNotFoundException, SQLException {
        BancoDeDados b1 = new BancoDeDados();
        b1.buscarSenha4DigitosPeloBancoDeDados();
    }

    public void verificarBoleto() {
        String codigoBanco = "";

        codigoBanco = codigoBanco + (Boleto.getCodigoBoleto().charAt(0)) + (Boleto.getCodigoBoleto().charAt(1)) + (Boleto.getCodigoBoleto().charAt(2));
        Boleto.setCodigoBanco(codigoBanco);

        String fatorVencimento = "";
        fatorVencimento = fatorVencimento + (Boleto.getCodigoBoleto().charAt(33)) + (Boleto.getCodigoBoleto().charAt(34)) + (Boleto.getCodigoBoleto().charAt(35)) + (Boleto.getCodigoBoleto().charAt(36));
        Boleto.setFatorVencimento(Integer.parseInt(fatorVencimento));
        int x;
        char carac;
        for (x = 37; x <= 46; x++) {
            carac = Boleto.getCodigoBoleto().charAt(x);
            if (carac != '0') {
                break;
            }
        }
        String valorBoleto;
        valorBoleto = Boleto.getCodigoBoleto().substring(x, 47);
        Boleto.setValorBoleto(Long.parseLong(valorBoleto));
        //CALCULANDO AGORA A DATA DE VALIDADE DO BOLETO
        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataInicio = LocalDate.of(1997, 10, 7);
        LocalDate dataHoje = LocalDate.now();
        LocalDate novaData = dataInicio.plusDays(Boleto.getFatorVencimento());
//        novaData.format(formatacao);
//        dataHoje.format(formatacao);
        if (novaData.isBefore(dataHoje)) {
            Boleto.setDataValidadeBoletoValida(false);
            Boleto.setDataValidadeBoleto(novaData.format(formatacao));
        } else if (novaData.isAfter(dataHoje)) {
            Boleto.setDataValidadeBoletoValida(true);
            Boleto.setDataValidadeBoleto(novaData.format(formatacao));
        } else {
            Boleto.setDataValidadeBoletoValida(true);
            Boleto.setDataValidadeBoleto(novaData.format(formatacao));
        }
    }

    public void realizarPagamentoBoleto() throws ClassNotFoundException, SQLException {
        BancoDeDados b1 = new BancoDeDados();
        b1.realizarPagamentoBoletoPeloBancoDeDados();
    }

    public void consultarListaDeBancos() throws ClassNotFoundException, SQLException {
        BancoDeDados b1 = new BancoDeDados();
        b1.consultarListaDeBancosPeloBancoDeDados();
    }

    public void alterarEmailUsuario() throws ClassNotFoundException, SQLException {
        BancoDeDados b1 = new BancoDeDados();
        b1.alterarEmailUsuarioPeloBancoDeDados();
    }

    public void filtrarExtrato() throws ClassNotFoundException, SQLException {
        BancoDeDados b1 = new BancoDeDados();
        b1.filtrarExtratoPeloBancoDeDados();
    }

    public void consultarNomeUsuario() throws ClassNotFoundException, SQLException {
        BancoDeDados b1 = new BancoDeDados();
        b1.consultarNomeUsuarioPeloBancoDeDados();
    }

    public void enviarExtratoPeloEmail() throws ClassNotFoundException, SQLException{
        BancoDeDados b1 = new BancoDeDados();
        b1.consultarEmailUsuarioPeloBancoDeDados();
        if (Usuario.getUsuarioValido()) {
            MultiPartEmail e1 = new MultiPartEmail();
            e1.setHostName("smtp.gmail.com");
            e1.setSmtpPort(465);
            e1.setAuthenticator(new DefaultAuthenticator("caioximendes1@gmail.com", "uzip qush rdzs bijo"));
            e1.setSSLOnConnect(true);
            try {
                e1.setFrom("caioximendes1@gmail.com");
                e1.setSubject("BANCO JAVA: E-mail de Consulta de Extrato");
                e1.setMsg("Olá, "+Usuario.getNome()+", você está recebendo este e-mail com o seu Extrato Bancário, segue em anexo: ");
                e1.addTo(Usuario.getEmail());
                //ENVIAR ANEXO DO EXTRATO
                EmailAttachment attachment = new EmailAttachment();
                attachment.setPath("C:\\Users\\caiox\\Desktop\\ExtratoDe"+Usuario.getNome()+".pdf");
                attachment.setDisposition(EmailAttachment.ATTACHMENT);
                attachment.setDescription("Extrato de "+Usuario.getNome());
                attachment.setName("ExtratoDe"+Usuario.getNome()+".pdf");
                e1.attach(attachment);
                e1.send();
                System.out.println("Email enviado!");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    public void gerarBoletoDeposito(){
        LocalDate dataBancoCentral = LocalDate.of(1997, 10, 7);
        LocalDate dataAtual = LocalDate.now();
        long diferencaDias = ChronoUnit.DAYS.between(dataBancoCentral, dataAtual);
        long dataValidade = diferencaDias+1;
        long qtdAlgarismosZerosValorBoleto = Long.toString(Boleto.getValorBoleto()).length();
        String algarismosZeros = "";
        for(int x=0;x<qtdAlgarismosZerosValorBoleto;x++){
            algarismosZeros = algarismosZeros + "0";
        }
        Boleto.setCodigoBoleto("999"+"111111111111111111111111111111"+dataValidade+algarismosZeros+Boleto.getValorBoleto());
        
    }
    public void enviarCodigoBoletoEmail(){
        SimpleEmail e1 = new SimpleEmail();
            e1.setHostName("smtp.gmail.com");
            e1.setSmtpPort(465);
            e1.setAuthenticator(new DefaultAuthenticator("caioximendes1@gmail.com", "uzip qush rdzs bijo"));
            e1.setSSLOnConnect(true);
            try {
                Random random = new Random();
                e1.setFrom("caioximendes1@gmail.com");
                e1.setSubject("BANCO JAVA: E-mail de Envio de Código de Boleto Bancário");
                Usuario.setCodigoRecuperacao(1000 + random.nextInt(9000));
                e1.setMsg("Olá, você está recebendo este e-mail com o código do seu Boleto Bancário gerado por você.\nSeu Código de Boleto Bancário é: " + Boleto.getCodigoBoleto()+"\n\n"+"A data de validade deste boleto é de 1 dia após a emissão.");
                e1.addTo(Usuario.getEmail());
                e1.send();
                System.out.println("Email enviado!");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
    }
}
