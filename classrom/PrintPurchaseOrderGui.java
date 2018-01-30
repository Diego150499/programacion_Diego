/********
*Diego Perez Carrillo
*PrintPurchaseOrderGui.java
*this program calculate and prints a purchase order report
********/
import javax.swing.JOptionPane;
public class PrintPurchaseOrderGui{
  public static void main(String args[]){
    String itemName;//name of purchase items
    double price;//price of purchase items
    int quantity;//number of items purchase

    itemName = JOptionPane.showInputDialog("enter name of purchase item");
    price =  Double.parseDouble(JOptionPane.showInputDialog("enter price of one item"));
    quantity = Integer.parseInt(JOptionPane.showInputDialog("enter quantity"));
    JOptionPane.showMessageDialog(null,"PURCHASE ORDER :\n\n"+"Item "+itemName+"\nPrice "+price+"\nQuantity"+quantity+"\nTotal $"+price*quantity);
  }//end main
}//end PrintPurchaseOrderGui
