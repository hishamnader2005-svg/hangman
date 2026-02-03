import java.util.Scanner;
import java.util.HashSet;
import java.util.Random;

public class Hangman {

    public int lives;
    public int faults;

    String secretWord;
    HashSet<Character> guessedLetters;

    String[] words = {
            "java",
            "computer",
            "random"
    };

    Random randword = new Random();

    public Hangman(int lives, int faults) {
        this.lives = lives;
        this.faults = faults;

        // pick random word
        secretWord = words[randword.nextInt(words.length)];

        // initialize HashSet
        guessedLetters = new HashSet<>();
    }
}
