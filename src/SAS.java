
public class SAS
{
  private double side1;
  private double angle1;
  private double side2;

  public SAS(double side1, double angle1, double side2)
  {
    this.side1 = side1;
    this.angle1 = angle1;
    this.side2 = side2;
  }

  public double getSide3()
  {
    return Math.pow(Math.pow(side1, 2) + Math.pow(side2, 2)
      - 2 * side1 * side2 * Math.cos(angle1 * (Math.PI / 180)), 0.5);
  }

  public double getAngle2()
  {
    return Math.asin(Math.sin(angle1 * (Math.PI / 180)) * side1 / getSide3())
      * (180 / Math.PI);
  }

  public double getAngle3()
  {
    return 180 - angle1 - getAngle2();
  }

}
