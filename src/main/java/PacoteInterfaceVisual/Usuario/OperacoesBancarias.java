/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PacoteInterfaceVisual.Usuario;

/**
 *
 * @author CaioFSX
 */
public class OperacoesBancarias {
    private static String chavePixCpf;
    private static double quantiaTransferencia;
    private static boolean chavePixValida;

    public static String getChavePixCpf() {
        return chavePixCpf;
    }

    public static void setChavePixCpf(String chavePixCpf) {
        OperacoesBancarias.chavePixCpf = chavePixCpf;
    }

    public static double getQuantiaTransferencia() {
        return quantiaTransferencia;
    }

    public static void setQuantiaTransferencia(double quantiaTransferencia) {
        OperacoesBancarias.quantiaTransferencia = quantiaTransferencia;
    }
    public static boolean getChavePixValida() {
        return chavePixValida;
    }

    public static void setChavePixValida(boolean chavePixValida) {
        OperacoesBancarias.chavePixValida = chavePixValida;
    }
    
}
