/************
*Diego Perez Carrillo
*BMI.java
*this program calculates the Body Mass Index
************/
import javax.swing.JOptionPane;
public class BMI{
  public static void main(String[] args){
  float weigth, heigth;
   final double KILOGRAMS_PER_POUND=0.45159237;
   final double METRES_PER_INCH=0.0254;
  weigth = Float.parseFloat(JOptionPane.showInputDialog("enter your WEIGTH in pounds"));
  heigth = Float.parseFloat(JOptionPane.showInputDialog("enter your HEIGTH in inches"));
  double weigthInKilograms= weigth*KILOGRAMS_PER_POUND;
  double heigtInMeters= heigth*METRES_PER_INCH;
  double bmi = weigthInKilograms/(Math.pow(heigtInMeters,2));
  if (bmi<16) {
    JOptionPane.showMessageDialog(null,"you are seriously underweigth");
  }else if (bmi<18) {
    JOptionPane.showMessageDialog(null,"you are underweigth");
  }else if (bmi<24) {
    JOptionPane.showMessageDialog(null,"you are normal weigth");
  }else if (bmi<29) {
    JOptionPane.showMessageDialog(null,"you are overweigth");
  }else if (bmi<35) {
    JOptionPane.showMessageDialog(null,"you are seriously overheigth");
  }else {
    JOptionPane.showMessageDialog(null,"you are gravely overweigth");
   }
  }
}
