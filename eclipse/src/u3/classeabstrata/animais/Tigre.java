package u3.classeabstrata.animais;

public class Tigre extends Felino{

    public Tigre(String imagem, String alimento, boolean comFome, String localização) {
        super(imagem, alimento, comFome, localização);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Tigre rosnando . . . RGSHRGRGRGR");
    }

    @Override
    public void comer() {
        System.out.println("Tigre comendo " + getAlimento());
    }
}