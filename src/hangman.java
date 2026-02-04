import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class hangman {

    public int lives;
    public int faults;

    String secretWord;
    ArrayList<Character> guessedLetters;

    String[] words = {
            "java",
            "computer",
            "random"
    };

    Random randword = new Random();
    private static  Scanner sc = new Scanner(System.in);
    int choice;

    public hangman(int lives, int faults) {
        this.lives = lives;
        this.faults = faults;


        // pick random word
        secretWord = words[randword.nextInt(words.length)];

        // initialize HashSet
        guessedLetters = new ArrayList<>();
        while (true) {


            displaymenu();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    play();
                    break;
                case 2:
                    rules();
                    break;
                case 3:
                    System.out.println("Exiting goodbye");
                    return;
            }
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

    public void play() {


        System.out.println("The number of letters is :" + secretWord.length());
        //while loop
        while (true) {
            System.out.print("Guess a letter: ");
            String input = sc.nextLine();

            if (input.isEmpty()) {
                System.out.println("Please enter a letter.");
                continue;//to go back to  the start of loop
            }


            char letter = input.charAt(0);
            System.out.println("You guessed: " + letter);
            if (guessedLetters.contains(letter)) {
                System.out.println("You already guessed that letter!");
                continue;
            }

            guessedLetters.add(letter);

            boolean correctGuess = false;

            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == letter) {
                    correctGuess = true;
                }

            }

            if (correctGuess){
                System.out.println("The letter "+ letter +" is correct!!");
            }
            //check if correct guess is right or wrong
            if (!correctGuess){
                System.out.println("The letter "+ letter + " is incorrect");
                faults++;
                lives--;
            }
            new art(faults);

            if (lives ==-1){
                System.out.println("Game over!! The word was " + toString());
                return;
            }
        }//end while loop
    }

    //to test
    public String toString(){
        return secretWord;
    }

}

