/*************
*Diego peres carrilo
*AverageWhile.java
*this program caculate the scores of the students
***********/
import javax.swing.JOptionPane;
public class AverageWhile{
  public static void main(String[] args){
    int counter=1;
    int totalStudents=0;
    double score=0, totalscore=0, averageScore;
    totalStudents = Integer.parseInt(JOptionPane.showInputDialog("enter numbers of studens"));
    while (counter<=totalStudents) {
      score=Double.parseDouble(JOptionPane.showInputDialog("enter the score "+counter));
      totalscore += score;
      counter ++;
    }
    averageScore=totalscore / totalStudents;
    JOptionPane.showMessageDialog(null,"the average is: "+averageScore);
  }
}
