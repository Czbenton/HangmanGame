import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Zach on 9/19/16.
 */
public class AvailableWords {
    private static List<String> wordList = new ArrayList<>();

    public static List readFileToMakeWordList() throws Exception {
        File f = new File("words.txt");
        Scanner fileScanner = new Scanner(f);
        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            String[] columns = line.split(" ");
            for (String s : columns) {
                wordList.add(s.replaceAll("\\s+", "").toLowerCase());
            }
        }
        return wordList;
    }

    public static void makeBlankDisplay() {
        for (char c : Game.gameWord) {
            Game.rightGuesses.add('_');
        }
    }
}
