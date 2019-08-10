//WAP to display the multiples of 5 between 1 to n.
import java.util.Scanner;
public class MultiplesOf5Between1ToN{
  public static void multiplesOf5Between1ToN(int n){
    int i=5;
    while(i<=n)
    {
      System.out.println("Multiple of 5 upto "+n+" is : "+i);
      i=i+5;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number upto which you want multiple of 5 : ");
    int n = sc.nextInt();
    multiplesOf5Between1ToN(n);
  }
}
