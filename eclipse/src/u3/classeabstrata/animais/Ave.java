package u3.classeabstrata.animais;

public abstract class Ave extends Animal{

    public Ave(String imagem, String alimento, boolean comFome, String localização) {
        super(imagem, alimento, comFome, localização);
    }

    @Override
    public void comer() {
        System.out.println("Ave comendo " + getAlimento() + " com o bico.");        
    }
}
