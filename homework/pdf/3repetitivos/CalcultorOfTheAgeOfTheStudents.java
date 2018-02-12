/*********
*Diego Perez Carrillo
*CalcultorOfTheAgeOfTheStudents.java
*This program calculate The Age Of The Students
*********/
import javax.swing.JOptionPane;
public class CalcultorOfTheAgeOfTheStudents{
  public static void main(String[] args){
  int counter=1,age=0,numberofthetudents=0;
  int ageprom=0,sum=0;
  numberofthetudents = Integer.parseInt(JOptionPane.showInputDialog("enter a quantiti students are"));
    while (counter<=numberofthetudents) {
      age = Integer.parseInt(JOptionPane.showInputDialog("enter age:"+counter));
      sum=age+sum;
      counter ++;
    }
    ageprom=sum/numberofthetudents;
    JOptionPane.showMessageDialog(null,"the age promedium is: "+ageprom);
  }
}
