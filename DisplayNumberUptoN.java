// WAP to check display the number between 1 to N.
import java.util.Scanner;
public class DisplayNumberUptoN{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 1;
    System.out.println("Enter Upto what Number you want to Print : ");
    int n = sc.nextInt();
    while(i<=n)
    {
      System.out.print(i+" ");
      i++;
    }
  }
}
