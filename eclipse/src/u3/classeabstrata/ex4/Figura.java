package u3.classeabstrata.ex4;

public abstract class Figura {

    protected String nome;
    
    public Figura(String nome) {
        this.nome = nome;
    }

    public abstract float calcularArea();
    
    public abstract float calcularCircumferencia();

    @Override
    public String toString() {
        return "Figura [nome=" + nome + "]";
    }
    
}
