// WAP define a method to get the area of a square.  area = side*side
import java.util.Scanner;
public class AreaOfSquare{
  public static double areaOfSquare(double side)
  {
    double area = side*side;
    return area;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the side of the area : ");
    double side = sc.nextInt();
    double area = areaOfSquare(side);
    System.out.println("The area of square is : "+area);
  }
}
