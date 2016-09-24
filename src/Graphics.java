/**
 * Created by Zach on 9/20/16.
 */
public class Graphics {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void titleScreen() {
        System.out.println(ANSI_BLUE + "__    ______ _    ____ ____ __  __ ____     _____ ____ \n" +
                "\\ \\/\\/ | ===| |__/ (__/ () |  \\/  | ===|   |_   _/ () \\\n" +
                " \\_/\\_/|____|____\\____\\____|_|\\/|_|____|     |_| \\____/\n" + ANSI_RESET);
        System.out.println(Graphics.ANSI_BLUE + "██╗  ██╗ █████╗ ███╗   ██╗ ██████╗ ███╗   ███╗ █████╗ ███╗   ██╗██╗██╗\n" +
                "██║  ██║██╔══██╗████╗  ██║██╔════╝ ████╗ ████║██╔══██╗████╗  ██║██║██║\n" +
                "███████║███████║██╔██╗ ██║██║  ███╗██╔████╔██║███████║██╔██╗ ██║██║██║\n" +
                "██╔══██║██╔══██║██║╚██╗██║██║   ██║██║╚██╔╝██║██╔══██║██║╚██╗██║╚═╝╚═╝\n" +
                "██║  ██║██║  ██║██║ ╚████║╚██████╔╝██║ ╚═╝ ██║██║  ██║██║ ╚████║██╗██╗\n" +
                "╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝ ╚═════╝ ╚═╝     ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝╚═╝\n" +
                "                                                                      \n" + Graphics.ANSI_RESET);
    }

    public static void startScreen() {
        System.out.println("A random word has been chosen for you.\nYou have 10 guesses to figure out the word.\n");
        System.out.println(Graphics.ANSI_RED + "-----------\n" +
                "          |\n" +
                "          |\n" +
                "          |\n" +
                "          |\n" +
                "          |\n" +
                "          |\n" +
                "------------------------\n" + Graphics.ANSI_RESET);
    }

    public static void wrongAnswerGraphics() throws Exception {

        switch (Game.counter) {
            case 1:
                System.out.println(ANSI_RED + "-----------\n" +
                        " |        |\n" +
                        "          |\n" +
                        "          |\n" +
                        "          |\n" +
                        "          |\n" +
                        "          |\n" +
                        "------------------------\n" + ANSI_RESET);
                break;
            case 2:
                System.out.println(ANSI_RED + "-----------\n" +
                        " |        |\n" +
                        " ()       |\n" +
                        "          |\n" +
                        "          |\n" +
                        "          |\n" +
                        "          |\n" +
                        "------------------------\n" + ANSI_RESET);
                break;
            case 3:
                System.out.println(ANSI_RED + "-----------\n" +
                        " |        |\n" +
                        " ()       |\n" +
                        "\\         |\n" +
                        "          |\n" +
                        "          |\n" +
                        "          |\n" +
                        "------------------------\n" + ANSI_RESET);
                break;
            case 4:
                System.out.println(ANSI_RED + "-----------\n" +
                        " |        |\n" +
                        " ()       |\n" +
                        "\\|        |\n" +
                        "          |\n" +
                        "          |\n" +
                        "          |\n" +
                        "------------------------\n" + ANSI_RESET);
                break;
            case 5:
                System.out.println(ANSI_RED + "-----------\n" +
                        " |        |\n" +
                        " ()       |\n" +
                        "\\||       |\n" +
                        "          |\n" +
                        "          |\n" +
                        "          |\n" +
                        "------------------------\n" + ANSI_RESET);
                break;
            case 6:
                System.out.println(ANSI_RED + "-----------\n" +
                        " |        |\n" +
                        " ()       |\n" +
                        "\\||/      |\n" +
                        "          |\n" +
                        "          |\n" +
                        "          |\n" +
                        "------------------------\n" + ANSI_RESET);
                break;
            case 7:
                System.out.println(ANSI_RED + "-----------\n" +
                        " |        |\n" +
                        " ()       |\n" +
                        "\\||/      |\n" +
                        " |        |\n" +
                        "          |\n" +
                        "          |\n" +
                        "------------------------\n" + ANSI_RESET);
                break;
            case 8:
                System.out.println(ANSI_RED + "-----------\n" +
                        " |        |\n" +
                        " ()       |\n" +
                        "\\||/      |\n" +
                        " ||       |\n" +
                        "          |\n" +
                        "          |\n" +
                        "------------------------\n" + ANSI_RESET);
                break;
            case 9:
                System.out.println(ANSI_RED + "-----------\n" +
                        " |        |\n" +
                        " ()       |\n" +
                        "\\||/      |\n" +
                        " ||       |\n" +
                        "/         |\n" +
                        "          |\n" +
                        "------------------------\n" + ANSI_RESET);
                break;
            case 10:
                System.out.println(ANSI_RED + "-----------\n" +
                        " |        |\n" +
                        " ()       |\n" +
                        "\\||/      |\n" +
                        " ||       |\n" +
                        "/  \\      |\n" +
                        "          |\n" +
                        "------------------------\n" + ANSI_RESET);
                break;
            default:
                System.out.println("Counter Error");
        }

    }
}
