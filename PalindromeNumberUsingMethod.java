// WAP to define a method to check if a number is palindrome or not.
import java.util.Scanner;
public class PalindromeNumberUsingMethod{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number to check it is Palindrome or not : ");
    int n = sc.nextInt();
    reverseNumber(n);
  }
  public static void reverseNumber(int n)
  {
    int rev=0, temp=n;
    while(n!=0)
    {
      int rem = n%10;
      rev = rev*10 + rem;
      n = n/10;
    }
    if(temp==rev)
    System.out.println(temp+" is a Palindrome Number.");
    else
    System.out.println(temp+" is not a Palindrome Number.");
  }
}
