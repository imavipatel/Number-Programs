// WAP to define a method to calculate the sum of square of digits.
import java.util.Scanner;
public class SumOfSquareOfDigitInANumber
{
  public static int sumOfSquareOfDigitInANumber(int n)
  {
    int sum=0;
    while(n!=0)
    {
      int r = n%10;
      sum = sum+(r*r);
      n = n/10;
    }
    return sum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int n = sc.nextInt();
    int sum = sumOfSquareOfDigitInANumber(n);
    System.out.println("The Sum Of Square Of Digit In The Number is : "+sum);
  }
}
