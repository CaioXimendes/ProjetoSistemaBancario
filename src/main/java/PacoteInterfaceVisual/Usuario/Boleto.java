/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PacoteInterfaceVisual.Usuario;

/**
 *
 * @author CaioFSX
 */
public class Boleto {

    private static String codigoBoleto;
    private static String codigoBanco;
    private static int fatorVencimento;
    private static long valorBoleto;
    
    public static String getCodigoBoleto() {
        return codigoBoleto;
    }
    
    public static void setCodigoBoleto(String codigoBoleto) {
        Boleto.codigoBoleto = codigoBoleto;
    }
    
    public static String getCodigoBanco() {
        return codigoBanco;
    }

    public static void setCodigoBanco(String codigoBanco) {
        Boleto.codigoBanco = codigoBanco;
    }

    public static int getFatorVencimento() {
        return fatorVencimento;
    }

    public static void setFatorVencimento(int fatorVencimento) {
        Boleto.fatorVencimento = fatorVencimento;
    }

    public static long getValorBoleto() {
        return valorBoleto;
    }

    public static void setValorBoleto(long valorBoleto) {
        Boleto.valorBoleto = valorBoleto;
    }
}
