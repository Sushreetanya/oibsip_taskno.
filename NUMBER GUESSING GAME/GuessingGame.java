import java.util.Scanner; 

public class GuessingGame {
     
        public static void main(String[] args) 
       {
           System.out.println("____________Let's Play a Game!!!______________");
           System.out.println();
           System.out.println("x:-----------------|||GUESSING THE NUMBER GAME|||------------------");
           System.out.println();
           System.out.println("I'll pick a number between 1 and 100, and you try to guess it.");
           System.out.println("x:You have only 6 trails!!!!!");
           Scanner sc = new Scanner(System.in); 
           boolean playAgain;
           do {
              playGame(); 
              System.out.println("Would you like to play again?Y/N");
              playAgain = sc.nextBoolean();  
              } while (playAgain);
          System.out.println("Thanks for playing.Goodbye!!!");
        }         
        
        static void playGame() {
            int RandomNumber; 
            int PlayersGuess;      
            int guessCount;      
            RandomNumber = (int)(100 * Math.random()) + 1;
            guessCount = 0;
            System.out.println();
            System.out.println("Guess the 1st no.:");
            Scanner sc= new Scanner(System.in);   
            while (true) {
               PlayersGuess = sc.nextInt();  
               guessCount++;
               if (PlayersGuess == RandomNumber) {
                  System.out.println(" Congo!!You have got it right at " + guessCount
                          + " guesses!! My number was " + RandomNumber);
                  break;  
               }
               if (guessCount == 6) {
                  System.out.println("Oops!!You didn't get the number in 6 guesses.");
                  System.out.println("You lose.Your Trial is OVER.SORRY!!But My number was " + RandomNumber);
                  break;  
               }
               if (PlayersGuess < RandomNumber)
                  System.out.println("That's too low!!Guess again:");
               else if (PlayersGuess > RandomNumber)
                  System.out.println("That's too high!!Guess again:");
            }
            System.out.println();
        } 
                    
     } 
