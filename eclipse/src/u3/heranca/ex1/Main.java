package u3.heranca.ex1;

public class Main {

    public static void main(String[] args) {
        var correntista = new Correntista("José Pereira", "Belo Horizonte", "55.31.991234567");
        System.out.println(correntista);
        System.out.println("Taxa: " + correntista.obterTaxa() + "\n\n");
        
        var pf = new PessoaFisica("Maria das Dores", "Contagem", "5531987654321", "123.456.789-01");
        System.out.println(pf);
        System.out.println("Taxa: " + pf.obterTaxa() + "\n\n");
        
        var pj = new PessoaJuridica("Barraca do Seu Zé Ltda", "Betim", null, "345.467.78/0001-32");
        System.out.println(pj);
        System.out.println("Taxa: " + pj.obterTaxa() + "\n\n");
    }

}
