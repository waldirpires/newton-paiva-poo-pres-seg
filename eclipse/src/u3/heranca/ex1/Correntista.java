package u3.heranca.ex1;

public class Correntista {

    protected String nome;
    protected String cidade;
    protected String telefone;

    public Correntista(String nome) {
        this.nome = nome;
    }
    
    public Correntista(String nome, String cidade, String telefone) {
        this.nome = nome;
        this.cidade = cidade;
        this.telefone = telefone;
    }
    
    public float obterTaxa() {
        return 0.10f;
    }

    @Override
    public String toString() {
        return "Correntista [nome=" + nome + ", cidade=" + cidade + ", telefone=" + telefone + "]";
    }        
}