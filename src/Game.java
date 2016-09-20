import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static Scanner scanner = new Scanner(System.in);
    public static char[] gameWord;
    public static ArrayList<Character> rightGuesses = new ArrayList<Character>();


    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Hangman!");
        System.out.println("A random 7 letter word has been chosen for you.\nYou have 10 guesses to figure out the word.\n");

        gameChoosesAWord();

        System.out.println(gameWord);

        Character userGuess = promptPlayerForGuess();

        boolean b = userGuess == gameWord[0];
        for (char c : gameWord) {
            rightGuesses.add('_');
        }

        int counter = 0;
        while (counter < 10) {
            if (isUserGuessPresentInGameWord(gameWord, userGuess.toString())) {
                for (int i = 0; i < gameWord.length; i++) {
                    if (userGuess.equals(gameWord[i])) {
                        rightGuesses.set(i, userGuess);
                        System.out.println(rightGuesses);
                    }
                }
            } else {
                System.out.println("sorry, wrong!");
                counter++;
                System.out.println(counter);
            }
            userGuess = promptPlayerForGuess();
        }
    }

    public static int randomWord() {
        Random random = new Random(System.currentTimeMillis());
        int index = random.nextInt(12);
//    int index = random.nextInt(32909);
        return index;
    }

    public static char[] gameChoosesAWord() {
        gameWord = AvailableWords.populateWordListArray().get(randomWord()).toString().toCharArray();
//        gameWord = AvailableWords.readFileToMakeWordList().get(randomWord()).toString();
        return gameWord;
    }

    public static Character promptPlayerForGuess() {
        System.out.println("Please enter your guess.");
        String userInput = scanner.nextLine();
        Character guess = userInput.charAt(0);
        return guess;
    }

    public static boolean isUserGuessPresentInGameWord(char[] gameWord, String userGuess) {
        boolean bool = false;
        for (int i = 0; i < gameWord.length; i++) {
            if (userGuess.charAt(0) == (gameWord[i])) {
                bool = true;
            }
        }
        return bool;
    }
}
