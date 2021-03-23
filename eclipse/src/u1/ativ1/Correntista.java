package seg.u1.ativ1;

public class Correntista {
    
    private String nome;
    private String cpf;
    
    /**
     * @param nome
     * @param cpf
     */
    public Correntista(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Correntista [nome=" + nome + ", cpf=" + cpf + "]";
    }    
}