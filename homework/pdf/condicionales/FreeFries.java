/****
*Diego Perez Carrillo
*FreeFries.java
*This program reads points scored by home team and opposing team and determines If the fans win free
****/
import javax.swing.JOptionPane;
public class FreeFries{
public static void main(String[] args){
  int homePoints;
  int opponentPoints;
  homePoints = Integer.parseInt(JOptionPane.showInputDialog("enter home points"));
 opponentPoints = Integer.parseInt(JOptionPane.showInputDialog("eneter opponent Points"));
 if (homePoints > opponentPoints && homePoints >= 100) {
JOptionPane.showMessageDialog(null,"a free oreder of french fries for while tigers fans");
 }
 else {
   JOptionPane.showMessageDialog(null,"there will be no order of firtas potatoes for the fans");
 }
 }//ens main
}//end class
