//WAP to print Fibonacci Number Up To N. Fibonacci Number = 0 1 1 2 3 5 8 13
//FOR Example
//Enter a Number :
//9
//0 1 1 2 3 5 8
import java.util.Scanner;
public class FibonacciNumberUpToN{
  public static void fibonacciNumberUpToN(int n)
  {
    int f1=0, f2=1;
    int f3=1;
    if(n==1)
    System.out.print(f1+" ");
    else if(n==0)
    System.out.print("Wrong Input");
    else
    {
      System.out.print(f1+" ");
    }
    while(n>f3)
    {
      System.out.print(f3+" ");
      f3 = f1+f2;
      f1 = f2;
      f2 = f3;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int n = sc.nextInt();
    System.out.println("The Fibonacci Number Up To N is : ");
    fibonacciNumberUpToN(n);
  }
}
