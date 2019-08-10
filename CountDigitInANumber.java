//WAP in java to count how many digits in a number.
import java.util.Scanner;
public class CountDigitInANumber{
  public static int countDigitInANumber(int n)
  {
    int count = 0;
    if(n==0)
    {
      return 1;
    }
    while(n!=0)
    {
      n=n/10;
      count++;
    }
    return count;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to count the digit : ");
    int n = sc.nextInt();
    int count = countDigitInANumber(n);
    System.out.println("The number of digit in the "+n+" is : "+count);
  }
}
