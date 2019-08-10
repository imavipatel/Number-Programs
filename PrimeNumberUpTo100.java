//WAP in Java to print Prime Number Up To 100.
import java.util.Scanner;
public class PrimeNumber
{
  static boolean isPrime(int n)
  {
    int i = 2;
    while(i<=n/2)
    {
      if(n%i==0)
      return false;
      i++;
    }
    return true;
  }
  public static void main(String[] args) {
    boolean j;
    int i=1;
    while (i<=100)
    {
      j=isPrime(i);
      if (j==true)
      System.out.println(i);
      i++;
    }
  }
}
