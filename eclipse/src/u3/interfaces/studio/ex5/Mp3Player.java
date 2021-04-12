package u3.interfaces.studio.ex5;

public class Mp3Player implements Player{

    @Override
    public void play() {
        System.out.println("MP3 playing . . .");        
    }

    @Override
    public void pause() {
        System.out.println("MP3 pausing . . .");        
    }

    @Override
    public void reverse() {
        System.out.println("MP3 reverse . . .");                
    }

    @Override
    public void stop() {
        System.out.println("MP3 stopping . . .");                
    }
}