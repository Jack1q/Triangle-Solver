import java.util.*;

/**
 * Triangle Solver 
 * Solves triangles given SSS, SAS, ASA, AAS, or SSA
 * 
 * @author Jack Donofrio
 * @version 1.0
 *
 */

public class Triangle_Solver
{
  public static void main(String[] args)
  {
    final double PI = 3.14159265359;
    Scanner s = new Scanner(System.in);

    System.out.println("What do you have?");
    System.out.println("SSS (0)\nSAS (1)\nASA (2)\nAAS (3)\nSSA (4)");
    int choice = s.nextInt();

    if (choice == 0)
    {
      // test with: a = 8, b = 19, c = 14
      System.out.println("Enter sides a, b, c");

      System.out.println("a: ");
      double a = s.nextDouble();
      System.out.println("b: ");
      double b = s.nextDouble();
      System.out.println("c: ");
      double c = s.nextDouble();

      double A =
        Math.acos( // acos = arcsin = sin^-1
          (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c))
          * (180 / PI);
      double B =
        Math.acos(
          (Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c))
          * (180 / PI);
      double C =
        Math.acos( // acos = arcsin = sin^-1
          (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b))
          * (180 / PI);

      System.out.println("a= " + a + "\nb= " + b + "\nc= " + c + "\nA= " + A
        + "\nB= " + B + "\nC= " + C);
    }
    if (choice == 1)
    {
      // test with a = 9, C = 25, b = 12
      System.out.println("Enter side a, angle C, side b");

      System.out.println("a: ");
      double a = s.nextDouble();
      System.out.println("C: ");
      double C = s.nextDouble();
      System.out.println("b: ");
      double b = s.nextDouble();

      double c =
        Math.pow(Math.pow(a, 2) + Math.pow(b, 2)
          - 2 * a * b * Math.cos(25 * (PI / 180)), 0.5);
      double A = Math.asin(Math.sin(C * (PI / 180)) * a / c) * (180 / PI);
      double B = 180 - C - A;

      System.out.println("a= " + a + "\nb= " + b + "\nc= " + c + "\nA= " + A
        + "\nB= " + B + "\nC= " + C);
    }
    if (choice == 2)
    {
      System.out.println("Enter angle A, side c, angle B");

      System.out.println("A: ");
      double A = s.nextDouble();
      System.out.println("c: ");
      double c = s.nextDouble();
      System.out.println("B: ");
      double B = s.nextDouble();

      double C = 180 - A - B;
      double a = c * Math.sin(A * (PI / 180)) / Math.sin(C * (PI / 180));
      double b = a * Math.sin(B * (PI / 180)) / Math.sin(A * (PI / 180));

      System.out.println("a= " + a + "\nb= " + b + "\nc= " + c + "\nA= " + A
        + "\nB= " + B + "\nC= " + C);
    }
    if (choice == 3)
    {
      System.out.println("Enter angle A, angle B, side a");

      System.out.println("A: ");
      double A = s.nextDouble();
      System.out.println("B: ");
      double B = s.nextDouble();
      System.out.println("a: ");
      double a = s.nextDouble();

      double C = 180 - A - B;
      double b = a * Math.sin(B * (PI / 180)) / Math.sin(A * (PI / 180));
      double c = a * Math.sin(C * (PI / 180)) / Math.sin(A * (PI / 180));

      System.out.println("a= " + a + "\nb= " + b + "\nc= " + c + "\nA= " + A
        + "\nB= " + B + "\nC= " + C);
    }
    if (choice == 4)
    {
      System.out.println("Enter side a, side b, angle A");

      System.out.println("a: ");
      double a = s.nextDouble();
      System.out.println("b: ");
      double b = s.nextDouble();
      System.out.println("A: ");
      double A = s.nextDouble();

      double height = b * Math.sin(A * (PI / 180));

      if (height == a || a >= b)
      {
        System.out.println("=============\nOne triangle: ");
        double B = Math.asin(b * Math.sin(A * (PI / 180)) / a) * (180 / PI);
        double C = 180 - A - B;
        double c = a * Math.sin(C * (PI / 180)) / Math.sin(A * (PI / 180));

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
  }
}
