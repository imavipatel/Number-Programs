//WAP to calculate the n to the power of p.
import java.util.Scanner;
public class PowerOfNToP{
  public static int powerOfNToP(int n, int p)
  {
    int product = 1;
    while(p>0)
    {
      product = product*n;
      p--;
    }
    return product;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the base Value : ");
    int n = sc.nextInt();
    System.out.println("Enter the Exponent Value : ");
    int p = sc.nextInt();
    int product = powerOfNToP(n,p);
    System.out.println("The result of "+n+" to the power "+p+" is : "+product);
  }
}
