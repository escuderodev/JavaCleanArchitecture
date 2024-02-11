package br.com.escuderodev.test;

import br.com.escuderodev.escola.domain.componentes.CPF;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CPFTeste {
    @Test
    void testarCPFInvalido() {
        assertThrows(IllegalArgumentException.class,
                () -> new CPF(null));

        assertThrows(IllegalArgumentException.class,
                () -> new CPF(""));

        assertThrows(IllegalArgumentException.class,
                () -> new CPF("18314999083"));
    }

    @Test
    void testarCPFValido() {
        assertThrows(IllegalArgumentException.class,
                () -> new CPF("183.149.990-83"));
    }
}
