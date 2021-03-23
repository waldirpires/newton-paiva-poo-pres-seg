package u2.floresta;

public class Main {

    public static void main(String[] args) {

        var arvore = new Arvore("Jatobá", 15.5f);
        var arvore2 = new Arvore("Jatobá", 15.5f);
        
        System.out.println("\n");
        System.out.println(arvore);
        System.out.println("\n");
        System.out.println(arvore2);
        
        System.out.println(arvore.equals(arvore2));
    }

}
