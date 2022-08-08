package model;

import enums.Moeda;
import interfaces.MoedaConversivel;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConversorDeMoeda implements MoedaConversivel {

    public BigDecimal converterParaMoeda(Moeda moeda, BigDecimal valorEmReais) {
        return valorEmReais.divide(moeda.getFATOR_CONVERSAO(), 2, RoundingMode.HALF_UP);
    }

    public BigDecimal converterParaReal(Moeda moeda, BigDecimal valorNaMoeda){
        return valorNaMoeda.multiply(moeda.getFATOR_CONVERSAO());
    };


}
