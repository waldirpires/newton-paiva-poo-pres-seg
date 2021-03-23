package seg.u3.Atvi2.banco;

import java.util.Scanner;

public class MenuCadastroConta {

    private Banco banco;
    
    public MenuCadastroConta(Banco banco) {
        this.banco = banco;
    }
    
    // MENU 2
    public void exibirMenu() {
        System.out.println("Menu de cadastro de conta:");
        System.out.println("1. cadastro de correntista");
        System.out.println("2. cadastro de conta bancária");
        System.out.println("3. Voltar ao menu anterior");
        System.out.println("\n\nSelecione uma das opções acima:");
    }
    
    public void executar(Banco banco) {
        var scanner = new Scanner(System.in);
        
        int opcao = 0;
        
        while (opcao != 3) {
            exibirMenu();
            
            opcao = scanner.nextInt();
            
            switch(opcao) {
            case 1:
                break;
            case 2: // cadastro da conta
                System.out.println("Digite o nome do banco:");
                var nomeBanco = scanner.nextLine();
                
                System.out.println("Digite o número da agência:");
                var agencia = scanner.nextLine();
                
                System.out.println("Digite o numero da conta:");
                var numero = scanner.nextLine();
                
                var conta = new ContaBancaria(nomeBanco, agencia, numero);
                
                banco.inserirConta(conta);
                
                break;
            case 3:
                break;
            }
        }
        scanner.close();
    }
    
    public static void main(String[] args) {
        var banco = new Banco("Newton");

        var menu = new MenuCadastroConta(banco);
        
        menu.executar(banco);
    }
    
}
