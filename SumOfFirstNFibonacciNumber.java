//WAP to print Sum Of  first N Fibonacci terms. Fibonacci Number = 0 1 1 2 3 5 8 13
//FOR Example
//Enter a Number :
//9
//0 1 1 2 3 5 8 = 20;
import java.util.Scanner;
public class SumOfFirstNFibonacciNumber{
  public static int sumOfFirstNFibonacciNumber(int n)
  {
    int f1=0,f2=1;
    int sum=0,f3=1;
    while(n>f3)
    {
      sum = sum + f3;
      f3 = f1+f2;
      f1 = f2;
      f2 = f3;
    }
    return sum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number : ");
    int n = sc.nextInt();
    int sum = sumOfFirstNFibonacciNumber(n);
    System.out.println("The Sum Of First N Fibonacci Number is : "+sum);
  }
}
