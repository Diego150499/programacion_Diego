/*******
*Diego perez Carrilo
*DaysInAMonth.java
*this program finds the number of days in a month
********/
import javax.swing.JOptionPane;
public class DaysInMonth {
  public static void main(String[] args) {

    int numberOfDaysInAMonth=0;
    String monthOfYear;

    monthOfYear=JOptionPane.showInputDialog("enter your month(ALL NAME IN LOWERCASE)");
    switch (monthOfYear) {
      case "january":
        numberOfDaysInAMonth=31;
        break;
        case "febrery":
        numberOfDaysInAMonth=28;
        break;
        case "march":
          numberOfDaysInAMonth=31;
          break;
          case "april":
            numberOfDaysInAMonth=30;
            break;
            case "may":
              numberOfDaysInAMonth=31;
              break;
              case "june":
                numberOfDaysInAMonth=30;
                break;
                case "july":
                  numberOfDaysInAMonth=31;
                  break;
                  case "august":
                    numberOfDaysInAMonth=31;
                    break;
                    case "september":
                      numberOfDaysInAMonth=30;
                      break;
                      case "october":
                        numberOfDaysInAMonth=31;
                        break;
                        case "novenber":
                          numberOfDaysInAMonth=30;
                          break;
                          case "december":
                            numberOfDaysInAMonth=31;
                            break;
      default:
      JOptionPane.showMessageDialog(null,"badly entered month");
      numberOfDaysInAMonth=0;

    }
    JOptionPane.showMessageDialog(null,"the number of days in the month selected are: "+numberOfDaysInAMonth+" days");
  }
}
