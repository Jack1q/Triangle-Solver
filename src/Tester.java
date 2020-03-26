
public class Tester
{
  private String message;
  private String aStr;
  private String bStr;
  private String cStr;
  private String AStr;
  private String BStr;
  private String CStr;
  private double a;
  private double b;
  private double c;
  private double A;
  private double B;
  private double C;

  public Tester(String aStr, String bStr, String cStr, String AStr, String BStr,
    String CStr)
  {
    this.aStr = aStr;
    this.bStr = bStr;
    this.cStr = cStr;
    this.AStr = AStr;
    this.BStr = BStr;
    this.CStr = CStr;
  }

  public void tests()
  {
    if (!AStr.isEmpty() && !BStr.isEmpty() && !CStr.isEmpty()) // done
    {
      message = "No triangle is possible: Need side lengths.";
    }

    if (!aStr.isEmpty() && !bStr.isEmpty() && !cStr.isEmpty())
    {
      message =
        new SSS(Double.parseDouble(aStr), Double.parseDouble(bStr),
          Double.parseDouble(cStr)).toString();
    }
    if (!aStr.isEmpty() && !CStr.isEmpty() && !bStr.isEmpty())
    {
      a = Double.parseDouble(aStr);
      C = Double.parseDouble(CStr);
      b = Double.parseDouble(bStr);
      SAS test = new SAS(a, C, b);
      message =
        "a= " + a + "\nb= " + b + "\nc= " + c + "\nA= " + test.getAngle2()
          + "\nB= " + test.getAngle3() + "\nC= " + C + "\nSolved using SAS";
    }

    if (!bStr.isEmpty() && !AStr.isEmpty() && !cStr.isEmpty())
    {
      b = Double.parseDouble(bStr);
      A = Double.parseDouble(AStr);
      c = Double.parseDouble(cStr);
      SAS test = new SAS(b, A, c);
      message =
        "a= " + test.getSide3() + "\nb= " + b + "\nc= " + c + "\nA= " + A
          + "\nB= " + test.getAngle2() + "\nC= " + test.getAngle3()
          + "\nSolved using SAS";

    }

    if (!cStr.isEmpty() && !BStr.isEmpty() && !aStr.isEmpty())
    {
      c = Double.parseDouble(cStr);
      B = Double.parseDouble(BStr);
      a = Double.parseDouble(aStr);
      SAS test = new SAS(c, B, a);
      message = // check over this
        "a= " + a + "\nb= " + test.getSide3() + "\nc= " + c + "\nA= "
          + test.getAngle3() + "\nB= " + B + "\nC= " + test.getAngle2()
          + "\nSolved using SAS";

    }

    if (!AStr.isEmpty() && !cStr.isEmpty() && !BStr.isEmpty())
    {
      A = Double.parseDouble(AStr);
      c = Double.parseDouble(cStr);
      B = Double.parseDouble(BStr);
      ASA test = new ASA(A, c, B);
      message =
        "a= " + test.getSide2() + "\nb= " + test.getSide3() + "\nc= " + c
          + "\nA= " + A + "\nB= " + B + "\nC= " + test.getSide3()
          + "\nSolved using ASA";
    }

    if (!BStr.isEmpty() && !aStr.isEmpty() && !CStr.isEmpty())
    {
      B = Double.parseDouble(BStr);
      a = Double.parseDouble(aStr);
      C = Double.parseDouble(CStr);
      ASA test = new ASA(B, a, C);
      message =
        "a= " + a + "\nb= " + test.getSide2() + "\nc= " + test.getSide3()
          + "\nA= " + test.getAngle3() + "\nB= " + B + "\nC= " + C
          + "\nSolved using ASA";
    }

    if (!CStr.isEmpty() && !bStr.isEmpty() && !AStr.isEmpty())
    {
      C = Double.parseDouble(CStr);
      b = Double.parseDouble(bStr);
      A = Double.parseDouble(AStr);
      ASA test = new ASA(C, b, A);
      message =
        "a = " + test.getSide3() + "\nb= " + b + "\nc= " + test.getSide3()
          + "\nA= " + A + "\nB= " + test.getAngle3() + "\nC= " + C
          + "\nSolved using ASA";
    }

    if (!AStr.isEmpty() && !BStr.isEmpty() && !aStr.isEmpty()) // AAS
    {
      A = Double.parseDouble(AStr);
      B = Double.parseDouble(BStr);
      a = Double.parseDouble(aStr);
      AAS test = new AAS(A, B, a);
      message =
        "a= " + a + "\nb= " + test.getSide2() + "\nc= " + test.getSide3()
          + "\nA= " + A + "\nB= " + B + "\nC= " + test.getAngle3()
          + "\nSolved using AAS";
    }

    if (!BStr.isEmpty() && !CStr.isEmpty() && !bStr.isEmpty())
    {
      B = Double.parseDouble(BStr);
      C = Double.parseDouble(CStr);
      b = Double.parseDouble(bStr);
      AAS test = new AAS(B, C, b);
      message =
        "a= " + test.getSide3() + "\nb= " + b + "\nc= " + test.getSide2()
          + "\nA= " + test.getAngle3() + "\nB= " + B + "\nC= " + C
          + "\nSolved using AAS";
    }

    if (!CStr.isEmpty() && !AStr.isEmpty() && !cStr.isEmpty())
    {
      C = Double.parseDouble(CStr);
      A = Double.parseDouble(AStr);
      c = Double.parseDouble(cStr);
      AAS test = new AAS(C, A, c);
      message =
        "a= " + test.getSide2() + "\nb= " + test.getSide3() + "\nc= " + c
          + "\nA= " + A + "\nB= " + test.getAngle3() + "\nC= " + C
          + "\nSolved using AAS";
    }

    if (!aStr.isEmpty() && !bStr.isEmpty() && !AStr.isEmpty())
    {
      a = Double.parseDouble(aStr);
      b = Double.parseDouble(bStr);
      A = Double.parseDouble(AStr);
      AmbiguousCase test = new AmbiguousCase(a, b, A);
      if (test.getNumberOfTriangles() == 1)
      {
        message =
          "a= " + a + "\nb= " + b + "\nc= " + test.getSide3a() + "\nA= " + A
            + "\nB= " + test.getAngle2a() + "\nC= " + test.getAngle3a()
            + "\nSolved using the Ambiguous Case";
      }
      else if (test.getNumberOfTriangles() == 2)
      {
        message =
          "Triangle #1:\na= " + a + "\nb= " + b + "\nc= " + test.getSide3a()
            + "\nA= " + A + "\nB= " + test.getAngle2a() + "\nC= "
            + test.getAngle3a() + "\nTriangle#2\na= " + a + "\nb= " + b
            + "\nc= " + test.getSide3b() + "\nA= " + A + "\nB= "
            + test.getAngle2b() + "\nC= " + test.getAngle3b()
            + "\nSolved using the Ambiguous Case";
      }
      else
        message = "No triangles possible: The Ambiguous Case";
    }

    if (!bStr.isEmpty() && !cStr.isEmpty() && !BStr.isEmpty())
    {
      b = Double.parseDouble(bStr);
      c = Double.parseDouble(cStr);
      B = Double.parseDouble(BStr);
      AmbiguousCase test = new AmbiguousCase(b, c, B);
      if (test.getNumberOfTriangles() == 1)
      {
        message =
          "a= " + test.getSide3a() + "\nb= " + b + "\nc= " + c + "\nA= "
            + test.getAngle3a() + "\nB= " + B + "\nC= " + test.getAngle2a()
            + "\nSolved using the Ambiguous Case";
      }
      else if (test.getNumberOfTriangles() == 2)
      {
        message =
          "Triangle #1:\na= " + test.getSide3a() + "\nb= " + b + "\nc= " + c
            + "\nA= " + test.getAngle3a() + "\nB= " + B + "\nC= "
            + test.getAngle2a() + "\nTriangle#2\na= " + test.getSide3b()
            + "\nb= " + b + "\nc= " + c + "\nA= " + test.getAngle3b() + "\nB= "
            + B + "\nC= " + test.getAngle2b()
            + "\nSolved using the Ambiguous Case";
      }
      else
        message = "No triangle possible: The Ambiguous Case";
    }
    if (!cStr.isEmpty() && !aStr.isEmpty() && !CStr.isEmpty())
    {
      c = Double.parseDouble(cStr);
      a = Double.parseDouble(aStr);
      C = Double.parseDouble(CStr);
      AmbiguousCase test = new AmbiguousCase(c, a, C);
      if (test.getNumberOfTriangles() == 1)
      {
        message =
          "a= " + a + "\nb= " + test.getSide3a() + "\nc= " + c + "\nA= "
            + test.getAngle2a() + "\nB= " + test.getAngle3a() + "\nC= " + C
            + "\nSolved using the Ambiguous Case";
      }
      else if (test.getNumberOfTriangles() == 2)
      {
        message =
          "Triangle #1:\na= " + a + "\nb= " + test.getSide3a() + "\nc= " + c
            + "\nA= " + test.getAngle2a() + "\nB= " + test.getAngle3a()
            + "\nC= " + C + "\nTriangle#2\na= " + a + "\nb= " + test.getSide3b()
            + "\nc= " + c + "\nA= " + test.getAngle2b() + "\nB= "
            + test.getAngle3b() + "\nC= " + C
            + "\nSolved using the Ambiguous Case";
      }
      else
        message = "No triangles possible: The Ambiguous Case";
    }

  }

  public String toString()
  {
    tests();
    if (message.contains("NaN"))
    {
      return "No Triangle is possible: One side is greater than or equal to the sum of the other two.";
    }
    return message;
  }

}
