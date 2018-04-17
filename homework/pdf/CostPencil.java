import javax.swing.JOptionPane;
public class CostPencil{
  public static void main(String[]args){
    int x;
    double pag;

    x = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of pencil"));

    if (x >= 1000) {
      pag = (x*0.85);
      JOptionPane.showMessageDialog(null,"Pass 1000 pencils "+" The price of the pencils are of "+ pag);
    }else if (x < 1000) {
        pag = (x*0.90);
        JOptionPane.showMessageDialog(null,"The quantity is less than 1000 "+" The price of the pencils are of "+ pag);
    }
  }
}