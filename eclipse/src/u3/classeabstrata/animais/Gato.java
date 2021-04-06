package u3.classeabstrata.animais;

public class Gato extends Felino implements AnimalDeEstimacao{

    public Gato(String imagem, String alimento, boolean comFome, String localização) {
        super(imagem, alimento, comFome, localização);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Gato fazendo miau . . .");
    }

    @Override
    public void comer() {
        System.out.println("Gato comendo sua " + getAlimento());        
    }

    @Override
    public void brincar() {
        System.out.println("Gato brincando de bola . . .");        
    }

    @Override
    public void serAmigo() {
        System.out.println("Gato gosta de ser humano");        
    }

}
