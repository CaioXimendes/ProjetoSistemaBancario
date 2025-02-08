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
/**
 *
 * @author CaioFSX
 */
public class ValidarInformacoesUsuario {
    public ValidarInformacoesUsuario(){
    }
    
    public void checarUsuarioPeloCPF() throws ClassNotFoundException, SQLException{
          BancoDeDados b1 = new BancoDeDados();
          b1.checarSeUsuarioContemCPF();
          if(Usuario.getUsuarioValido()){
              PaginaPedirSenhaLogin p1 = new PaginaPedirSenhaLogin();
              p1.setVisible(true);
          }
          else{
              PaginaCriarConta p1 = new PaginaCriarConta();
              p1.setVisible(true);
          }
    }
    public void CadastrarUsuario(String cpf ,String nome, String email, int senha){
        System.out.println("Usuario cadastrado com os registros:\ncpf:"+Usuario.getCpf()+"\nnome:"+Usuario.getNome()+"\nemail:"+Usuario.getEmail()+"\nsenha:"+Usuario.getSenha());
    }
}
