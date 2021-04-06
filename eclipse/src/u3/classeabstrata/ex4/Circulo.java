package u3.classeabstrata.ex4;

public class Circulo extends Figura{

    private float raio;

    /**
     * @param raio
     */
    public Circulo(String nome, float raio) {
        super(nome);
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo [raio=" + raio + "] " + super.toString();
    }

    @Override
    public float calcularArea() {
        return (float)Math.PI * raio * raio;
    }

    @Override
    public float calcularCircumferencia() {
        return 2 * (float)Math.PI * raio;
    }
}
