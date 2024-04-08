package patterns.adapter.service;

// read-mode
public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String filename) {
        System.out.println("Playing audio: " + filename);
    }
}
