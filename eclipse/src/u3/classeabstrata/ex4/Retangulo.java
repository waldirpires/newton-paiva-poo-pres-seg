package u3.classeabstrata.ex4;

public class Retangulo extends Figura{

    private float lado1;
    private float lado2;
    
    /**
     * @param lado1
     * @param lado2
     */
    public Retangulo(String nome, float lado1, float lado2) {
        super(nome);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    @Override
    public String toString() {
        return "Retangulo [lado1=" + lado1 + ", lado2=" + lado2 + "]";
    }
    
    @Override
    public float calcularArea() {
        return lado1 * lado2;
    }
    
    @Override
    public float calcularCircumferencia() {
        return 2 * (lado1 + lado2);
    }    
}