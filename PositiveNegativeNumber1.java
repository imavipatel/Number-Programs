//WAP a program to check if a number is positive or negative.
import java.util.Scanner;
public class PositiveNegativeNumber1{
  public static void isPositiveNegative(int n)
  {
    if(n>0)
    System.out.println(n+" is positive number.");
    else
    System.out.println(n+" is a negative number.");
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number : ");
    int n = sc.nextInt();
    isPositiveNegative(n);
  }
}
