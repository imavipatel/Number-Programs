/* WAP to read the 4 subject marks from the user and display the result.
In any subject marks < 35 so fail; percentage> 80% so distinction,>60 first class,
>50 2nd class. Otherwise just pass */
import java.util.Scanner;
public class ExamResult{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first subject marks out of 100 : ");
    double m1 = sc.nextInt();
    System.out.println("Enter the second subject marks out of 100 : ");
    double m2 = sc.nextInt();
    System.out.println("Enter the third subject marks out of 100 : ");
    double m3 = sc.nextInt();
    System.out.println("Enter the fourth subject marks out of 100 : ");
    double m4 = sc.nextInt();
    if(m1<35||m3<35||m3<35||m4<35)
    {
      System.out.println("Student is failed in any subject.");
    }
    else
    {
      double perc = ((m1+m2+m3+m4)*100)/400;
      if(perc>80)
      System.out.println("Congratulations! You passed with distinction.");
      else if(perc>60)
      System.out.println("Congratulations! You passed with first division.");
      else if(perc>50)
      System.out.println("Congratulations! You passed with second division.");
      else
      System.out.println("Congratulations! You just pass the exam.");
    }
  }
}
