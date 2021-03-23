package seg.u1.ativ1;

import java.util.Scanner;

public class Menu {

    private Scanner sc = new Scanner(System.in);
    
    public void exibirMenuPrincipal() {
        System.out.println("1. Cadastrar correntista");
        System.out.println("2. Cadastrar conta bancária");
        System.out.println("3. Operar sobre a conta");
        System.out.println("4. Sair");
        
        System.out.println("\n\nEscolha uma das opções acima:\n");
    }
    
    public void exibirMenuDeConta() {
        System.out.println("1. Efetuar saque");
        System.out.println("2. Efetuar depósito");
        System.out.println("3. Exibir saldo em conta");
        System.out.println("4. Exibir extrato em conta");
        System.out.println("5. Efetuar Pagamento");
        System.out.println("6. Transferir entre contas");
        System.out.println("7. Retornar");

        System.out.println("\n\nEscolha uma das opções acima:\n");
    }
    
    public Correntista efetuarCadastroCorrentista() {
        
        sc.nextLine();
        
        System.out.println("Digite o nome do correntista:");
        var nome = sc.nextLine();
        
        System.out.println("Digite o CPF:");
        var cpf = sc.nextLine();
        
        var correntista = new Correntista(nome, cpf);
        
        System.out.println("Correntista criado com sucesso: \n" + correntista);
        
        return correntista;
    }    
    
    public ContaBancaria efetuarCadastroConta(Correntista correntista) {
        sc.nextLine();

        System.out.println("Digite o nome do banco:");
        var banco = sc.nextLine();
        
        System.out.println("Digite o numero da agência:");
        var agencia = sc.nextLine();
        
        var conta = new ContaBancaria(banco, agencia, correntista);
        
        System.out.println("Conta criada com sucesso: \n" + conta);
        
        return conta;
    }
    
    public void iniciarOperacao() {
        int opcao = 0;
        Correntista correntista = null;
        ContaBancaria conta = null;
        
        while (opcao != 4) {
            this.exibirMenuPrincipal();
            
            opcao = sc.nextInt();
            
            switch(opcao) {
            case 1: // cadastro correntista
                correntista = this.efetuarCadastroCorrentista();
                
                break;
            case 2: // cadastro conta
                if (correntista == null) {
                    System.out.println("ALERTA: o correntista deve ser criado antes da conta.");
                } else {
                    conta = this.efetuarCadastroConta(correntista);                    
                }
                break;
            case 3: // operar sobre a conta
                this.operarSobreConta(conta);
                
                break;
            case 4: // encerrar
                System.out.println("Saindo do sistema");
                
                break;
            default:
                System.out.println("ALERTA: operação inválida.\n");                    
            }
        }
        
        sc.close();
    }
    
    public void operarSobreConta(ContaBancaria conta) {
        int opcao = 0;
        
        while (opcao != 7) {
            this.exibirMenuDeConta();
            
            opcao = sc.nextInt();
            
            switch(opcao) {
            case 1: // saque
                System.out.println("Digite o valor a ser sacado:");
                var saque = sc.nextFloat();
                
                conta.efetuarSaque(saque);
                
                break;
            case 2: // deposito
                System.out.println("Digite o valor a ser depositado:");
                var deposito = sc.nextFloat();
                
                conta.efetuarDeposito(deposito);
                
                break;
            case 3: // saldo
                conta.exibirSaldo();
                break;
            case 4: // extrato
                conta.exibirExtrato();
                break;
            case 5: // pagamento
                System.out.println("Digite o valor da conta:");
                var valorConta = sc.nextFloat();
                
                System.out.println("Digite a descrição da conta:");
                var descricao = sc.nextLine();
                
                conta.efetuarPagamento(valorConta, descricao);
                
                break;
            case 6: // transferencia
                break;
            case 7: // sair
                System.out.println("Saindo do menu de conta . . .\n\n");
                break;
            default:
                System.out.println("ALERTA: Operação inválida");
            }
        }
    }
}