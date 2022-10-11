import java.util.Random;
import java.util.Scanner;

class GuessTheNumber {

    int theNumber;
    int max;

    Scanner scan = new Scanner(System.in);

    // constructor to create an instance of the class with a number and max values
    public GuessTheNumber() {
        Random random = new Random();
        max = 100;
        // modulo: the remainder after you subtract the max until you can't subtract it
        // anymore will
        // give a number less than the max. Add 1 to include the max value so 100 is a
        // possible outcome
        theNumber = Math.abs(random.nextInt()) % (max + 1);
    }

    public void play() {
        while(true) {
            int move = scan.nextInt();
            if (move > theNumber) {
                System.out.println("The number is too big");
            } else if (move < theNumber) {
                System.out.println("The number is too small");
            } else {
                System.out.println("YOU'VE GOT IT :D");
                // exit loop when the guess matches the number
                break;
            }
        }   
    }

    public static void main(String[] args) {
        GuessTheNumber guess = new GuessTheNumber();
        System.out.println("Welcome to Guess the Number!"
        + " It's a number between 0 and " + guess.max + " inclusive."
        + " Enter a number to get started: ");
        guess.play();
    }

}
