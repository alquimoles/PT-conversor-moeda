package interfaces;

import java.math.BigDecimal;

public interface InicializadorConversao {
    BigDecimal operarConversao(String operacao, double valorInicial) throws Exception;
}
