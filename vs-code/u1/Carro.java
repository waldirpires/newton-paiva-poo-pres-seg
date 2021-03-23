
public class Carro {

    private String marca;
    String modelo;
    String cor;
    int ano;
    int km;
    double velocidade = 0;

    void acelerar() {
        velocidade = velocidade + 10;
    }

    void frear() {
        velocidade = velocidade - 10;
    }

    void parar() {
        velocidade = 0;
    }

    public static void main(String[] args) {
        var bmw = new Carro();

        bmw.marca = "BMW";

        // acelerar
        bmw.acelerar();
        // acelerar
        bmw.acelerar();
        // frear
        bmw.frear();
        // parar
        bmw.parar();

        var mercedes = new Carro();
        mercedes.acelerar();

        var fusca = new Carro();
        fusca.acelerar();
    }
}
