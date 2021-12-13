import java.util.Scanner;
import java.util.InputMismatchException;

final class Car {

  public int times = 11;

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
      final int checker = Integer.valueOf(carColor);
    } catch (InputMismatchException errorCode) {
      System.out.println("Input the plate number: ");
      final String carPlate = userInput.nextLine();
      Vehicle car1 = new Vehicle(carColor, carPlate, 2);
      Vehicle car2 = new Vehicle();
      System.out.println("Speed of both cars is 0.");
      System.out.println(car1.Accelerate());
      for (int accel = 0; accel < times; accel++) {
        System.out.println(car2.Accelerate());
      }
      System.out.println(car1.Brake());
      System.out.println(car2.Brake());
      String value1 = car1.Value();
      String value2 = car2.Value();
      System.out.println(value1);
      System.out.println(value2);
      System.out.println("\nDone.");
      System.exit(0);
    }
    System.out.println("Car color must be a string.");
    System.exit(0);
  }
}