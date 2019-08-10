//WAP to define if your number is even or odd.
import java.util.Scanner;
public class EvenOddUsingMethod{
  public static boolean isEvenOdd(int n)
  {
    if(n%2==0)
    return true;
    else
    return false;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int n = sc.nextInt();
    boolean res = isEvenOdd(n);
    if(res==true)
    System.out.println(n+" is a even number.");
    else
    System.out.println(n+" is a odd number.");
  }
}
