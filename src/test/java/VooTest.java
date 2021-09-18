import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class VooTest {

    @Test
    void deveRetornarVooComAeromoca(){
        Voo voo = new Voo();
        Aeromoca aeromoca = new Aeromoca();
        aeromoca.setNome("aline");
        voo.setAeromoca(aeromoca);
        assertEquals( "aline", voo.getAeromoca());
    }

    @Test
    void deveRetornarVooComAeromocaMock(){
        Aeromoca aeromoca = createMock(Aeromoca.class);
        expect(aeromoca.getNome()).andReturn("aline");
        replay(aeromoca);
        Voo voo = new Voo();
        voo.setAeromoca(aeromoca);
        assertEquals("aline", voo.getAeromoca());
    }


    @Test
    void deveRetornarExecaoNullAeromocaVoo(){
        try{
            Voo voo = new Voo();
            voo.setAeromoca(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Aeromoça n pode estar null!", e.getMessage());
        }
    }

    @Test
    void deveAdicionarUmAssento(){
        Voo voo = new Voo();
        Assento assento = new Assento();
        voo.adicionar(assento);

        assertEquals(1, voo.getNumeroAdicionar());
    }

    @Test
    void deveAdicionarUmAssentoMock(){
        Voo voo = createMock(Voo.class);
        expect(voo.getNumeroAdicionar()).andReturn(1);
        replay(voo);
        Assento assento = new Assento();
        assertEquals(1, voo.getNumeroAdicionar());
    }


    @Test
    void deveRetornarNenhumAssento(){
        Voo voo = new Voo();

        assertEquals(0, voo.getNumeroAdicionar());
    }

    @Test
    void deveAdicionarDoisAssentos(){
        Voo voo = new Voo();
        Assento assento1 = new Assento();
        Assento assento2 = new Assento();
        voo.adicionar(assento1);
        voo.adicionar(assento2);

        assertEquals(2, voo.getNumeroAdicionar());
    }

}