/*******
*Diego Perez Carrilo
*Exam.java
*this program determines the intermediate value the number that is neither greater nor less
*******/
import javax.swing.JOptionPane;
public class Exam{
public static void main(String[] args){
double a;
double b;
double c;
a=Integer.parseInt(JOptionPane.showInputDialog(null,"enter the first number","0_0",JOptionPane.QUESTION_MESSAGE));
b=Integer.parseInt(JOptionPane.showInputDialog(null,"enter the second number","0_0",JOptionPane.QUESTION_MESSAGE));
c=Integer.parseInt(JOptionPane.showInputDialog(null,"enter the third number","0_0",JOptionPane.QUESTION_MESSAGE));
if (a>b && a<c || a<b && a>c) {
  JOptionPane.showMessageDialog(null,"the number intermediate is:\n"+""+a,"the first number entered",JOptionPane.INFORMATION_MESSAGE);
}else if (b>a && b<c || b<a && b>c) {
  JOptionPane.showMessageDialog(null,"the number intermediate is:\n"+"  "+b,"the second number entered",JOptionPane.INFORMATION_MESSAGE);
}else if (c>a && c<b || c<a && c>b) {
  JOptionPane.showMessageDialog(null,"the number intermediate is:\n"+"  "+c,"the third number entered",JOptionPane.INFORMATION_MESSAGE);
  }
 }
}
