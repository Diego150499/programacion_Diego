/********
*Diego Perez Carrillo
*IfControlStatement.java
*this programan checks for period at the end of line
********/
import javax.swing.JOptionPane;
public class IfControlStatement{
  public static void main(String args[]){
    String sentence;
    int lastChartPosition;
    sentence = JOptionPane.showInputDialog("enter your sentence");
    lastChartPosition = sentence.length() -1;
    if (sentence.charAt(lastChartPosition) != '.') {
      JOptionPane.showMessageDialog(null,"invalid Entry - your sentence needs a period");
    }//end if
  }//end main
}//end class
