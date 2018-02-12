/**********
*Diego Perez Carrilo
*SeriesOfTwo.java
*this program print series of from two to one hundred
**********/
import javax.swing.JOptionPane;
public class SeriesOfTwo{
public static void main(String[] args){
int counter=2;

do {
  JOptionPane.showMessageDialog(null,"my current value is"+counter,"TWO BY TWO",JOptionPane.INFORMATION_MESSAGE);
counter=counter+2;
} while (counter<100);
 }
}
