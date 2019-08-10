//WAP to define a method to check your number is Armstrong number or not.
//An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself.
//For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.
import java.util.Scanner;
public class ArmstrongNumberUsingMethod{
  public static int digit(int n)
  {
    int c = 0;
    while(n!=0)
    {
      c++;
      n = n/10;
    }
    return c;
  }
  public static boolean isArmstrong(int n, int c)
  {
    int sum=0, temp=n;
    while(n!=0)
    {
      int r = n%10;
      sum = sum + power(r,c);
      n = n/10;
    }
    if(sum==temp)
    return true;
    else
    return false;
  }
  public static int power(int r, int c)
  {
    int product = 1;
    while(c!=0)
    {
      product = product * r;
      c--;
    }
    return  product;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check it is Armstrong number or not : ");
    int n = sc.nextInt();
    int c = digit(n);
    boolean result = isArmstrong(n,c);
    if(result==true)
    System.out.println(n+" is a Armstrong Number.");
    else
    System.out.println(n+" is not a Armstrong Number.");
  }
}
