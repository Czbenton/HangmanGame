import java.util.*;

public class Game {
    public static Scanner scanner = new Scanner(System.in);
    public static char[] gameWord;
    public static List<Character> previousGuesses = new ArrayList<>();
    public static ArrayList<Character> rightGuesses = new ArrayList<Character>();
    public static int counter;

    public static void main(String[] args) throws Exception {
        Sounds.playOpeningThemeSound();
        Graphics.titleScreen();
        Graphics.startScreen();
        gameChoosesAWord();
//        System.out.println(gameWord); //TODO***CHEAT MODE!!***
        Character userGuess = promptPlayerForGuess();
        AvailableWords.makeBlankDisplay();

        while (counter < 10) {
            check_If_User_Guess_Is_Correct_Or_Incorrect_And_Display_Results(userGuess);
            if (counter == 10) {
                gameOver();
            } else {
                userGuess = promptPlayerForGuess();
            }
        }
    }

    public static int randomWord() {
        Random random = new Random(System.currentTimeMillis());
        int index = random.nextInt(354939);
        return index;
    }

    public static char[] gameChoosesAWord() throws Exception {
        gameWord = AvailableWords.readFileToMakeWordList().get(randomWord()).toString().toCharArray();
        return gameWord;
    }

    public static Character promptPlayerForGuess() {
        System.out.println("Please enter your guess.");
        String userInput = scanner.nextLine();
        if (userInput.isEmpty()) {
            System.out.println(Graphics.ANSI_RED + "Invalid guess! Lose a turn" + Graphics.ANSI_RESET);
            userInput = "*";
        }
        Character guess = userInput.charAt(0);
        return guess;
    }

    public static void check_If_User_Guess_Is_Correct_Or_Incorrect_And_Display_Results(Character userGuess) throws Exception {
        if (isUserGuessPresentInGameWord(gameWord, userGuess.toString())) {
            for (int i = 0; i < gameWord.length; i++) {
                if (userGuess.equals(gameWord[i])) {
                    rightGuesses.set(i, userGuess);
                    System.out.println("\nCorrect!!");
                    Sounds.playCorrectGuessSound();
                    System.out.println(rightGuesses + "\n");
                    victoryConditionMet();
                }
            }
        } else {
            previousGuesses.add(userGuess);
            Sounds.playWrongGuessSound();
            System.out.println("\nSorry, try again!");
            System.out.println("So far, you have guessed : " + previousGuesses.toString());
            counter++;
            Graphics.wrongAnswerGraphics();
        }
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

    public static void victoryConditionMet() throws Exception {
        if (!rightGuesses.contains('_')) {
            System.out.println("YOU WIN!!");
            Sounds.playWinGameSound();
            Thread.sleep(5000);
            System.exit(0);
        }
    }

    public static void gameOver() throws Exception {
        System.out.println(Graphics.ANSI_RED + "GAME OVER!!" + Graphics.ANSI_RESET);
        Sounds.playLoseGameSound();
        System.out.println("The word was: " + Graphics.ANSI_BLUE + Arrays.toString(Game.gameWord) + Graphics.ANSI_RESET);
        System.out.println("Thanks for playing.");
    }
}
