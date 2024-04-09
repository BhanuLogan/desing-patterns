package patterns.adapter;

import commons.DesignPatternService;
import patterns.adapter.service.AudioPlayer;
import patterns.adapter.service.MediaAdapter;
import patterns.adapter.service.MediaPlayer;
import util.Constants.MediaType;

public class AdapterPatternService implements DesignPatternService {

    @Override
    public void runExample() {
        testAdapterPattern();
    }

    private void testAdapterPattern() {
        System.out.println("\n\n-------------------------------------------------");
        System.out.println("ADAPTER DESIGN PATTERN");
        System.out.println("-------------------------------------------------");

        MediaPlayer player = new AudioPlayer();
        player.play("rrr.mp3");

        MediaPlayer mp3Player = new MediaAdapter(MediaType.MP3);
        MediaPlayer mp4Player = new MediaAdapter(MediaType.MP4);
        MediaPlayer mkvPlayer = new MediaAdapter(MediaType.MKV);

        mp3Player.play("pushpa.mp3");
        mp4Player.play("arya.mp4");
        mkvPlayer.play("arya-2.mkv");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------\n\n");
    }

}
