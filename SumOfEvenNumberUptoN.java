// WAP to calculate the sum of even numbers between 1 to n.
import java.util.Scanner;
public class SumOfEvenNumberUptoN{
  public static void sumOfEvenNumberUptoN(int n){
    int sum = 0,i = 2;
    while(i<=n)
    {
      sum = sum+i;
      i=i+2;
    }
    System.out.println("The sum of even number upto N : "+sum);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number up to which you want sum of even number : ");
    int n = sc.nextInt();
    sumOfEvenNumberUptoN(n);
  }
}
