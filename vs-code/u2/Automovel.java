package u2;

public class Automovel {

    String marca;
    String modelo;
    String cor;
    int ano;
    float preco;
    int km;

    /**
     * Construtor padrão
     */
    public Automovel() {
    }

    /**
     * Construtor customizado 1
     */
    public Automovel(String marca, String modelo, String cor, int ano, float preco, int km) {
        this(marca, modelo, cor);
        this.ano = ano;
        this.preco = preco;
        this.km = km;
    }

    /**
     * Construtor customizado 2
     */
    public Automovel(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = 2021;
        this.preco = 0;
        this.km = 0;
    }

    public static void main(String[] args) {
        var auto = new Automovel();

        System.out.println(auto);
    }
}