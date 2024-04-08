package patterns.adapter.service;

import util.Constants.MediaType;

public class MediaAdapter implements MediaPlayer {

    private MediaType mediaType;
    private AudioPlayer player;

    public MediaAdapter(MediaType mediaType) {
        this.mediaType = mediaType;
        this.player = new AudioPlayer();
    }
    
    @Override
    public void play(String filename) {
        System.out.println();
        String file = "";
        switch (mediaType) {
            case MP3 -> {
                file = filename;
                System.out.println("Default player");
                break;
            }
            case MP4 -> {
                file = filename.substring(0, filename.indexOf(".")) + ".mp3";
                System.out.println("converting " + filename + " to " + file);
                break;
            }
            case MKV -> {
                file = filename.substring(0, filename.indexOf(".")) + ".mp3";
                System.out.println("converting " + filename + " to " + file);
                break;
            }
            default -> {
                System.out.println("Unsupported file");
                return ;
            }
        }
        player.play(file);
        System.out.println();
    }

}
