import java.util.*;

/**
 * Triangle Solver 
 * 
 * @author Jack Donofrio
 * @version 1.1
 *
 */
public class Triangle_Solver
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    final double PI = Math.PI;

    System.out
      .print("If a side/angle is unknown, hit enter\nEnter sides: \na= ");
    String aStr = s.nextLine();
    System.out.print("b= ");
    String bStr = s.nextLine();
    System.out.print("c= ");
    String cStr = s.nextLine();
    double a = 0;
    double b = 0;
    double c = 0;

    System.out.print("Enter angles: \nA= ");
    String AStr = s.nextLine();
    System.out.print("B= ");
    String BStr = s.nextLine();
    System.out.print("C= ");
    String CStr = s.nextLine();
    double A = 0;
    double B = 0;
    double C = 0;

    if (!aStr.isEmpty() && !bStr.isEmpty() && !cStr.isEmpty())
    {
      a = Double.parseDouble(aStr);
      b = Double.parseDouble(bStr);
      c = Double.parseDouble(cStr);
      A =
        Math.acos( 
          (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c))
          * (180 / PI);
      B =
        Math.acos(
          (Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c))
          * (180 / PI);
      C =
        Math.acos(
          (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b))
          * (180 / PI);
    }
    if (!aStr.isEmpty() && !bStr.isEmpty() && !CStr.isEmpty())
    {
      a = Double.parseDouble(aStr);
      b = Double.parseDouble(bStr);
      C = Double.parseDouble(CStr);
      c =
        Math.pow(Math.pow(a, 2) + Math.pow(b, 2)
          - 2 * a * b * Math.cos(C * (PI / 180)), 0.5);
      A = Math.asin(Math.sin(C * (PI / 180)) * a / c) * (180 / PI);
      B = 180 - C - A;
    }
    if (!AStr.isEmpty() && !BStr.isEmpty() && !cStr.isEmpty())
    {
      A = Double.parseDouble(AStr);
      B = Double.parseDouble(BStr);
      c = Double.parseDouble(cStr);
      C = 180 - A - B;
      a = c * Math.sin(A * (PI / 180)) / Math.sin(C * (PI / 180));
      b = a * Math.sin(B * (PI / 180)) / Math.sin(A * (PI / 180));
    }
    if (!aStr.isEmpty() && !AStr.isEmpty() && !BStr.isEmpty())
    {
      a = Double.parseDouble(aStr);
      A = Double.parseDouble(AStr);
      B = Double.parseDouble(BStr);
      C = 180 - A - B;
      b = a * Math.sin(B * (PI / 180)) / Math.sin(A * (PI / 180));
      c = a * Math.sin(C * (PI / 180)) / Math.sin(A * (PI / 180));
    }
    if (!aStr.isEmpty() && !bStr.isEmpty() && !AStr.isEmpty())
    {
      a = Double.parseDouble(aStr);
      b = Double.parseDouble(bStr);
      A = Double.parseDouble(AStr);
      double height = b * Math.sin(A * (PI / 180));
      if (height == a || a >= b)
      {
        System.out.println("=============\nOne triangle: ");
        B = Math.asin(b * Math.sin(A * (PI / 180)) / a) * (180 / PI);
        C = 180 - A - B;
        c = a * Math.sin(C * (PI / 180)) / Math.sin(A * (PI / 180));
        System.out.println("a= " + a + "\nb= " + b + "\nc= " + c + "\nA= " + A
          + "\nB= " + B + "\nC= " + C);
      }
      else if (height < a && a < b)
      {
        System.out.println("==============\nTwo triangles: \n");

        double B1 = Math.asin(b * Math.sin(A * (PI / 180)) / a) * (180 / PI);
        double C1 = 180 - B1 - A;
        double c1 = a * Math.sin(C1 * (PI / 180)) / Math.sin(A * (PI / 180));
        System.out.println("Triangle #1:");
        System.out.println("a= " + a + "\nb= " + b + "\nc= " + c1 + "\nA= " + A
          + "\nB= " + B1 + "\nC= " + C1 + "\n");

        double B2 = 180 - B1;
        double C2 = 180 - B2 - A;
        double c2 = a * Math.sin(C2 * (PI / 180)) / Math.sin(A * (PI / 180));
        System.out.println("Triangle #2:");
        System.out.println("a= " + a + "\nb= " + b + "\nc= " + c2 + "\nA= " + A
          + "\nB= " + B2 + "\nC= " + C2);
      }
      else if (a < height || a <= b)
        System.out.println("No triangles possible");
    }
    else
    {
      System.out.println("a= " + a + "\nb= " + b + "\nc= " + c + "\nA= " + A
        + "\nB= " + B + "\nC= " + C);
    }
  }
}
