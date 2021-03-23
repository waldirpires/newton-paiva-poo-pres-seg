package seg.u3.Atvi2.banco;

import java.util.Scanner;

public class MenuContaBancaria {

    public void exibirMenu() {
        System.out.println("Menu de conta:");
        System.out.println("1. Exibir saldo");
        System.out.println("2. Exibir extrato");
        System.out.println("3. Efetuar Saque");
        System.out.println("4. Efetuar depósito");
        System.out.println("5. Pagar conta");
        System.out.println("6. Voltar ao menu anterio");
        System.out.println("\nEscolha uma das operações acima:\n");
    }

    public void executar(ContaBancaria conta) {
        var scanner = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 6) {
            exibirMenu();

            opcao = scanner.nextInt();

            switch (opcao) {
            case 1: // saldo
                System.out.println("Saldo: " + conta.getSaldo());
                break;
            case 2: // extrato
                break;
            case 3: // saque
                System.out.println("Digite o valor a sacar:");
                float saque = scanner.nextFloat();

                conta.efetuarSaque(saque);

                break;
            case 4: // deposito
                System.out.println("Digite o valor a depositar:");
                float deposito = scanner.nextFloat();

                conta.efetuarDeposito(deposito);

                break;
            case 5: // pagamento
                break;
            case 6:
                System.out.println("Saindo do menu de conta");
                break;
            default:
                System.out.println("ALERTA: operação inválida.");
            }
        }
        
        scanner.close();
    }
}
