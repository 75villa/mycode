package feb17.assignment;

public class AudioPlayer extends MediaDevice implements Playable {

    String audioSongName;
    String audioSongArtist;

    @Override
    public void displayDetails() {
        super.displayDetails();
    }

    public void audioPlayerDisplayDetails(String audioSongName, String audioSongArtist) {
        System.out.println("Audio Player Display Details...: " + audioSongName + "---" + audioSongArtist);
    }

}

