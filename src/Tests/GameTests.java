import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * Narrative: As a user, I want to be given a new game of Hangman to play.
 * I want to be shown an empty word and given 10 tries to guess the word using one letter at a time.
 * <p>
 * Scenario 1: correct guess
 * <p>
 * Given that a secret word has been chosen by the game,
 * And that word is X characters long,
 * And the game displays X blank spaces to the user,
 * And the game allows for 10 user guesses,
 * And the user is prompted to guess a letter,
 * <p>
 * When the user enters a letter,
 * And that letter is contained in the secret word,
 * <p>
 * Then the game replaces each blank where the guessed letter is contained,
 * And the user is prompted to guess again.
 * <p>
 * <p>
 * Scenario 2: incorrect guess
 * <p>
 * Given that a secret word has been chosen by the game,
 * And that word is X characters long,
 * And the game displays X blank spaces to the user,
 * And the game allows for 10 user guesses,
 * And the user is prompted to guess a letter,
 * <p>
 * When the user enters a letter,
 * And that letter is NOT contained in the secret word,
 * <p>
 * Then the game displays a message,
 * And lists the letters already guessed,
 * And updates the Hangman image,
 * And prompts the user to guess again.
 */
public class GameTests {

    @Test
    public void gameHasSuccessfullyChosenASecretWord() throws Exception {
        Game.gameChoosesAWord();
        assertTrue(!(Game.gameWord.toString().isEmpty()));
    }

    @Test
    public void gameDisplaysCorrectNumberOfBlankSpacesToUser() throws Exception {
        Game game = new Game();
        Game.gameChoosesAWord();
        for (char c : game.gameWord) {
            game.rightGuesses.add('_');
        }
        assertTrue(game.rightGuesses.size() == game.gameWord.length);
    }

    @Test
    public void gameAllowsOnly10IncorrectGuesses() throws Exception {
        if (Game.counter == 10) {
            Game.gameOver();
        }
    }

}