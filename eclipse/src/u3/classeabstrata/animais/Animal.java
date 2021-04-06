package u3.classeabstrata.animais;

public abstract class Animal {
    
    private String imagem;
    private String alimento;
    private boolean comFome;
    private String localização;
    
    public Animal(String imagem, String alimento, boolean comFome, String localização) {
        this.imagem = imagem;
        this.alimento = alimento;
        this.comFome = comFome;
        this.localização = localização;
    }

    @Override
    public String toString() {
        return "Animal [imagem=" + imagem + ", alimento=" + alimento + ", comFome=" + comFome + ", localização="
                + localização + "]";
    }

    public final void dormir() {
        System.out.println("Animal dormindo . . . ZZZZZ");
    }
    
    public abstract void fazerBarulho();
    
    public abstract void comer();
    
    public abstract void andar();

    public String getImagem() {
        return imagem;
    }

    public String getAlimento() {
        return alimento;
    }

    public boolean isComFome() {
        return comFome;
    }

    public String getLocalização() {
        return localização;
    }    
}
