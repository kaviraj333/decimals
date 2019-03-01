import java.util.*;
import java.io.*;
class Sumdeciamals
{
  public static void main(String args[])
  {
        double a, b;
        Scanner input = new Scanner(System.in);
    	  a=input.nextFloat();
	      b=input.nextFloat();
	      double c=a*b;
	      System.out.format("%5.f",c);
  }
}
