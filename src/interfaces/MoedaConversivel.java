package interfaces;

import enums.Moeda;

import java.math.BigDecimal;

public interface MoedaConversivel {

    BigDecimal converterParaMoeda(Moeda moeda, BigDecimal valorEmReais);
    BigDecimal converterParaReal(Moeda moeda, BigDecimal valorNaMoeda);

}
