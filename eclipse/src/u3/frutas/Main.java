package seg.u3.frutas;

public class Main {

    public static void main(String[] args) {

        var maca = new Maca();
        var banana = new Banana();
        
        Fruta fruta = maca;
        Fruta fruta2 = banana;
        
        maca = banana;
        
        Maca maca = fruta;
        
        var alface = new Alface();
        
        Fruta fruta3 = alface;
    }
}
