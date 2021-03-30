package u3.agregacao.ex3;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private String nome;
    
    private List<Aluno> alunos; // 1-n

    /**
     * @param nome
     */
    public Universidade(String nome) {
        this.nome = nome;
        
        this.alunos = new ArrayList<>();
    }
    
    public Aluno buscar(String matricula) {
//        for (int i = 0; i < alunos.size(); i++) {
//            var aluno = alunos.get(i);
//            if (aluno.getMatricula().equals(matricula)) {
//                return aluno;
//            }
//        }
        
        for (var aluno: alunos) { // for avançado
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        
        return null;// aluno não existe 
    }
    
    public void exibirAlunos() {
        System.out.println("\nListando alunos:\n\n");
        for (var aluno: alunos) { // for avançado
            System.out.println(aluno);
        }
    }
    
    public void adicionarAluno(Aluno a) {
        // procurar para ver se ele exisite
        var existe = buscar(a.getMatricula());
        if (existe != null) {
            System.out.println("ALERTA: o aluno já existe: " + a.getMatricula());
            return;
        }
        
        this.alunos.add(a); // adicionando o aluno na universidade
        System.out.println("INFO: Aluno matriculado com sucesso: " + a.getMatricula());
    }
    
    public void removerAluno(Aluno a) {
        // verificar se ele existe para remocao
        var existe = buscar(a.getMatricula());
        if (existe == null) {
            System.out.println("ALERTA: o aluno solicitado para remoção não existe: " + a.getMatricula());
            return;
        }
        
        this.alunos.remove(a); // retirando o aluno da lista
        System.out.println("IFO: aluno removido com sucesso - " + a.getMatricula());
    }

    @Override
    public String toString() {
        return "Universidade [nome=" + nome + "]";
    }    
    
    
    
}
