public class Passageiro  extends Pessoa {

    private Passagem passagem;

    public Passageiro(Passagem passagem) {
        if (passagem == null){
            throw new NullPointerException("Passagem é obrigatória!");
        }

        this.passagem = passagem;
    }

    public int getPassagem() {
        return passagem.getNumero();
    }

    public void setPassagem(int passagem) {
        this.passagem.setNumero(passagem);
    }
}
