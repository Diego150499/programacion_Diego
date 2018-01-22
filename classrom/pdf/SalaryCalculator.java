/******
*Diego Perez Carrillo
*CalaryCalculator
*this program calculates the employee's weekly salary based on hours worked
******/
import java.util.Scanner;
public class SalaryCalculator{
  public static void main(String args[]){
    //dates
    int hours;
    int monday, tuesday, wednesday, thursday, friday, saturday;
    int salary_hour;
    int salary;
    //read dates
    System.out.println("hours worked per day");
      System.out.println("hours worked on monday");
        Scanner M = new Scanner(System.in);
          monday = M.nextInt();
            System.out.println("hours worked on Tuesday");
              Scanner A = new Scanner(System.in);
                tuesday= A.nextInt();
                  System.out.println("hours worked on wednesday");
                    Scanner W = new Scanner(System.in);
                      wednesday = W.nextInt();
                        System.out.println("hours worked on thursday");
                          Scanner T = new Scanner(System.in);
                            thursday = T.nextInt();
                              System.out.println("hours worked on friday");
                                Scanner F = new Scanner(System.in);
                                  friday = F.nextInt();
                                    System.out.println("hours worked on saturday");
                                      Scanner S = new Scanner(System.in);
                                        saturday = S.nextInt();
      //operations
                                          hours=monday+tuesday+wednesday+thursday+friday+saturday;
                                            System.out.println("insert the hourly wage");
                                              Scanner SH = new Scanner(System.in);
                                                salary_hour = SH.nextInt();
                                                  salary=salary_hour*hours;
                                                    System.out.println("the employee's salary for the week will be:");
                                                      System.out.println(" $"+salary);
                                                      System.out.println("          ");
                                                        System.out.println("You're welcome, have an excellent weekend");
  }//end main
}//end SalaryCalculator
