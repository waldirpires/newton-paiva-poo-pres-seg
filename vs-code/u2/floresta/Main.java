package u2.floresta;

public class Main {

    public static void main(String[] args) {

        // var arvore1 = new Arvore(); // construtor padrão

        var arvore1 = new Arvore(10.0f, "Jatobá"); // construtor customizado
        var arvore2 = new Arvore(15.0f, "Carvalho"); // construtor customizado

        // // usando o SET para atribuir
        // arvore1.setAltura(10.0f);
        // arvore1.setEspecie("Jatobá");

        // usando o GET para recuparar
        System.out.println("Altura:  " + arvore1.getAltura()); // dinâmicos
        System.out.println("Especie: " + arvore1.getEspecie());

        // a quantidade de árvores criadas
        System.out.println("Quantidade: " + Arvore.getQuantidade()); // estático

        System.out.println("Altura máxima: " + Arvore.ALTURA_MAXIMA); // estático

        // metodo do objeto
        arvore1.balancar();
        arvore2.balancar();

        System.out.println(System.currentTimeMillis());
    }
}
