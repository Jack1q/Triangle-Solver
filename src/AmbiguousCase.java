public class AmbiguousCase
{
  private double side1;
  private double side2;
  private double angle1;

  public AmbiguousCase(double side1, double side2, double angle1)
  {
    this.side1 = side1;
    this.side2 = side2;
    this.angle1 = angle1;
  }

  public int getNumberOfTriangles()
  {
    if (getHeight() == side1 || side1 >= side2)
      return 1;
    else if (getHeight() < side1 && side1 < side2)
      return 2;
    else
      return 0;
  }

  public double getHeight()
  {
    return side2 * Math.sin(angle1 * (Math.PI / 180));
  }

  public double getAngle2a()
  {
    return Math.asin(side2 * Math.sin(angle1 * (Math.PI / 180)) / side1)
      * (180 / Math.PI);
  }

  public double getAngle3a()
  {
    return 180 - angle1 - getAngle2a();
  }

  public double getSide3a()
  {
    return side1 * Math.sin(getAngle3a() * (Math.PI / 180))
      / Math.sin(angle1 * (Math.PI / 180));
  }

  public double getAngle2b()
  {
    return 180 - getAngle2a();
  }

  public double getAngle3b()
  {
    return 180 - getAngle2b() - angle1;
  }

  public double getSide3b()
  {
    return side1 * Math.sin(getAngle3b() * (Math.PI / 180))
      / Math.sin(angle1 * (Math.PI / 180));
  }

}
