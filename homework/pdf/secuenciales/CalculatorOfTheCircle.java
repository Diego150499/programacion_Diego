/***********
*Diego Perez Carrillo
*CalculatorOfTheCircle
*this program calculate the area of the circle
**********/
import java.util.Scanner;

public class CalculatorOfTheCircle{
 public static void main(String arsg[]){
   final double pi = 3.1416;
    int radio;
    final double Area;
      System.out.println("insert the radius of the circle");
       Scanner R = new Scanner (System.in);
        radio=R.nextInt();
          Area=((radio*radio)*pi);
          System.out.println("the area is: ");
          System.out.println("           "+Area+" units");
 }//end main
}//end CalculatorOfTheCircle
