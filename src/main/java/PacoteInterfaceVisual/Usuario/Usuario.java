/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PacoteInterfaceVisual.Usuario;

/**
 *
 * @author CaioFSX
 */
public class Usuario {
    private static String cpf;
    private static String nome;
    private static String email;
    private static double saldo;
    private static int senha;
    private static int senha4digitos;
    private static int numeroConta;
    private static boolean usuarioValido;
    
    public static String getCpf() {
        return cpf;
    }

    public static void setCpf(String cpf) {
        Usuario.cpf = cpf;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Usuario.nome = nome;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Usuario.email = email;
    }
    
    public static double getSaldo() {
        return saldo;
    }

    public static void setSaldo(double saldo) {
        Usuario.saldo = saldo;
    }

    public static int getSenha() {
        return senha;
    }

    public static void setSenha(int senha) {
        Usuario.senha = senha;
    }
    
    public static int getSenha4Digitos(){
        return senha4digitos;
    }
    
    public static void setSenha4Digitos(int senha4digitos){
        Usuario.senha4digitos = senha4digitos;
    }

    public static int getNumeroConta() {
        return numeroConta;
    }

    public static void setNumeroConta(int numeroConta) {
        Usuario.numeroConta = numeroConta;
    }
    
    public static boolean getUsuarioValido(){
        return usuarioValido;
    }
    public static void setUsuarioValido(boolean usuarioValido){
        Usuario.usuarioValido = usuarioValido;
    }
}
