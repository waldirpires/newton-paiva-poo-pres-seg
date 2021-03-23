package u2.floresta;

public class Arvore {
    
    private static int quantidade;
    
    private String nome;
    private float altura;
    /**
     * @param nome
     * @param altura
     */
    public Arvore(String nome, float altura) {
        this.nome = nome;
        this.altura = altura;
        
        quantidade++;
    }
    
    @Override
    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }
    
    @Override
    public String toString() {
        return "Arvore [nome=" + nome + ", altura=" + altura + "]";
    }    
}