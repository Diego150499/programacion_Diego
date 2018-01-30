/********
*Diego Perez Carrillo
*CalculatorOfArea.java
*this program calculate the area of the rectangle
********/
import java.util.Scanner;

public class CalculatorOfArea{
public static void main(String arsg[]){
 int base;
 int heigth;
 String result;
  System.out.println("enter the base");
   Scanner S = new Scanner (System.in);
     base = S.nextInt();
       System.out.println("enter the heigth");
        Scanner X = new Scanner (System.in);
         heigth = X.nextInt();
          result="The area of the rectangle is: "+(base*heigth);
           System.out.println(result);
 }//end main
}//end CalculatorOfArea
