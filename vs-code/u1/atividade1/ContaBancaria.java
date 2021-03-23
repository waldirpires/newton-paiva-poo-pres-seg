package atividade1;

public class ContaBancaria {
    private Correntista correntista;

    private Agencia agencia;
    private String numero;
    private float saldo;

    public Agencia getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void depositar(float valor) {
        saldo = saldo + valor;
    }

    public void sacar(float valor) {
        // verificar se existe saldo
        saldo = saldo - valor;
    }
}
