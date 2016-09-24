import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Zach on 9/24/16.
 */
public class AvailableWordsTest {
    @Test
    public void readFileSuccess() throws Exception {
        assertTrue(AvailableWords.readFileToMakeWordList() != null);
    }

    @Test
    public void blankDisplaySuccess() throws Exception {
        Game.gameChoosesAWord();
        AvailableWords.makeBlankDisplay();

        assertTrue(Game.rightGuesses.size() == Game.gameWord.length);
    }
}
