package model;

import enums.Moeda;

import java.math.BigDecimal;

public class ConversorDeMoedaEuro extends ConversorDeMoeda {
    @Override
    public BigDecimal converterParaMoeda(Moeda moeda, BigDecimal valorEmReais) {
        moeda = Moeda.EURO;
        return super.converterParaMoeda(moeda, valorEmReais);
    }

    @Override
    public BigDecimal converterParaReal(Moeda moeda, BigDecimal valorNaMoeda) {
        moeda = Moeda.EURO;
        return super.converterParaReal(moeda, valorNaMoeda);
    }
}
