/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PacoteInterfaceVisual.Usuario;

/**
 *
 * @author CaioFSX
 */
public class ListaDeBancos {

    public static String getNomeBanco() {
        return nomeBanco;
    }

    public static void setNomeBanco(String nomeBanco) {
        ListaDeBancos.nomeBanco = nomeBanco;
    }

    public static String getCodigoBancoLista() {
        return codigoBancoLista;
    }

    public static void setCodigoBancoLista(String codigoBancoLista) {
        ListaDeBancos.codigoBancoLista = codigoBancoLista;
    }
    private static String nomeBanco;
    private static String codigoBancoLista;
}
