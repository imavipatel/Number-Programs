//WAP to check if your number is even or odd.
import  java.util.Scanner;
public class EvenOrOdd{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number : ");
    int n = sc.nextInt();
    if(n%2==0)
    System.out.println(n+" is a even number.");
    else
    System.out.println(n+" is a odd number.");
  }
}
