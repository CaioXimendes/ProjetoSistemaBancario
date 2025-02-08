package PacoteInterfaceVisual.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import ConexaoBancoDeDados.ConexaoBanco;

public class UsuarioDAO {

	public void create(Usuario user) {
		
		Connection con = ConexaoBanco.getConnection();
		PreparedStatement stmt = null;
		
		try {
			stmt = con.prepareStatement("INSERT INTO usuarios (cpf, nome, email, senha, senha4digitos, numeroConta)VALUES(?,?,?,?,?,?)");
			stmt.setString(1, Usuario.getCpf());
			stmt.setString(2, Usuario.getNome());
			stmt.setString(3, Usuario.getEmail());
			stmt.setInt(4, Usuario.getSenha());
			stmt.setInt(5, Usuario.getSenha4Digitos());
			stmt.setInt(6, Usuario.getNumeroConta());
			
			stmt.executeUpdate();
			
			 JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ERROR AO SALVAR"+e);
		}finally {
			ConexaoBanco.closeConnection(con, stmt);
		}
		
		
	}
}

//CRIAR METODOS DE EXCLUIR E UPTADE
//FALTA COLOCAR OS METODOS NOS BOTAO QUE ARMAZENARAO AS INFORMAÇÕES DO USUARIOS NO FRONT END.