/*******
*Diego Perez Carrillo
*PrintPorchaseOrder.java
*this rogram calculates and print a purchase order amount
*******/
import java.util.Scanner;
public class PrintPorchaseOrder{
  public static void main(String args[]){
    String name;
    double price;
    int quantity;
    double total_cost;
    System.out.println("enter name of the client");
    Scanner S = new Scanner(System.in);
    name = S.nextline();
    System.out.println("eneter price of the product");
    Scanner A = new Scanner(System.in);
    price = A.nextdouble();
    System.out.println("enter quantity of the products");
    Scanner D = new Scanner(System.in);
    quantity = D.nextint();
    total_cost = (price*quantity);
    System.out.println(name+" will pay $"+total_cost);
  }
}
