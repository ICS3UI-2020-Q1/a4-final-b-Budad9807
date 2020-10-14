import java.util.Scanner;
/**
 * Taking a number and taking sum of it
 * @author David
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // make a scanner for user inpit
    Scanner input = new Scanner(System.in);
    // ask the user for a positive integer
    System.out.println("Please enter a positive integer to add the digits of");
   // make a storage for the integer the user entered
    int num = input.nextInt();
    // make num equal to zero
    int total = 0;
    while(num != 0){
      total += num%10;
      // make the calculation for the total
      num = (int)num / 10;
    }
    // make it print out to the screen with the total
    System.out.println("The sum of these digits is" + total);
    
  }
}
