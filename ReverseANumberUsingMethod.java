//WAP in java define a method to reverse the number.
import java.util.Scanner;
public class ReverseANumberUsingMethod{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number You Want To Reverse : ");
    int n = sc.nextInt();
    reverseNumber(n);
  }
  public static void reverseNumber(int n)
  {
    int rev=0;
    while(n!=0)
    {
      int rem = n%10;
      rev = rev*10 + rem;
      n = n/10;
    }
    System.out.println("The Reverse of the number is : "+rev);
  }
}
