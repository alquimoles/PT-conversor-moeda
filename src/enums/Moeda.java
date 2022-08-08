package enums;

import java.math.BigDecimal;

public enum Moeda {

    //Cotações em 27/07/2022
    DOLAR(BigDecimal.valueOf(5.30)),
    EURO(BigDecimal.valueOf(5.35)),
    LIBRA_ESTERLINA(BigDecimal.valueOf(6.38)),
    PESO_ARGENTINO(BigDecimal.valueOf(0.041)),
    PESO_CHILENO(BigDecimal.valueOf(0.0058));

    private BigDecimal FATOR_CONVERSAO;

    Moeda(BigDecimal FATOR_CONVERSAO) {
        this.FATOR_CONVERSAO = FATOR_CONVERSAO;
    }

    public BigDecimal getFATOR_CONVERSAO() {
        return FATOR_CONVERSAO;
    }
}
