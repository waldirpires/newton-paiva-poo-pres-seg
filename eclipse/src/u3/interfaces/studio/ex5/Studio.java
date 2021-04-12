package u3.interfaces.studio.ex5;

public class Studio {

    public void play(Player p) {
        
        System.out.println("Studio starts playing . . .");
        
        p.play();
        p.pause();
        p.reverse();
        p.stop();        
    }
    
    public void record(Recorder r) {
        System.out.println("Studio starts recording . . .");

        r.record();

        r.stop();        

        r.play();
        r.pause();
        r.reverse();
        r.stop();        
    }
}
