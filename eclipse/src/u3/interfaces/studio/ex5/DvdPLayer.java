package u3.interfaces.studio.ex5;

public class DvdPLayer implements Player{

    @Override
    public void play() {
        System.out.println("DVD playing . . .");
    }

    @Override
    public void pause() {
        System.out.println("DVD pausing . . .");
    }

    @Override
    public void reverse() {
        System.out.println("DVD reverse . . .");        
    }

    @Override
    public void stop() {
        System.out.println("DVD stopping . . .");        
    }
}