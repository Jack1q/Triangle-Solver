import java.util.*;

/**
 * Triangle Solver
 * 
 * @author Jack Donofrio
 * @version 1.1
 *
 */
public class Main
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);

    System.out.println("       A     ");
    System.out.println("      /\\     ");
    System.out.println("     /  \\    ");
    System.out.println("  c /    \\ b    ");
    System.out.println("   /      \\   ");
    System.out.println("  /        \\  ");
    System.out.println(" /__________\\");
    System.out.println("B     a      C");
    System.out
      .print("If a side/angle is unknown, hit enter\nEnter sides: \na= ");
    String aStr = s.nextLine();
    System.out.print("b= ");
    String bStr = s.nextLine();
    System.out.print("c= ");
    String cStr = s.nextLine();
    System.out.print("Enter angles: \nA= ");
    String AStr = s.nextLine();
    System.out.print("B= ");
    String BStr = s.nextLine();
    System.out.print("C= ");
    String CStr = s.nextLine();

    Tester triangle = new Tester(aStr, bStr, cStr, AStr, BStr, CStr);
    String message = triangle.getMessage();
    System.out.print(message);

  }
}
