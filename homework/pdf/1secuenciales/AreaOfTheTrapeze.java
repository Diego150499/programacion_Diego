/*******
*Diego Perez Carrillo.
*AreaOfTheTrapeze.java
*This program calculate the area of the trapeze
*********/
import java.util.Scanner;
public class AreaOfTheTrapeze{
  public static void main(String arsg[]){
    System.out.println("    <HEIGTH-SMALL>  ");
    System.out.println("     /___________  B");
    System.out.println("    /|           | A");
    System.out.println("   / |           | S");
    System.out.println("  /__|___________| E");
    System.out.println("  <--HEIGTH-LONG->  ");
//dates
    int Base_Triangulo;
    int Altura_Larga;
    int Altura_Corta;
    int AreaTriangle;
    int AreaRectangle;
    int TotalArea;
    //read the data
      System.out.println("Insert the BASE");
    Scanner BT =new Scanner(System.in);
    Base_Triangulo = BT.nextInt();
      System.out.println("Insert the HEIGTH-LONG");
    Scanner AL =new Scanner(System.in);
    Altura_Larga = AL.nextInt();
      System.out.println("Insert the HEIGTH-SMALL");
    Scanner AC =new Scanner(System.in);
    Altura_Corta = AC.nextInt();
    AreaTriangle=(((Altura_Larga-Altura_Corta)*Base_Triangulo)/2);
    AreaRectangle=(Base_Triangulo*Altura_Corta);
    TotalArea=(AreaTriangle+AreaRectangle);
      System.out.println("the  total Area is: "+TotalArea);
  }//end main
}//end AreaOfTheTrapeze
