/*****
*Diego Perez Carrillo
*AreaOfTheCono.java
*This program calculate the Area of the a "cono"
*******/
import java.util.Scanner;
public class AreaOfTheCono{
  public static void main(String arsg[]){
    final double pi=3.1416;
    int r;
    int h;
    int c;
    int At;
    double Area;
    double Ac;
    //figure
    System.out.println("   00    ");
    System.out.println("  0000  H");
    System.out.println(" 000000  ");
    System.out.println("(___   ) ");
    System.out.println(" <R>     ");
    System.out.println("         ");
    //dates
    System.out.println("insert *R* = the radio of the circle.");
    Scanner J = new Scanner(System.in);
    r = J.nextInt();
    System.out.println("insert *H* = the heigth of the triangle.");
    Scanner X = new Scanner(System.in);
    h = X.nextInt();
    //operations
    At=((r*2)*h);
    Ac=(((r*r)*pi)/2);
    Area=Ac+At;//result
    System.out.println("The area is: "+Area);
  }//end main
}//AreaOfTheCono
