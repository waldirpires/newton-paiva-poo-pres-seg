package seg.u3.associacao.composicao;

public class Parede {

    private String cor;

    /**
     * @param cor
     */
    public Parede(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Parede [cor=" + cor + "]";
    }
    
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
}
