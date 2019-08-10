// WAP to define a method to print happy number between 1 to N.
//A number is called happy if it leads to 1 after a sequence of steps where in each
//step number is replaced by sum of squares of its digit that is if we start with
//Happy Number and keep replacing it with digits square sum, we reach 1.
//EX : Input: n = 19 Output: True 19 is Happy Number,1^2 + 9^2 = 82,8^2 + 2^2 = 68
//6^2 + 8^2 = 100,1^2 + 0^2 + 0^2 = 1 As we reached to 1, 19 is a Happy Number.
// 1, 7, 10, 13, 19, 23, 28, 31, 32, 44, 49, 68
import java.util.Scanner;
public class HappyNumberBetween1ToN{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number upto which Happy Number you want : ");
    int n = sc.nextInt();
    System.out.println("The Happy Number is : ");
    boolean j;
    int i=1;
    while(i<=n)
    {
      j = isHappyNumber(i);
      if(j==true)
      System.out.print(i+" ");
      i++;
    }
  }
  public static boolean isHappyNumber(int n)
  {
    while(n>9)
    {
      int sum=0;
      while(n!=0)
      {
        int rem = n%10;
        sum = sum +(rem*rem);
        n = n/10;
      }
      n = sum;
    }
    if(n==1||n==7)
    return true;
    else
    return false;
  }
}
