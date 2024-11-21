import java.util.Scanner;

public class Main {

   public static void main(String []args) {

      // FOR LOOPS  are "shortcuts" for looping when you know many times the loop should run
      // all loop CONTORL infor is in the header
      for (int i  = 0; i < 13; i++) {
         // LOOP BODY  (process to be repeated)
         System.out.println("For loop, i = " + i);
      }

      //You can change the cariable by anyting!
      // What does this loop do? -> counting even numbers
      //
      for (int i = 8; i<= 22; i+=2) {
         System.out.println("For loop 2, i = " + i);
      }

      // BACKWARDS Looping 
      // you must change all 3 loop contorl parts!1
      for (int i = 12; i >= 1; i--) {
         System.out.println(i + "bottles of coke on the wall");
         System.out.println(i + "bottles of coke");
         System.out.println("Take one down, pass it around");
         System.out.println((i - 1) + "bottles of coke on the wall!");
         // Check if on the last bottle (final iteration)
         if (i == 1) {
            System.out.println("They are all gone ....");
         }
      }
      












      //guessing game
      Scanner scan = new Scanner(System.in);
      // Choose a random number from 0-100
      int num = (int) (Math.random() * 100); 
      // Ask the user to guess a number from 0 to 100
      System.out.println("Guess a number from 0-100: ");
      // Get the first guess using scan.nextInt();
      int guess = scan.nextInt();
      //Example of a SENTENEL while loop (like a "flag" to stop looping)
      // Loop while the guess does not equal the random number,
      while (guess != num) {
         // If the guess is less than the random number, print out "Too low!"
         if (guess < num) {
            System.out.println("Too Low!");
         }
         // If the guess is greater than the random number, print out "Too high!"
         else if (guess > num) {
            System.out.println("Too High!");
         }
         // Get a new guess (save it into the same variable)
         System.out.println("Guess again: ");
         guess = scan.nextInt(); // LOOP CHANGE
      }

      // Print out something like "You got it!"
      // AFTER LOOP ENDS (meaning guess == num)
      System.out.println("You got it!");

      // THREE STEPS TO WRITE A LOOP
      //1. Initalize the LOOP CONTROL variable
      int count = 1;
      // 2. Test the CONDITION in the loop header 
      while (count <= 10) {
         //Execute statments in teh loop body
         System.out.println(count);
         // 3. CHANGE your loop control variable
         count++; // equivalent to count = count + 1;
      }
   }
}
