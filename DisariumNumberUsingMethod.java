//WAP to check your number is Disarium number or not.(Sum of power of individual digit by their position).
//A number is said to be the Disarium number when the sum of its digit raised to the power of their respective positions is equal to the number itself.
//For example, 175 is a Disarium number as follows
//1^1 + 7^2 + 5^3 = 1 + 49 + 125 = 175
//Some of the other examples of Disarium number are 89, 135, 518 etc.
import java.util.Scanner;
public class DisariumNumberUsingMethod{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check a number is Disarium or not : ");
    int n = sc.nextInt();
    boolean result = isDisarium(n);
    if(result==true)
    System.out.println(n+" is a Disarium Number.");
    else
    System.out.println(n+" is not a Disarium Number.");
  }
  public static boolean isDisarium(int n)
  {
    int c = digitCount(n);
    int sum=0, temp=n;
    while(n!=0)
    {
      int r = n%10;
      sum = sum+power(r,c);
      n=n/10;
      c--;
    }
    if(sum==temp)
    return true;
    else
    return false;
  }
  public static int digitCount(int n)
  {
    int c = 0;
    while(n!=0)
    {
      c++;
      n=n/10;
    }
    return c;
  }
  public static int power(int r, int c)
  {
    int product = 1;
    while(c!=0)
    {
      product = product*r;
      c--;
    }
    return product;
  }
}
