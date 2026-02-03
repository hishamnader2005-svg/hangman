import java.util.Scanner;
import java.util.HashSet;
import java.util.Random;


public class hangman {
    public int lives;
    public int  faults;
    HashSet<String> word ;
    String[] words = {
        "java",
        "computer",
        "random",
    };
    Random randword = new Random();
    public hangman(int lives , int faults ){
        this.lives = lives;
        this.faults = faults;

    }
}
