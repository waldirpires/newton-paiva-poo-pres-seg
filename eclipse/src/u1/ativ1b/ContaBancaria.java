package u1.ativ1b;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {

    private String banco;
    private String agencia;
    private String numero;
    private float saldo;
    
    private List<String> extrato = new ArrayList<>();
    
    public String getBanco() {
        return banco;
    }
    
    public void setBanco(String banco) {
        this.banco = banco;
    }
    
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
    
        this.agencia = agencia;
    }
    
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public float getSaldo() {
        return saldo;
    }
    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public boolean sacar(float valor) {
        return sacar(valor, true);
    }

    public boolean sacar(float valor, boolean exibirNoExtrato) {
        if (valor <= 0) {
            System.out.println("ALERTA: valor de saque inválido: " + valor);
            
            return false;
        }
        
        if (valor > saldo) {
            System.out.println("ALERTA: saldo insuficiente");
            
            return false;
        }
        
        // efetivar o saque
        saldo = saldo - valor;
        
        if (exibirNoExtrato) {
            adicionarOperacaoNoExtrato("saque", valor);
        }
        
        return true;
    }

    private void adicionarOperacaoNoExtrato(String operacao, float valor) {
        var dateTime = LocalDateTime.now();
        extrato.add(String.format("%30s - %25s - %05.2f", 
                dateTime.format(DateTimeFormatter.ISO_DATE_TIME),
                operacao,
                valor));        
    }
    
    public void depositar(float valor) {
        if (valor <= 0) {
            System.out.println("ALERTA: valor de depósito inválido: " + valor);
            
            return;
        }
        
        saldo = saldo + valor;
        
        adicionarOperacaoNoExtrato("depósito", valor);
    }
    
    public boolean transferir(float valor, String contaDestino) {
        // sacar da conta
        var ehValida = this.sacar(valor, false);
        // depositar na conta destino
        if (!ehValida) {
            System.out.println("ALERTA: não foi possível a transferência da conta");
            
            return false;            
        }
        
        adicionarOperacaoNoExtrato("transferencia - " + contaDestino, valor);

        return true;
    }
    
    public boolean pagarConta(float valor, String destinatario) {
        // sacar da conta
        var ehValido = this.sacar(valor, false);
        // pagar
        if (!ehValido) {
            System.out.println("ALERTA: não foi possível o pagamento da conta: " + destinatario);
            
            return false;
        }
        
        adicionarOperacaoNoExtrato("pagamento conta - " + destinatario, valor);
        
        return true;// saque bem sucedido.
    }
    
    public void exibirExtrato() {
        
        System.out.println("===============================");
        System.out.println("Banco " + banco);
        System.out.println(LocalDateTime.now());
        System.out.println("\n");
        System.out.println("Agência: " + agencia);
        System.out.println("Número: " + numero + "\n");
        
        for (var linha: extrato) {  // for each
            System.out.println(linha);
        }
        
        System.out.println(String.format("Saldo em conta: \t R$%05.2f", saldo));
        
//        for (int i = 0; i < extrato.size(); i++) {
//            System.out.println(extrato.get(i));
//        }
        System.out.println("===============================\n\n");

    }
}
