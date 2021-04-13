package u3.interfaces.calc.ex6;

public class Calculadora implements 
  Adicao, Subtracao, Multiplicacao, Divisao{

    @Override
    public float dividir(int a, int b) {
        return a / (float)b;
    }

    @Override
    public int multiplicar(int a, int b) {
        return a * b;
    }

    @Override
    public int subtrair(int a, int b) {
        return a - b;
    }

    @Override
    public int somar(int a, int b) {
        return a + b;
    }

}
