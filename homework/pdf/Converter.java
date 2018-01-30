/*******
*Diego Perez Carrillo
*Cnverter
*This program converts meters to inches
********/
import java.util.Scanner;
public class Converter{
  public static void main(String args[]){
//dates
    final double meters;
    final double pul=0.0254;
    final double inches;
//read dates
    System.out.println("enter the required fabric meters");
    Scanner M = new Scanner(System.in);
    meters = M.nextInt();
//operations
    inches=meters/pul;
    System.out.println("Total inches of fabric required");
    System.out.println(inches+" inches");
    System.out.println("|*_*|");
  }//end main
}//end Converter
