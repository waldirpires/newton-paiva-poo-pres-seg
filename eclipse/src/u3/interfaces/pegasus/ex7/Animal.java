package u3.interfaces.pegasus.ex7;

public abstract class Animal {

    private String nome;
    
    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    abstract void fazerBarulho();

    @Override
    public String toString() {
        return "Animal [nome=" + nome + "]";
    }
}