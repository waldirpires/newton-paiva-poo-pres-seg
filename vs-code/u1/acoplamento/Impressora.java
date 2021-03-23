package acoplamento;

public class Impressora {

    private boolean ligar; // de ligar

    private boolean lampada;

    public void imprimir(String texto) {
        System.out.println("Imprimiu: " + texto);
    }

    public void ligar() {
        ligar = true;
    }

    public void desligar() {
        ligar = false;
    }

    public void lerDadosParaImpressao(){ // baixa coesão

    }
}
