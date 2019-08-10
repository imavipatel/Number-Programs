//WAP to calculate the sum of first n natural numbers.
import java.util.Scanner;
public class SumOfFirstNNaturalNumber{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the natural number : ");
    int n = sc.nextInt();
    int sum = 0;
    while (n>0)
    {
      sum=sum+n;
      n--;
    }
    System.out.println("Sum of N natural number is : "+sum);
  }
}
