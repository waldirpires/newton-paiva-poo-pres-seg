package u3.heranca.ex1;

public class PessoaFisica extends Correntista{

    private String cpf;
    
    public PessoaFisica(String nome, String cidade, String telefone, String cpf) {
        super(nome, cidade, telefone);
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "PessoaFisica [cpf=" + cpf + 
                ", nome=" + nome + 
                ", cidade=" + cidade + 
                ", telefone=" + telefone + "]";
    }

    public float obterTaxa() {
        return 0.12f;
    }    
}