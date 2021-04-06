package u3.classeabstrata.ex4;

public class Quadrado extends Figura{

    private float lado;

    /**
     * @param lado
     */
    public Quadrado(String nome, float lado) {
        super(nome);
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Quadrado [lado=" + lado + ", nome="+ nome + "]";
    }

    @Override
    public float calcularArea() {
        return lado * lado;
    }

    @Override
    public float calcularCircumferencia() {
        return lado * 4;
    }      
}