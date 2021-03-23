package u2.floresta;

public class Arvore {

    // variáveis estáticas -> classe
    private static int quantidade;
    public static final float ALTURA_MAXIMA = 20.0F;

    // variáveis dinâmicas -> objeto
    private float altura;
    private String especie;

    // construtor
    public Arvore(float altura, String especie) {
        this.altura = altura;
        this.especie = especie;

        quantidade++;
    }

    public float getAltura() {
        return altura;
    }

    public String getEspecie() {
        return especie;
    }

    public void balancar() {
        System.out.println(especie + " - vento . . . ");
    }

    // public void setAltura(float altura) {
    // this.altura = altura;
    // }

    // public void setEspecie(String especie) {
    // this.especie = especie;
    // }

    // metodo estático
    public static int getQuantidade() {
        return quantidade;
    }
}
