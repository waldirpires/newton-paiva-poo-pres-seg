package u1.ativ1b;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        var conta = new ContaBancaria();
        
        conta.setBanco("Banco Newton");
        conta.setAgencia("00001");
        conta.setNumero("123456-7");

        conta.exibirExtrato();
        
        // tentar sacar invalido - negativo e saldo insuficiente
        conta.sacar(-1);
        
        // tentar depositar invalido - negativo
        conta.depositar(-1);
        
        // depositar valido
        conta.depositar(1000);
        
        // sacar valido
        conta.sacar(100);
        
        conta.exibirExtrato();
        
        // pagar conta
        conta.pagarConta(50, "Netflix");
        
        // transferir
        conta.transferir(50, "234567-8");
        
        // exibirExtrato
        conta.exibirExtrato();
        
    }

}
