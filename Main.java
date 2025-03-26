import java.util.Random;
import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    enum choice {Rock, Paper, scissors}

    Scanner scanner = new Scanner(System.in);  // Create a Scanner object
    Random random = new Random();
    System.out.print("Enter Rock, Papper, or Scissors");
    String userInput = scanner.nextLine().toUpperCase();  // Read user input

    Choice userChoice = Choice.valueOf(userInput);

    int computerChoice = Choice.values()[random.nextInt(3)];

    if(userChoice == computerChoice){
        System.out.println("It's a tie!");
    }else if ((userChoice == Choice.Rock && computerChoice == Choice.Scissors) 
              (userChoice == Choice.Papper && computerChoice == Choice.Rock)
              (userChoice == Choice.Scissors && computerChoice == Choice.Papper)) {
                System.out.println("You win!")
              }
    else {
        System.out.println("You lose!");
    }
    
  
  }
}