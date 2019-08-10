//WAP to define a method to calculate the area of a circle. Area = pie*r*r
import java.util.Scanner;
public class AreaOfCircle{
  public static double areaOfCircle(double r)
  {
    double area = 3.14*r*r;
    return area;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Radius of Circle : ");
    double r = sc.nextInt();
    double area = areaOfCircle(r);
    System.out.println("The Area Of Circle is "+area);
  }
}
