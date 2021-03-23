package seg.u3.associacao.composicao;

public class Casa {
    
    private Parede parede1;
    private Parede parede2;
    private Parede parede3;
    private Parede parede4;

    public Casa(Parede parede1, Parede parede2, Parede parede3, Parede parede4) {
        this.parede1 = parede1;
        this.parede2 = parede2;
        this.parede3 = parede3;
        this.parede4 = parede4;
    }

    @Override
    public String toString() {
        return "Casa [parede1=" + parede1 + ", parede2=" + parede2 + ", parede3=" + parede3 + ", parede4=" + parede4
                + "]";
    }

    public Parede getParede1() {
        return parede1;
    }

    public Parede getParede2() {
        return parede2;
    }

    public Parede getParede3() {
        return parede3;
    }

    public Parede getParede4() {
        return parede4;
    }
    
}
