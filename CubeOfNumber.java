// WAP to define a method calculate the cube of a number.
import java.util.Scanner;
public class CubeOfNumber{
  public static double cubeOfNumber(double n)
  {
    double cube = n*n*n;
    return cube;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number : ");
    double n = sc.nextInt();
    double cube = cubeOfNumber(n);
    System.out.println("The cube of the number is : "+cube);
  }
}
