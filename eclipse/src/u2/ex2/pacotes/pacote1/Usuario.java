package u2.ex2.pacotes.pacote1;

public class Usuario {

    int id; // por pacote, acesso default
    
    public float valor; // não é indicada
    
    private String nome;
    
    public String getNome() {
        return nome;
    }
    
    public float getValor() {
        return valor;
    }
}
