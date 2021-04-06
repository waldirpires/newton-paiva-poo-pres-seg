package u3.classeabstrata.animais;

public class Casa {

    private AnimalDeEstimacao animal;

    /**
     * @param animal
     */
    public Casa(AnimalDeEstimacao animal) {
        this.animal = animal;
        
        animal.brincar();
        
        animal.serAmigo();
    }

    @Override
    public String toString() {
        return "Casa [animal=" + animal + "]";
    }
}
