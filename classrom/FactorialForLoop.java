/**********
*Diego Perez Carrilo
*FactorialForLoop.java
*this program calculate the factorial
***********/
import javax.swing.JOptionPane;
public class FactorialForLoop{
  public static void main(String[] args){
    double factorial=1,number;
    number=Integer.parseInt(JOptionPane.showInputDialog("enter a number Integer"));
    for (int i = 1; i <= number; i++) {
      factorial*=i;
    }
    JOptionPane.showMessageDialog(null,"the factorial a number is \n"+factorial,"result of the factorial",JOptionPane.OK_OPTION);
  }
}
