// WAP to define a method to how many even numbers between 1 to n.
import java.util.Scanner;
public class EvenNumberCountUptoN1{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number upto which you want to count even number : ");
    int n = sc.nextInt();
    countEven(n);
  }
  public static void countEven(int n){
    int count=0,i=2;
    while(i<=n)
    {
      i=i+2;
      count++;
    }
    System.out.println("Total of "+count+" even number.");
  }
}
