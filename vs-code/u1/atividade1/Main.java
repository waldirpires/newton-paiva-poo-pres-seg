package atividade1;

public class Main {

    public static void main(String[] args) {

        var bancoNewton = new Banco();
        bancoNewton.setNome("Banco Newton de Paiva");

        var agencia = new Agencia();
        agencia.setCodigo("0001");
        agencia.setNome("Afonso Pena");

        var gerente = new Gerente();
        gerente.setNome("José Pereira");
        agencia.setGerente(gerente);

        bancoNewton.setAgencia(agencia);

        var conta = new ContaBancaria();
        System.out.println(conta.getSaldo());

        conta.depositar(100.0f);
        System.out.println(conta.getSaldo());

        conta.sacar(50.0f);
        System.out.println(conta.getSaldo());
    }
}
