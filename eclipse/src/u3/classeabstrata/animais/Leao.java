package u3.classeabstrata.animais;

public class Leao extends Felino{

    public Leao(String imagem, String alimento, boolean comFome, String localização) {
        super(imagem, alimento, comFome, localização);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("RGGHEEGHGHG");        
    }

    @Override
    public void comer() {
        System.out.println("Leão comendo " + getAlimento());        
    }
}
