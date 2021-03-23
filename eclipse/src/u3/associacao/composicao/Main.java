package seg.u3.associacao.composicao;

public class Main {

    public static void main(String[] args) {
        // criar as paredes
        var parede1 = new Parede("branco gelo");
        var parede2 = new Parede("branco gelo");
        var parede3 = new Parede("branco gelo");
        var parede4 = new Parede("branco gelo");

        // composição
        var casa = new Casa(parede1, parede2, parede3, parede4);
        System.out.println(casa);
        
        // pintar uma das paredes
        casa.getParede1().setCor("Cinza claro");
        System.out.println("\n\nDepois de pintada:");
        System.out.println(casa);
    }

}
