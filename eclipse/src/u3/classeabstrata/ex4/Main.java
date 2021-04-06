package u3.classeabstrata.ex4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        var circulo = new Circulo("Circulo01", 10.2f);
        
        var quadrado = new Quadrado("Quadrado01", 4.0f);
        
        var retangulo = new Retangulo("Retangulo01", 3.0f, 6.0f);
        
        var figuras = new ArrayList<Figura>();
        figuras.add(circulo);
        figuras.add(quadrado);
        figuras.add(retangulo);
        
        for (var f: figuras) {
            System.out.println(f);
            System.out.println("Circumferência: " + f.calcularCircumferencia());
            System.out.println("Área: " + f.calcularArea());
            System.out.println("\n==\n");
        }
    }

}
