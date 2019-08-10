 //WAP to define a method to print a palindrome Numbers between 1 to N.
import java.util.Scanner;
public class PalindromeNumberBetween1ToN{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number upto which you want to print Palindrome number : ");
    int n = sc.nextInt();
    System.out.println("The Palindrome Number is : ");
    boolean j;
    int i=1;
    while(i<=n)
    {
      j = isPalindrome(i);
      if(j==true)
      System.out.print(i+" ");
      i++;
    }
  }
  public static boolean isPalindrome(int n)
  {
    int rev = 0, temp=n;
    while(n!=0)
    {
      int rem = n%10;
      rev = rev * 10 + rem;
      n = n/10;
    }
    if(temp==rev)
    return true;
    else
    return false;
  }
}
