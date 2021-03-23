package seg.u1.ativ2;

import java.util.ArrayList;
import java.util.List;

import seg.u1.ativ1.ContaBancaria;

public class Banco {

    private String banco;
    
    private List<ContaBancaria> contas = new ArrayList<>();

    /**
     * @param banco
     */
    public Banco(String banco) {
        this.banco = banco;
    }
    
    public ContaBancaria pesquisarPorConta(String numero) {
        
        // iterando sobre as contas, laço de repetição
        for (ContaBancaria conta: contas) {
            if (conta.getNumero().equals(numero)) {
                return conta;
            }
        }
        
        return null; // conta não encontrada        
    }
    
    public boolean inserirNovaConta() {
        // adicionar a conta na lista
    }
    
    public boolean atualizarConta() {
        // pesquisar pela conta
        // sobrescreve ela com os atributos atualizados
    }
    
    public boolean encerrarConta(String numero) {
        // pesquisa
        // remove a conta da lista
        contas.remove(conta);
    }
    
    public void exibirRelatorioContas() {
        for (ContaBancaria conta: contas) {
            System.out.println(conta);
        }
    }
}
