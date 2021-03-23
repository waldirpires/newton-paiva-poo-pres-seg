package seg.u3.Atvi2.banco;

public class ContaBancaria {

    private String banco;
    private String agencia;
    private String numero;
    private float saldo;

    /**
     * @param numero
     */
    public ContaBancaria(String banco, String agencia, String numero) {
        this.banco = banco;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0;
    }

    public String getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void efetuarSaque(float valor) {
        if (valor > saldo) {
            System.out.println("ALERTA: Saldo insuficiente");

            return;
        }
        
        this.saldo = saldo - valor;
    }

    public void efetuarDeposito(float valor) {
        this.saldo = saldo + valor;
    }
}