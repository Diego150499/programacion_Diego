import javax.swing.*;

public class BMIOOPInplement{
  public static void main(String[] args){
    BMIOOP person;
    person=new BMIOOP();
    int opc;
    int i=0;

    do{
      menu=Integer.parseInt(JOptionPane.showInputDialog(null, "**Menu** \n1.-Set name \n2.-Set Age \n3.- Set weight \n4.-Set height \n5.-Calculate BMI \n6.-Evaluate BMI \n7.-Exit" , "Option"));
  switch(menu){
        case 1:
        person.setName(JOptionPane.showInputDialog("Enter the name"));
        break;
        case 2:
        person.setAge(Integer.parseInt(JOptionPane.showInputDialog("Enter the age")));
        break;
        case 3:
        person.setWeigth(Double.parseDouble(JOptionPane.showInputDialog("Enter your weight in pounds")));
        break;
        case 4:
        person.setHeigth(Double.parseDouble(JOptionPane.showInputDialog("Enter your height in inches")));
        break;
        case 5:
        person.getBMI();
        break;
        case 6:
        person.getStatus();
        break;
        case 7:
        i=i+1;
        JOptionPane.showMessageDialog(null, "Thank you11, GoodBye! :)", "Exit", JOptionPane.ERROR_MESSAGE);
        break;
        default:
        JOptionPane.showMessageDialog(null, "Error" , "Error" , JOptionPane.ERROR);
        break;
      }
    }
    while(i!=1);
  }
}