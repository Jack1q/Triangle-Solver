public class SSS
{
  private double a;
  private double b;
  private double c;
  private final double PI = Math.PI;

  public SSS(double a, double b, double c)
  {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public double getA()
  {
    return Math
      .acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c))
      * (180 / PI);
  }

  public double getB()
  {
    return Math
      .acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c))
      * (180 / PI);
  }

  public double getC()
  {
    return Math
      .acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b))
      * (180 / PI);
  }

  public String toString()
  {
    return ("a= " + a + "\nb= " + b + "\nc= " + c + "\nA= " + getA() + "\nB= "
      + getB() + "\nC= " + getC()) + "\nSolved using SSS";
  }
}
