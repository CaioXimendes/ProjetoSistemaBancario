/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PacoteInterfaceVisual.Usuario;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CaioFSX
 */
public class Extrato {

    public static List getDataExtratoLista() {
        return dataExtratoLista;
    }

    public static void setDataExtratoLista(List dataExtratoLista) {
        Extrato.dataExtratoLista = dataExtratoLista;
    }

    public static List getDescricaoExtratoLista() {
        return descricaoExtratoLista;
    }

    public static void setDescricaoExtratoLista(List descricaoExtratoLista) {
        Extrato.descricaoExtratoLista = descricaoExtratoLista;
    }

    public static List getValorExtratoLista() {
        return valorExtratoLista;
    }

    public static void setValorExtratoLista(List valorExtratoLista) {
        Extrato.valorExtratoLista = valorExtratoLista;
    }

    public static List getTipoCreditoDebitoExtratoLista() {
        return tipoCreditoDebitoExtratoLista;
    }

    public static void setTipoCreditoDebitoExtratoLista(List tipoCreditoDebitoExtratoLista) {
        Extrato.tipoCreditoDebitoExtratoLista = tipoCreditoDebitoExtratoLista;
    }
    private static List dataExtratoLista = new ArrayList();
    private static List descricaoExtratoLista = new ArrayList();
    private static List valorExtratoLista = new ArrayList();
    private static List tipoCreditoDebitoExtratoLista = new ArrayList();
    
    
}
