//WAP to define a method to return product of first n natural numbers.
import java.util.Scanner;
public class FactorialOfN{
  public static void factorialOfN(int n)
  {
    int product=1;
    while(n>=1)
    {
      product=product*n;
      n = n-1;
      //n--;
    }
    System.out.println("The Factorial Upto is : "+product);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number Up To which you want Factorial : ");
    int n = sc.nextInt();
    factorialOfN(n);
  }
}
