package u3.interfaces.studio.ex5;

public class Mp3Recorder extends Mp3Player implements Recorder{

    @Override
    public void record() {
        System.out.println("MP3 recording . . .");        
    }
}