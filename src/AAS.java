public class AAS
{
  private double angle1;
  private double angle2;
  private double side1;

  public AAS(double angle1, double angle2, double side1)
  {
    this.angle1 = angle1;
    this.angle2 = angle2;
    this.side1 = side1;
  }

  public double getAngle3()
  {
    return 180 - angle1 - angle2;
  }

  public double getSide2()
  {
    return side1 * Math.sin(angle2 * (Math.PI / 180))
      / Math.sin(angle1 * (Math.PI / 180));
  }

  public double getSide3()
  {
    return side1 * Math.sin(getAngle3() * (Math.PI / 180))
      / Math.sin(angle1 * (Math.PI / 180));
  }

}
