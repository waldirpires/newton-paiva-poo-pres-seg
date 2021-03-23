package atividade1;

public class Banco {
    private String nome;
    private Agencia agencia;

    public Agencia getAgencia() {
        return agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
}
