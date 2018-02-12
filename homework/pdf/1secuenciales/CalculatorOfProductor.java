/******
*Diego Perez Carrillo
*CalculatorOfProductor
*this program calculates the amount that
*the producer will receive for his delivery
******/
import java.util.Scanner;
public class CalculatorOfProductor{
  public static void main(String args[]){
    //dates
    int liter;
    int price;
    final double gallon=3.785;
    double gallons;
    double earnings;
    //read dates
    System.out.println("Welcome");
    System.out.println("insert the quantity of liters produced");
    Scanner X = new Scanner(System.in);
    liter = X.nextInt();
    System.out.println("insert the cost per gallon");
    Scanner J = new Scanner(System.in);
    price = J.nextInt();
    //operations
    gallons=(liter/gallon);
    earnings=(gallons*price);
    System.out.println("The amount of gallons produced will be:");
    System.out.println("  "+gallons+" gallons");
    System.out.println("total earnings obtained: ");
    System.out.println("  $"+earnings);
  }//end main
}//end CalculatorOfProductor
