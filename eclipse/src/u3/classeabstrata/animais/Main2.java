package u3.classeabstrata.animais;

public class Main2 {

    public static void main(String[] args) {
        
        //var animal = new Tigre("tigre.jpg", "carne", false, "jaula");
        
        //var animal = new Gato("gato.jpg", "ração", true, "casinha");
        
        var animal = new Canario("canario.jpg", "ração", false, "gaiola");
        
        var casa = new Casa(animal);
        System.out.println(casa);

    }

}
