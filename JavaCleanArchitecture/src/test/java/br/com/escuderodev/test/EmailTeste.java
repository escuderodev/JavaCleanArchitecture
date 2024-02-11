package br.com.escuderodev.test;

import br.com.escuderodev.escola.domain.componentes.Email;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmailTeste {
    @Test
    void testarEmailComEnderecoInvalido() {
        assertThrows(IllegalArgumentException.class,
                () -> new Email(null));

        assertThrows(IllegalArgumentException.class,
                () -> new Email(""));

        assertThrows(IllegalArgumentException.class,
                () -> new Email("emailsemarrroba.com"));
    }

    @Test
    void testarEmailComEnderecoValido() {
        assertThrows(IllegalArgumentException.class,
                () -> new Email("escuderodev@gmail.com"));
    }
}
