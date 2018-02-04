/*********
*Diego Perez Carrilo
*DressCostumePrice.java
*This program
*********/
import javax.swing.JOptionPane;

public class DressCostumePrice{
  public static void main(String [] args){
    double Ct,De,Pf;
    double discount1;
    double discoun2t;
    int limit=2501;
    Ct = Double.parseDouble(JOptionPane.showInputDialog("enter the cost of the dress suit"));
    if (Ct<limit) {
      discoun2t=0.08;//to change the discount percentage, change the 8 for the value that the discount will have if it is less than 2500
       De=Ct*discoun2t;
       Pf=Ct-De;
    }else {
      discount1 =0.15; //to change the discount percentage, change the value 15 for the discount value if it exceeds 2500
      De=Ct*discount1;
      Pf=Ct-De;
    }
    JOptionPane.showMessageDialog(null,"Product invoice:\n\n"+"Price origin of the product: "+Ct+"\nDiscount of the product: "+De+"\nTotal to pay: "+Pf);

  }//end main
}//end class
