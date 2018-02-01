/*******
*Diego perez Carrilo
*DaysInAMonth.java
*this program finds the number of days in a month
********/
import javax.swing.JOptionPane;
public class DaysInAMonth {
  public static void main(String[] args) {
    int numberOfDaysInAMonth=0;
    String monthOfYear;
    monthOfYear=JOptionPane.showInputDialog("enter your month");
    switch (monthOfYear) {
      case "january":
        numberOfDaysInAMonth=31;
        break;
        case "febrery":
        numberOfDaysInAMonth=28
        break;
        case "march":
          numberOfDaysInAMonth=30
          break;
      default:

    }
  }
}
