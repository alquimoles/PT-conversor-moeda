package model;

import enums.Moeda;

import java.math.BigDecimal;

public class ConversorDeMoedaPesoArgentino extends ConversorDeMoeda {

    @Override
    public BigDecimal converterParaMoeda(Moeda moeda, BigDecimal valorEmReais) {
        moeda = Moeda.PESO_ARGENTINO;
        return super.converterParaMoeda(moeda, valorEmReais);
    }

    @Override
    public BigDecimal converterParaReal(Moeda moeda, BigDecimal valorNaMoeda) {
        moeda = Moeda.PESO_ARGENTINO;
        return super.converterParaReal(moeda, valorNaMoeda);
    }
}
