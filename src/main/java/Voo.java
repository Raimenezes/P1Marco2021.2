import java.util.ArrayList;
import java.util.List;

public class Voo {

    private String destino;
    private int capacidade;
    private Aeromoca aeromoca;
    private List<Assento> Assentos;

    public Voo() {
        this.Assentos = new ArrayList<Assento>();

    }

    public void adicionar(Assento assento) {
        this.Assentos.add(assento);
    }

    public int getNumeroAdicionar() {
        return this.Assentos.size();
    }


    public String getAeromoca() {
        return this.aeromoca.getNome();
    }

    public void setAeromoca(Aeromoca aeromoca) {
        if (aeromoca == null){
            throw new NullPointerException("Aeromoça n pode estar null!");
        }

        this.aeromoca = aeromoca;
    }


    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
