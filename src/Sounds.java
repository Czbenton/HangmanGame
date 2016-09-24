import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * A simple Java sound file example (i.e., Java code to play a sound file).
 * AudioStream and AudioPlayer code comes from a javaworld.com example.
 *
 * @author alvin alexander, devdaily.com.
 */
public class Sounds {

    public static void playLoseGameSound() throws Exception {
        // open the sound file as a Java input stream
        String gongFile = "/Users/Zach/tiyworkspace/HangmanGame/loseGame.wav";
        InputStream in = new FileInputStream(gongFile);

        // create an audiostream from the inputstream
        AudioStream audioStream = new AudioStream(in);

        // play the audio clip with the audioplayer class
        AudioPlayer.player.start(audioStream);
    }

    public static void playWinGameSound() throws Exception {
        String gongFile = "/Users/Zach/tiyworkspace/HangmanGame/winGame.wav";
        InputStream in = new FileInputStream(gongFile);
        AudioStream audioStream = new AudioStream(in);
        AudioPlayer.player.start(audioStream);
    }

    public static void playCorrectGuessSound() throws Exception {
        String gongFile = "/Users/Zach/tiyworkspace/HangmanGame/correctGuess.wav";
        InputStream in = new FileInputStream(gongFile);
        AudioStream audioStream = new AudioStream(in);
        AudioPlayer.player.start(audioStream);
    }

    public static void playWrongGuessSound() throws Exception {
        String gongFile = "/Users/Zach/tiyworkspace/HangmanGame/wrongGuess.wav";
        InputStream in = new FileInputStream(gongFile);
        AudioStream audioStream = new AudioStream(in);
        AudioPlayer.player.start(audioStream);
    }

    public static void playOpeningThemeSound() throws Exception {
        String gongFile = "/Users/Zach/tiyworkspace/HangmanGame/OpeningSound.wav";
        InputStream in = new FileInputStream(gongFile);
        AudioStream audioStream = new AudioStream(in);
        AudioPlayer.player.start(audioStream);
    }

}