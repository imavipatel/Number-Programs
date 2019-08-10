//WAP in java to print Pallindrome Number Up To 1000.
import java.util.Scanner;
public class PalindromeNumberUpTo1000{
  public static void main(String[] args)
  System.out.println("The Palindrome Number UpTo 1000 is : ");
  {
    boolean j;
    int i=1;
    while (i<=1000)
    {
      j=isPalindrome(i);
      if (j==true)
      System.out.print(i+" ");
      i++;
    }
  }
  public static boolean isPalindrome(int n){
    int rev = 0, temp=n;
    while (n != 0){
      int rem = n % 10;
      rev = rev * 10 + rem;
      n = n / 10;
    }
    if (temp == rev)
    return true;
    else
    return false;
  }
}
