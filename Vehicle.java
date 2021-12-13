public class Vehicle {

  /**
  * The placeholder for the plate number.
  */
  private String plateNumber;

  /**
  * The placeholder for the car's color.
  */
  private String carColor;

  /**
  * The placeholder for the car number.
  */
  private int carNum = 0;

  /**
  * The amount of doors the car has.
  */
  private final int doorAmount = 4;

  /**
  * The starting speed of the car.
  */
  private int speed = 0;

  /**
  * The max speed of the car.
  */
  private final int maxSpeed = 100;

  /**
  * The value used for the change in speed during accelerate method.
  */
  private final int speedChange = 10;

  /**
  * The no arguments given vehicle constructor.
  */
  public Vehicle() {
    carColor = "red";
    plateNumber = "12E4S6";
    carNum = 1;
  }

  /**
  * The Vehicle constructor.
  *
  * @param color the parameter used for the car color.
  * @param plate the parameter used for the car plate.
  * @param num the parameter used for the car number
  (how many cars are there).
  */
  public Vehicle(final String color, final String plate, final int num) {
    plateNumber = plate;
    carColor = color;
    carNum = num;
  }

  /**
  * The Accelerate method.
  *
  * @return car speed after accelerating.
  */
  public int accelerate() {
    speed += speedChange;
    if (speed > maxSpeed) {
      return -1;
    } else {
      return speed;
    }
  }

  /**
  * The Brake method.
  *
  * @return car speed after braking.
  */
  public int brake() {
    speed = 0;
    return speed;
  }

  /**
  * The value method.
  *
  * @return the color, plate number, and which car it is.
  */
  public String value() {
    return "For car " + String.valueOf(carNum) + ", car color is "
    + carColor + " and the plate number is " + plateNumber;
  }
}
