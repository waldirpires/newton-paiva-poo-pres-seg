package u3.dependência;

public class Impressora {

    public void imprimir(String txt, Papel papel) {
        
        papel.imprimir(txt);
    }
    
    public static void main(String[] args) {
        var i = new Impressora();
        
        var p = new Papel();
        
        i.imprimir("the book is on the table", p);
    }
}
