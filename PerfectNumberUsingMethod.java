//WAP to check if a number is Perfect Number or not.
//Perfect number, a positive integer that is equal to the sum of its proper
//divisors. The smallest perfect number is 6, which is the sum of 1, 2, and 3.
//Other perfect numbers are 28, 496, and 8,128.
import java.util.Scanner;
public class PerfectNumberUsingMethod{
  public static boolean isPerfect(int n)
  {
    int sum = 0;
    for(int i=1;i<=n/2;i++)
    {
      if(n%i==0)
      {
        sum=sum+i;
      }
    }
    if(sum==n)
    return true;
    else
    return false;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number you want to check it is perfect or not : ");
    int n = sc.nextInt();
    boolean result = isPerfect(n);
    if(result==true)
    System.out.println(n+" is a perfect number.");
    else
    System.out.println(n+" is not a perfect number.");
  }
}
