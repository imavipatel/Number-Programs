//WAP to print first N Fibonacci terms. Fibonacci Number = 0 1 1 2 3 5 8 13
//FOR Example
//Enter a Number :
//9
//0 1 1 2 3 5 8 13 21
import java.util.Scanner;
public class FirstNFibonacciNumber{
  public static void firstNFibonacciNumber(int n)
  {
    int f1=0,f2=1;
    while(n>0)
    {
      System.out.print(f1+" ");
      int f3 = f1+f2;
      f1 = f2;
      f2 = f3;
      n--;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number : ");
    int n = sc.nextInt();
    System.out.println("The First N Fibonacci Number is : ");
    firstNFibonacciNumber(n);
  }
}
