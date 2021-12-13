import java.util.Scanner;
import java.util.InputMismatchException;

final class Car {

  /**
  * Prevent instantiation
  * Throw an exception IllegalStateException.
  * if this ever is called
  *
  * @throws IllegalStateException
  *
  */
  private Car() {
    throw new IllegalStateException("Cannot be initated.");
  }

  /**
  * The starting main() function.
  *
  * @param args Name of file containing a string of numbers
  */
  public static void main(final String[] args) {
    final Scanner userInput = new Scanner(System.in);
    System.out.println("Input the color of the vehicle: ");
    final String carColor = userInput.nextLine();
    try {
      System.out.println("Input the plate number: ");
      final int carPlate = userInput.nextInt();
      newStack.push(input);
    } catch (InputMismatchException errorCode) {
      System.out.println(errorCode);
      System.exit(0);
    }
  }

}