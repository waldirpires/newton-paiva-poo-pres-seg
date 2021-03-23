
public class Arvore {

    // atributo estático - pertence a classe
    private static int quantidade = 0;

    // atributo dinâmico - pertence ao objeto
    private String nome;
    private float altura;

    // construtor padrão
    public Arvore() {
        quantidade++;
    }

    // construtor customizado
    public Arvore(String nome, float altura) {
        this.nome = nome;
        this.altura = altura;

        quantidade++;
    }

    // acessores
    public float getAltura() {
        return altura;
    }

    public String getNome() {
        return nome;
    }

    public void balancar() {
        System.out.println("A árvore " + nome + " está balançando");
    }

    public void cortar() {
        altura = 0.0f;
    }

    // modificadores
    // public void setAltura(float altura) {
    // this.altura = altura;
    // }

    // public void setNome(String nome) {
    // this.nome = nome;
    // }

    @Override
    public String toString() {
        return "Árvore " + nome + ", altura: " + altura + "m";
    }

    // método estático - pertence a classe
    public static int getQuantidade() {
        return quantidade;
    }
}