package u3.classeabstrata.animais;

public class Canario extends Ave implements AnimalDeEstimacao{

    public Canario(String imagem, String alimento, boolean comFome, String localização) {
        super(imagem, alimento, comFome, localização);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Canarinho cantando ");        
    }

    @Override
    public void andar() {
        System.out.println("Canarinho voando pelo " + getLocalização());
    }

    @Override
    public void brincar() {
        System.out.println("Canario cantando para o dono");
    }

    @Override
    public void serAmigo() {
        System.out.println("Canario preso na gaiola . . .");
    }
}
