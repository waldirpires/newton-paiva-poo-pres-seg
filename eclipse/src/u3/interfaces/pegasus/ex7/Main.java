package u3.interfaces.pegasus.ex7;

public class Main {

    public static void main(String[] args) {
        var pegasus = new Pegasus("branco");
        System.out.println(pegasus);
        
        pegasus.correr();
        
        pegasus.voar();
        
        pegasus.fazerBarulho();
    }
}
