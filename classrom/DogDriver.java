/*********
*Diego perez Carrilo
*DodDriver.java
*this program crates and uses dog class
********/
import javax.swing.JOptionPane;
public class DogDriver{
  public static void main(String[] args){
    Dog fido;
    fido=new Dog();
    fido.setColor("black");
    fido.setEyeColor("blue");
    JOptionPane.showMessageDialog(null,fido.getColor(),"characteristics of fido",JOptionPane.PLAIN_MESSAGE);
    JOptionPane.showMessageDialog(null,fido.getEyeColor(),"characteristics of fido",JOptionPane.PLAIN_MESSAGE);
    fido.eat();
    fido.bark();
    fido.sleep();
    //--------------------++

    Dog fufi;
    fufi = new Dog();

    fufi.setColor("Brown");
    fufi.setEyeColor("green");
    JOptionPane.showMessageDialog(null,fufi.getColor(),"characteristics of fufi",JOptionPane.PLAIN_MESSAGE);
    JOptionPane.showMessageDialog(null,fufi.getEyeColor(),"characteristics of fufi",JOptionPane.PLAIN_MESSAGE);
    fufi.eat();
    fufi.bark();
    fufi.sleep();
  }
}
