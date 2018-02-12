/**********
*Diego perez Carrilo
*FLoorSpacesDoWhile.java
*
*********/
import javax.swing.JOptionPane;
public class FLoorSpacesDoWhile{
public static void main(String[] args){
double length, width;//room dimencions
double floorSpace;//house´s total FLoor Space
char response;//user´s response
do {
  length=Double.parseDouble(JOptionPane.showInputDialog("enter the room length"));
  width=Double.parseDouble(JOptionPane.showInputDialog("enter the room width"));
  floorSpace+=length*width;
  response = JOptionPane.showInputDialog("any more room?")charAt(0);
} while (response=='y' || response='Y');
JOptionPane.showMessageDialog(null,"the total floor Space is: "+floorSpace,"hello",JOptionPane.WARNING_MESSAGE);
 }
}
