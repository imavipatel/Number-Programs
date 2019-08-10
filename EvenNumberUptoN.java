// WAP to print the even number between 1 to n.
import java.util.Scanner;
public class EvenNumberUptoN{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 1;
    System.out.print("Enter a Number to Find Even Number till that Number : ");
    int n = sc.nextInt();
    System.out.print("The even Number is : ");
    if(i%2!=0)
    i++;
    while(i<=n)
    {
      System.out.print(i+" ");
      i=i+2;
    }
  }
}
