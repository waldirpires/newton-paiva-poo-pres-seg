package u3.agregacao.ex3;

public class Main {

    public static void main(String[] args) {
        var u = new Universidade("Newton Paiva");
        System.out.println(u);
        
        u.exibirAlunos();
        
        var a1 = new Aluno("José Pereira", "0001-a", "Sistemas de Informação");
        
        var existe = u.buscar(a1.getMatricula());
        System.out.println("\n\n" + existe);
        
        u.adicionarAluno(a1);
        
        u.exibirAlunos();
        
        var a2 = new Aluno("Maria Pereira", "0002-a", "ADS");
        u.removerAluno(a2);
        
        u.exibirAlunos();
        
        u.adicionarAluno(a2);
        
        u.exibirAlunos();
        
        u.removerAluno(a1);
        
        u.exibirAlunos();
    }
}
