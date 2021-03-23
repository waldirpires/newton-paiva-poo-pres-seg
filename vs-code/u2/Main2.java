import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        System.out.println("Tamanho: " + Arvore.getQuantidade());
        // System: classe
        // out: objeto acessado via variável estático
        // println: método dinâmico
    }

    public static void main2(String[] args) {

        System.out.println("Tamanho: " + Arvore.getQuantidade());

        var scanner = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        var nome = scanner.nextLine();

        System.out.println("Digite a altura: ");
        var altura = scanner.nextFloat();

        var arvore1 = new Arvore(nome, altura);

        // arvore1.setNome("Jatobá");
        // arvore1.setAltura(15.0f);
        System.out.println(arvore1); // toString - converte objeto para String

        scanner.nextLine();

        System.out.println("Digite o nome: ");
        nome = scanner.nextLine();

        System.out.println("Digite a altura: ");
        altura = scanner.nextFloat();

        var arvore2 = new Arvore(nome, altura);

        // arvore2.setNome("Palmeira");
        // arvore2.setAltura(5.0f);
        System.out.println(arvore2);
        System.out.println("Tamanho: " + Arvore.getQuantidade());

        scanner.close();

        if (arvore1.getNome() == arvore2.getNome()) {
            System.out.println("As duas árvores são iguais.");
        } else {
            System.out.println("As duas árvores NÃO são iguais.");
        }

        arvore1.balancar();

        arvore2.balancar();

        arvore1.cortar();
        System.out.println(arvore1);

        arvore2.cortar();
        System.out.println(arvore2);
    }
}
