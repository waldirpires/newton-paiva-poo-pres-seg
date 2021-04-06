package u3.interfaces.dragao;

public class Castelo {

    public void entrarPelaJanela(Passaro p) {
        System.out.println("Entrou pela janela");
        
        p.cantar();
    }
    
    public void entrarPelaoPorta(Lagarto l) {
        System.out.println("Entrou pela porta");
    }
}
