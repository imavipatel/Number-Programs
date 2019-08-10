//WAP to define a method if a number is a strong number or not.
//A number is called strong number if sum of the factorial of its digit is equal to number itself.
//Example: 145 since 1! + 4! + 5! = 1 + 24 + 120 = 145
import java.util.Scanner;
public class StrongNumberUsingMethod{
  public static int factorial(int r)
  {
    int fact = 1;
    while(r>0)
    {
      fact = fact * r;
      r--;
    }
    return fact;
  }
  public static boolean isStrong(int n)
  {
    int sum=0,temp=n;
    do
    {
      int r = n%10;
      sum = sum + factorial(r);
      n = n/10;
    }
    while(n!=0);
    if(sum==temp)
    return true;
    else
    return false;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int n = sc.nextInt();
    boolean result = isStrong(n);
    if(result==true)
    System.out.println(n+" is a strong number.");
    else
    System.out.println(n+" is not a strong number.");
  }
}
