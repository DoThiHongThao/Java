package music;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class KeyMap {

    private char keyCode;
    private String song;
    private Clip clip;

    // Don't allow default constructor
    @SuppressWarnings("unused")
	private KeyMap() {
    }

    public KeyMap(char keyCode, String song) throws LineUnavailableException {
        this.keyCode = keyCode;
        this.song = song;

        // Create an audiostream from the inputstream
        clip = AudioSystem.getClip();
    }

    public boolean match(char key) {
        return key == keyCode;
    }

    // Play a sound using javax.sound and Clip interface
    public String play() {
        try {
            // Open a sound file stored in the project folder
            clip.open(AudioSystem.getAudioInputStream(new File(song + ".mp3")));

            // Play the audio clip with the audioplayer class
            clip.start();

            // Create a sleep time of 2 seconds to prevent any action from occuring for the first
            // 2 seconds of the sound playing
            Thread.sleep(2000);

        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException | InterruptedException e) {
            System.out.println("Things did not go well");
            System.exit(-1);
        }
        return song;
    }

    // Stop a sound from playing and clear out the line to play another sound if need be.
    public void stop() {
        // clip.stop() will only pause the sound and still leave the sound in the line
        // waiting to be continued. It does not actually clear the line so a new action could be performed.
        clip.stop();

        // clip.close(); will clear out the line and allow a new sound to play. clip.flush() was not 
        // used because it can only flush out a line of data already performed.
        clip.close();
    }
}