/*******
*Diego Perez Carrillo
*input.java
*ths program display a personal hello greeting
********/
import java.util.Scanner;
public class InputData{
  public static void main(String args[]){
    String name;
    System.out.println("enetr your name");
    Scanner usardata = new Scanner(System.in);
    name = usardata.nextLine();

    System.out.println("hello "+name);
  }//end main
}//end InputData.java
