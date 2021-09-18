import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PassageiroTest {

    @Test
    void deveRetornarNumeroPassagem() {
        Passagem passagem = new Passagem(02);
        Passageiro passageiro = new Passageiro(passagem);
        assertEquals(02, passageiro.getPassagem());

    }

    @Test
    void deveRetornarExecaoNullPassagemConstrutor() {
        try {
            Passageiro passageiro = new Passageiro(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Passagem é obrigatória!", e.getMessage());
        }
    }
}