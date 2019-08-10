// WAP to define a method to how many even numbers between 1 to n.
import java.util.Scanner;
public class EvenNumberCountUptoN{
  public static void countEven(int n){
    int count = 0;
    if(n>0)
    {
    while(n>0)
    {
      if(n%2==0)
      count++;
      n--;
    }
  }
    else
    {
    System.out.println("Enter the number greater than 1");
  }
  System.out.println("Even count upto N is : "+count);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number upto which you want to count even number : ");
    int n = sc.nextInt();
    countEven(n);
  }
}
