//WAP to define a method to return biggest between two numbers.
import java.util.Scanner;
public class BiggestBetweenTwoNumber{
  public static void biggestBetweenTwoNumber(double a, double b)
  {
    //double a,b;
    if(a>b)
    System.out.println(a+" is bigger number.");
    else if(b>a)
    System.out.println(b+" is bigger number.");
    else
    System.out.println("Both number are equal.");
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first Number : ");
    double a = sc.nextInt();
    System.out.println("Enter the Second Number : ");
    double b = sc.nextInt();
    biggestBetweenTwoNumber(a,b);
  }
}
