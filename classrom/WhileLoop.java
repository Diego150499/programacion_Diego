/*********
*Diego perez carrilo
*WhileLoop.java
*this program makes entries in a bridal registry
*********/
import javax.swing.JOptionPane;
public class WhileLoop{
  public static void main(String[] args){
    String registry="";
    char more;
    more = JOptionPane.showInputDialog("do you want to create a bridal registry(y/n)").charAt(0);
    while (more =='y') {
      registry += JOptionPane.showInputDialog("enter item");
      registry += JOptionPane.showInputDialog("enter store");
      registry += "\n";
        more = JOptionPane.showInputDialog("any more? (y/n)").charAt(0);
    }//end while
    if (!registry.equals("")) {
      JOptionPane.showMessageDialog(null,"\n Bridal registry \n "+registry);
    }//end if
  }//end main
}//end class
