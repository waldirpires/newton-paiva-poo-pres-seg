package u3.interfaces.dragao;

public class Dragao implements Passaro, Lagarto{

    @Override
    public void andarNoChao() {
        System.out.println("Dragao andando no chão");
        
    }

    @Override
    public void voar() {
        System.out.println("Dragao agora voando");        
    }
    
    public void cuspirFogo() {
        System.out.println("FOGO!!!!");
    }
    
    @Override
    public void cantar() {
        System.out.println("dragao cantando!!!");
    }
}
