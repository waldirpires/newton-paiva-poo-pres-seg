package u3.interfaces.calc.ex6;

public class Main {

    public static void main(String[] args) {
        int a = 12;
        int b = 7;
        
        var calc = new Calculadora();
        
        System.out.println("Somar: " + calc.somar(a,  b));
        System.out.println();

        System.out.println("Subtrair: " + calc.subtrair(a,  b));
        System.out.println();

        System.out.println("Multiplicar: " + calc.multiplicar(a,  b));
        System.out.println();

        System.out.println("Dividir: " + calc.dividir(a,  b));
        System.out.println();
    }
}
