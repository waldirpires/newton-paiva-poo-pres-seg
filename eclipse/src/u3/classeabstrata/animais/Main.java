package u3.classeabstrata.animais;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // instanciar um obj a partir da classe
//        var animal = new Animal("animal.jpg", "carne", 0, "selva");
//        System.out.println(animal);
        
        // abstrato
        //var animal = new Felino("felino.jpg", "carne", 0, "zoológico");
        
        var animal = new Leao("leao.jpg", "carne", true, "África");
//        System.out.println(animal);   
        
//        animal.andar();        
//        animal.comer(); 
//        animal.fazerBarulho();
//        animal.dormir();
        
        System.out.println("\n\n");

        var animal2 = new Tigre("tigre.jpg", "osso", false, "Zoológico");
//        System.out.println(animal2);   
        
//        animal2.andar();        
//        animal2.comer();        
//        animal2.fazerBarulho();
//        animal2.dormir();

//        System.out.println("\n\n");

        var animal3 = new Gato("gato.jpg", "ração", false, "casa");
//        System.out.println(animal3);   
        
//        animal3.andar();        
//        animal3.comer();        
//        animal3.fazerBarulho();
//        animal3.dormir();    
        
        var ave = new Canario("canario.jpg", "ração de passaro", false, "gaiola");
        
        var animais = new ArrayList<Animal>();
        animais.add(animal);
        animais.add(animal2);
        animais.add(animal3);
        animais.add(ave);
        
        for (var a: animais) {
            System.out.println("==\n\n");
            System.out.println(a);
            a.andar();
            a.comer();
            a.fazerBarulho();
            a.dormir();
        }
        
        System.out.println("INFO: Todos os animais impressos com sucesso.");
        
    }

}
