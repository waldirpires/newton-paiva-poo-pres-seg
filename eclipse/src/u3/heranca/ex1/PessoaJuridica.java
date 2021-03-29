package u3.heranca.ex1;

public class PessoaJuridica extends Correntista{

    private String cnpj;
    
    public PessoaJuridica(String nome, String cidade, String telefone, String cnpj) {
        // chamada para o construtor da superclasse
        //super(nome);
        super(nome, cidade, telefone);
        this.cnpj = cnpj;        
    }

    @Override
    public String toString() {
        return "PessoaJuridica [cnpj=" + cnpj + ", nome=" + nome + ", cidade=" + cidade + ", telefone=" + telefone
                + "]";
    }

    public float obterTaxa() {
        return 0.07f;
    }    
}
