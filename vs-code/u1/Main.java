public class Main {

    public static void main(String[] args) {
        var bmw = new Carro();

        //bmw.marca = "BMW";

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
