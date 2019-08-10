//WAP to count how many even digits in your number.
import java.util.Scanner;
public class CountEvenDigitInANumber
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to count the even digit in the number : ");
    int n = sc.nextInt();
    int count = countEvenDigitInANumber(n);
    System.out.println("The even digit in the number is : "+count);
  }
  public static int countEvenDigitInANumber(int n)
  {
    int rem, count=0;
    if(n==0)
    return 1;
    while(n!=0)
    {
      rem = n%10;
      if(rem%2==0)
      {
        count++;
      }
      n=n/10;
    }
    return count;
  }
}
