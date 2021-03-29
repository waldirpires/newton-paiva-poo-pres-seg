package u3.composicao.ex2;

public class Main {

    public static void main(String[] args) {
        var ponto1 = new Ponto(0, 0);
        System.out.println(ponto1 + "\n");
        var ponto2 = new Ponto(3, 3);
        System.out.println(ponto2 + "\n");
        
        var reta = new Reta(ponto1, ponto2);
        System.out.println(reta + "\n");
        
        var ponto3 = new Ponto(0, 3);
        var triangulo = new Triangulo(ponto1, ponto2, ponto3);
        System.out.println(triangulo + "\n");

        var ponto3b = new Ponto(4, 2);
        var ponto4 = new Ponto(0, 3);
        var quadrilatero = new Quadrilatero(ponto1, ponto2, ponto3b, ponto4);
        System.out.println(quadrilatero);
    }
}
