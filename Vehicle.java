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
  */
  public String accelerate() {
    speed += 10;
    if (speed > maxSpeed) {
      return "Car speed cannot be higher than 100km/h";
    } else {
      return "Car speed for car " + String.valueOf(carNum)
      + " is now " + String.valueOf(speed);
    }
  }

  /**
  * The Brake method.
  */
  public String brake() {
    speed = 0;
    return "Speed of car " + String.valueOf(carNum)
    + " is " + String.valueOf(speed) + " after braking.";
  }

  /**
  * The value method.
  */
  public String value() {
    return "For car " + String.valueOf(carNum) + ", car color is "
    + carColor + " and the plate number is " + plateNumber;
  }
}
