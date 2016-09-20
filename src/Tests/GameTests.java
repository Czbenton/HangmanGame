import org.junit.Test;

/**
 * Narrative: As a user, I want to be given a new game of Hangman to play.
 * I want to be shown an empty word and given 10 tries to guess the word using one letter at a time.
 *
 * Scenario 1: correct guess
 *
 * Given that a secret word has been chosen by the game,
 * And that word is 7 characters long,
 * And the game displays 7 blank spaces to the user,
 * And the game allows for 10 user guesses,
 * And the user is prompted to guess a letter,
 *
 * When the user enters a letter,
 * And that letter is contained in the secret word,
 *
 * Then the game replaces each blank where the guessed letter is contained,
 * And the user is prompted to guess again.
 *
 *
 * Scenario 2: incorrect guess
 *
 * Given that a secret word has been chosen by the game,
 * And that word is 7 characters long,
 * And the game displays 7 blank spaces to the user,
 * And the game allows for 10 user guesses,
 * And the user is prompted to guess a letter,
 *
 * When the user enters a letter,
 * And that letter is NOT contained in the secret word,
 *
 * Then the game displays a message,
 * And lists the letters already guessed,
 * And updates the Hangman image,
 * And prompts the user to guess again.
 */
public class GameTests {
@Test
public void method(){
    AvailableWords.populateWordListArray();
}


}