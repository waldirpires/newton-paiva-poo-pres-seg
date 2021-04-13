package u3.interfaces.pegasus.ex7;

public class Pegasus extends Animal implements Passaro, Cavalo{

    public Pegasus(String nome) {
        super(nome);
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " correndo . . .");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " voando . . .");
    }

    @Override
    void fazerBarulho() {
        System.out.println(getNome() + " fazendo barulho . . .");        
    }

}
