package u3.interfaces.studio.ex5;

import utils.JOptionPaneUtil;

public class Main {

    public static void main(String[] args) {

        var dvdPlayer = new DvdPLayer();
        var mp3Player = new Mp3Player();
        var mp3Recorder = new Mp3Recorder();

        var studio = new Studio();

        // studio dvd
        studio.play(dvdPlayer);
        
        // studio mp3
        studio.play(mp3Player);
        
        // studio recorder
        studio.record(mp3Recorder);
        
        // studio recorder somente para play
        studio.play(mp3Recorder);
        
    }
}
