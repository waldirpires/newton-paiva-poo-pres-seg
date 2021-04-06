package u3.interfaces.dragao;

public class Main {

    public static void main(String[] args) {
        var dragao = new Dragao();
        
        dragao.andarNoChao();
        
        dragao.voar();
        
        var castelo = new Castelo();
        
        castelo.entrarPelaJanela(dragao);
        
        castelo.entrarPelaoPorta(dragao);
    }
}
