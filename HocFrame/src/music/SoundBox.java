package music;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author Andrew Peturis, Chaselyn Langley
 *
 */
public class SoundBox {

    static Scanner scanner = new Scanner(System.in);   //Scanner object to read user input
    InputStream input;

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException, LineUnavailableException {

        String line;
        Character firstChar;
        String predator = "predator";
        String explosion = "explosion";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        KeyMap[] keyedSongs = {
            new KeyMap('a', predator),};

        while (true) {
            line = br.readLine();
            firstChar = line.charAt(0);

            for (int i = 0; i < keyedSongs.length; i++) {
                if (keyedSongs[i].match(firstChar)) {

                    // Notice now by running the code, after the first second of sleep time the sound can
                    // and another sound can be played in its place
                    keyedSongs[i].stop();
                    System.out.println("Played the sound: " + keyedSongs[i].play());
                    break;
                }
            }

            if (firstChar == 'q') {
                break;
            }
        }
    }
}