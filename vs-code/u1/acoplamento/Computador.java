package acoplamento;

public class Computador {

    Impressora impressora;

    void imprimir(String texto) {
        impressora.ligar();

        impressora.imprimir(texto);

        impressora.desligar();
    }

}
