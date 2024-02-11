package br.com.escuderodev.test;

import br.com.escuderodev.escola.domain.componentes.Telefone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TelefoneTeste {
    @Test
    void testarTelefoneInvalido() {
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(null,null));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(null,""));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(null,"955005284"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(null,"95500-5284"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(null,"9550052840"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("011",null));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("011",""));
    }

    @Test
    void testarTelefoneValido() {
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("011","32518767"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("011","955005284"));
    }
}
