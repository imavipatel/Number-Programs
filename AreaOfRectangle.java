// WAP to define a method to return the area of rectangle. area = length*width
import java.util.Scanner;
public class AreaOfRectangle{
  public static double areaOfRectangle(double length, double width)
  {
    double area = length*width;
    return area;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the Rectangle : ");
    double length = sc.nextInt();
    System.out.println("Enter the width of the Rectangle : ");
    double width = sc.nextInt();
    double area = areaOfRectangle(length,width);
    System.out.println("The area of Rectangle is : "+area);
  }
}
