package model;

import enums.Moeda;

import java.math.BigDecimal;

public class ConversorDeMoedaLibraEsterlina extends ConversorDeMoeda {

    @Override
    public BigDecimal converterParaMoeda(Moeda moeda, BigDecimal valorEmReais) {
        moeda = Moeda.LIBRA_ESTERLINA;
        return super.converterParaMoeda(moeda, valorEmReais);
    }

    @Override
    public BigDecimal converterParaReal(Moeda moeda, BigDecimal valorNaMoeda) {
        moeda = Moeda.LIBRA_ESTERLINA;
        return super.converterParaReal(moeda, valorNaMoeda);
    }
}
