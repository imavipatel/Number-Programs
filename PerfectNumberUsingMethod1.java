//WAP to check if a number is Perfect Number or not.
//Perfect number, a positive integer that is equal to the sum of its proper
//divisors. The smallest perfect number is 6, which is the sum of 1, 2, and 3.
//Other perfect numbers are 28, 496, and 8,128.
import java.util.Scanner;
public class PerfectNumberUsingMethod1{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number you want check it is perfect or not : ");
    int n = sc.nextInt();
    isPerfect(n);
  }
  public static void isPerfect(int n)
  {
    int sum=0, i=1;
    boolean rs;
    while(i<=n/2)
    {
      rs = isDivisible(n,i);
      if(rs==true)
        sum=sum+i;
        i++;
    }
    if(sum==n)
    System.out.println(n+" is a perfect number.");
    else
    System.out.println(n+" is not a perfect number.");
  }
  public static boolean isDivisible(int n, int i)
  {
    if(n%i==0)
    return true;
    else
    return false;
  }
}
