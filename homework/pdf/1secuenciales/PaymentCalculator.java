/*****
*Diego Perez Carrillo
*PaymentCalculator
*this program calculates the payment of a person for filling a pool
*****/
import java.util.Scanner;
public class PaymentCalculator{
  public static void main(String args[]){
//dates
    double heigth;
    double l;
    double width;
    double volume;
    double payment;
    double Total_to_pay;
  //read dates
    System.out.println("enter the measurements");
    System.out.println("heigth");
    Scanner H = new Scanner(System.in);
    heigth = H.nextInt();
      System.out.println("long");
    Scanner L = new Scanner(System.in);
    l = L.nextInt();
    System.out.println("width");
    Scanner W = new Scanner(System.in);
    width = W.nextInt();
    System.out.println("insert the cost per cubic meter of water");
    Scanner P = new Scanner(System.in);
    payment = P.nextInt();
//operations
    volume=(l*width)*heigth;
    Total_to_pay=volume*payment;
    System.out.println("filling the pool will cost you");
    System.out.println(" $"+Total_to_pay);
  }//end main
}//end PaymentCalculator
