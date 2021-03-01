package be.vdab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

class PersoonTest {
    private Persoon voornaam;

    @BeforeEach
    void beforeEach() {
        voornaam = new Persoon();
    }

    @Test
    void eenNullWaardeKanNiet() {
        assertThatIllegalArgumentException().isThrownBy(() -> voornaam.add(null));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " ", "   "})
    void moetMinstensEenNietBlancoTekenBevatten(String tekst) {
        assertThatIllegalArgumentException().isThrownBy(() -> voornaam.add(tekst));
    }

    @Test
    void tweeKeerDezelfdeVoornaamKanNiet() {
        voornaam.add("Pablo Diego Francisco Pablo");
        assertThat(voornaam).hasToString("Pablo Diego Francisco");
    }

    @Test
    void toStringGeeftDeJuisteVolgordeMetEenSpatieTerug() {
        voornaam.add("Pablo  Diego Francisco");
        assertThat(voornaam.toString()).isEqualTo("Pablo Diego Francisco");
    }
}