public class Vehicle {

  private int plateNumber = 0;

  private String carColor = "";

  private static int doorAmount = 4;

  private int speed = 0;

  private static int maxSpeed = 100;

  public Vehicle(String plateNum, String color) {
    carColor = color;
    plateNumber = plateNum;
  }

  public Vehicle() {
    carColor = "red";
    plateNumber = "12E4S6";
  }

  public int Accelerate() {
    speed += 10;
    if (speed >= maxSpeed) {
      return -1;
    } else {
      return speed;
    }
  }

  public void Brake() {
    speed = 0;
    System.out.print("Speed is now 0.");
  }
}