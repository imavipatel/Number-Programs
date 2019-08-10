// WAP to define a method to check the number is happy number or not.
//A number is called happy if it leads to 1 after a sequence of steps where in each
//step number is replaced by sum of squares of its digit that is if we start with
//Happy Number and keep replacing it with digits square sum, we reach 1.
//EX : Input: n = 19 Output: True 19 is Happy Number,1^2 + 9^2 = 82,8^2 + 2^2 = 68
//6^2 + 8^2 = 100,1^2 + 0^2 + 0^2 = 1 As we reached to 1, 19 is a Happy Number.
// 1, 7, 10, 13, 19, 23, 28, 31, 32, 44, 49, 68
import java.util.Scanner;
public class HappyNumberUsingMethod{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number you want to check it is Happy number or not : ");
    int n = sc.nextInt();
    isHappy(n);
  }
  public static void isHappy(int n)
  {
    while(n>9)
    {
      int sum=0;
      while(n!=0)
      {
        int rem = n%10;
        sum = sum+(rem*rem);
        n = n/10;
      }
      n = sum;
    }
    if(n==1||n==7)
    System.out.println(n+" is a Happy Number.");
    else
    System.out.println(n+" is not a Happy Number.");
  }
}
