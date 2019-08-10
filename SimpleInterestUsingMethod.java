//WAP to calculate the Simple Interest using method. SI = p*r*t/100 , p=principle or amount, r=rate of Interest, t = time
import java.util.Scanner;
public class SimpleInterestUsingMethod
{
  public static double getSimpleInterest(long p, double r, double t )
  {
    double SI = p*r*t/100;
    return SI;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Principle/Amount : ");
    long p = sc.nextInt();
    System.out.println("Enter the Rate of Interest : ");
    double r = sc.nextInt();
    System.out.println("Enter the Time : ");
    double t = sc.nextInt();
    double SI = getSimpleInterest(p,r,t);
    System.out.println("The Simple Interest is : "+SI);
  }
}
