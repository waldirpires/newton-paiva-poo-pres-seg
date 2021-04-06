package u3.classeabstrata.animais;

public abstract class Felino extends Animal{

    public Felino(String imagem, String alimento, boolean comFome, String localização) {
        super(imagem, alimento, comFome, localização);
    }

    @Override
    public void andar() {
        System.out.println("Felino andando devagarinho na " + getLocalização());
    }

}
