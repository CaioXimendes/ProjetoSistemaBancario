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

    public static List<String> getDataExtratoLista() {
        return dataExtratoLista;
    }

    public static void addDataExtratoLista(String dataExtrato) {
        Extrato.dataExtratoLista.add(dataExtrato);
    }

    public static List<String> getDescricaoExtratoLista() {
        return descricaoExtratoLista;
    }

    public static void addDescricaoExtratoLista(String descricaoExtrato) {
        Extrato.descricaoExtratoLista.add(descricaoExtrato);
    }

    public static List<Double> getValorExtratoLista() {
        return valorExtratoLista;
    }

    public static void addValorExtratoLista(Double valorExtrato) {
        Extrato.valorExtratoLista.add(valorExtrato);
    }

    public static List<String> getTipoCreditoDebitoExtratoLista() {
        return tipoCreditoDebitoExtratoLista;
    }

    public static void addTipoCreditoDebitoExtratoLista(String tipoCreditoDebitoExtrato) {
        Extrato.tipoCreditoDebitoExtratoLista.add(tipoCreditoDebitoExtrato);
    }
    private static List<String> dataExtratoLista = new ArrayList<>();
    private static List<String> descricaoExtratoLista = new ArrayList<>();
    private static List<Double> valorExtratoLista = new ArrayList<>();
    private static List<String> tipoCreditoDebitoExtratoLista = new ArrayList<>();

    public static void setDataExtratoLista(List<String> dataExtratoLista) {
        Extrato.dataExtratoLista = dataExtratoLista;
    }

    public static void setDescricaoExtratoLista(List<String> descricaoExtratoLista) {
        Extrato.descricaoExtratoLista = descricaoExtratoLista;
    }

    public static void setValorExtratoLista(List<Double> valorExtratoLista) {
        Extrato.valorExtratoLista = valorExtratoLista;
    }

    public static void setTipoCreditoDebitoExtratoLista(List<String> tipoCreditoDebitoExtratoLista) {
        Extrato.tipoCreditoDebitoExtratoLista = tipoCreditoDebitoExtratoLista;
    }
    
    
}
