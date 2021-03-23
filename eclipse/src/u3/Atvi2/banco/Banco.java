package seg.u3.Atvi2.banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<ContaBancaria> contas;
    
    public Banco(String nome) {
        this.nome = nome;
        // lista de contas
        this.contas = new ArrayList<ContaBancaria>();
    }
    
    public ContaBancaria pesquisar(String numero) {
        // laço simples
        for (int i = 0; i < contas.size(); i++) {
            var conta = contas.get(i);
            
            if (conta.getNumero().equals(numero)) {
                return conta;
            }
        }
        
        // for avançado (Java 8)
//        for (var conta: contas) {
//            if (conta.getNumero() == numero) {
//                return conta;
//            }
//        }        
        
        return null; // conta não existe        
    }
    
    public void encerrarConta(String numero) {
        // procura a conta
        var conta1 = pesquisar(numero);

        if (conta1 == null) {
            System.out.println("ALERTA: conta inexistente.");
            
            return;
        }
        
        // realiza a remoção da conta bancaria do banco
        this.contas.remove(conta1);        
    }
    
    public void transferir(String origem, String destino, float valor, String descricao) {
        // buscar a conta de origem
        var conta1 = pesquisar(origem);
        // buscar a conte destino
        var conta2 = pesquisar(destino);
        
        if (conta1 == null || conta2 == null) {
            System.out.println("ERRO: contas inválidas ou inexistentes.");

            return;
        }
        // transferir o valor da origem para o destino
        conta1.efetuarSaque(valor);
        
        conta2.efetuarDeposito(valor);        
    }
    
    public boolean inserirConta(ContaBancaria conta) {
        // adicao da conta no banco
        this.contas.add(conta);
        
        return true;
    }
}
