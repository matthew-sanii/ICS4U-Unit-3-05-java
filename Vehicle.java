public class Vehicle {

  private String plateNumber = "0";

  private String carColor = "";

  private int carNum = 0;

  private static int doorAmount = 4;

  private int speed = 0;

  private static int maxSpeed = 100;

  public Vehicle() {
    carColor = "red";
    plateNumber = "12E4S6";
    carNum = 1;
  }

  public Vehicle(String color, String plate, int num) {
    plateNumber = plate;
    carColor = color;
    carNum = num;
  }

  public String Accelerate() {
    speed += 10;
    if (speed > maxSpeed) {
      return "Car speed cannot be higher than 100km/h";
    } else {
      return "Car speed for car " + String.valueOf(carNum) + " is now " + String.valueOf(speed);
    }
  }

  public String Brake() {
    speed = 0;
    return "Speed of car " + String.valueOf(carNum) + " is " + String.valueOf(speed) + " after braking.";
  }

  public String Value() {
    return "For car " + String.valueOf(carNum) + ", car color is " + carColor + " and the plate number is " + plateNumber;
  }
}