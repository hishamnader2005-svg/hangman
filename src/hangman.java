import java.util.Scanner;
import java.util.HashSet;
import java.util.Random;

public class hangman {

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
    private static Scanner sc = new Scanner(System.in);
    int choice;

    public hangman(int lives, int faults) {
        this.lives = lives;
        this.faults = faults;

        // pick random word
        secretWord = words[randword.nextInt(words.length)];

        // initialize HashSet
        guessedLetters = new HashSet<>();

        displaymenu();
        choice = sc.nextInt();
        switch (choice){
            case 1 :
                play();
                break;
            case 2 :
                rules();
                break;
            case 3 :
                System.out.println("Exiting goodbye");
                return;
        }
    }

    public void displaymenu(){
        System.out.println("Welcome to Hangman ");
        System.out.println("Choose your options : ");
        System.out.println("1.Play");
        System.out.println("2.Rules");
        System.out.println("3.Exit");
    }


    public void rules(){
        System.out.println("Welcome to Hangman!");
        System.out.println("-------------------");
        System.out.println("Rules:");
        System.out.println("1. You have to guess the secret word, one letter at a time.");
        System.out.println("2. You have a limited number of lives. Each wrong guess costs 1 life.");
        System.out.println("3. If you guess a letter correctly, it will be revealed in the word.");
        System.out.println("4. You cannot guess the same letter twice.");
        System.out.println("5. Win by guessing all letters before you run out of lives.");
        System.out.println("6. Lose if your lives reach 0 before completing the word.");
        System.out.println("-------------------");
        System.out.println("Good luck!\n");

    }
    //to test
    public String toString(){
        return secretWord;
    }

}

