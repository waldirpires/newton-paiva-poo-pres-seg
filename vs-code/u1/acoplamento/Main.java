package acoplamento;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var computador = new Computador();

        var epson = new Impressora();
        computador.impressora = epson;

        var scanner = new Scanner(System.in);

        System.out.println("Digite uma frase para imprimir: ");
        var frase = scanner.nextLine();

        computador.imprimir(frase);

        scanner.close();

        epson.desligar();
    }
}
