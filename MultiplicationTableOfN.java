//WAP in java to display the multiplication of N.
import java.util.Scanner;
public class MultiplicationTableOfN{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number which table you want : ");
    int n = sc.nextInt();
    System.out.println("The Table is : ");
    int i=1;
    while(i<=10)
    {
      System.out.println(n+" * "+i+" = "+n*i);
      i++;
    }
  }
}
