/*******
*Diego Perez Carrilo
*Dog.java
*ths class set the dog's propertiesand methods
********/
import javax.swing.*;
public class Dog{
  //a Dog's propertives- variables
private String color;
private String eyecolor;
private double height;
private double length;
private double weight;


/* metodo tipo de dato GET=obtener metodo void SET=etsablecer*/
//Dog's methods-actions

//sets the dog's color
public void setColor(String dogColor){
  color = dogColor;
}
//gets the dog's color
public String getColor(){
  return color;
}


public void setEyeColor(String dogEyeColor){
  eyecolor = dogEyeColor;
}
public String getEyeColor(){
  return eyecolor;
}


public void setHeight(Double dogHeight){
  height = dogHeight;
}
public Double getHeight(){
  return height;
}


public void setLength(Double dogLength){
  length = dogLength;
}
public Double getLenght(){
  return length;
}


public void setWeigth(Double dogweigth){
  weight=dogweigth;
}
public Double getWeigth(){
 return weight;
}


//metodos
public void sit(){
  JOptionPane.showMessageDialog(null,"the dog sat","Dog",JOptionPane.INFORMATION_MESSAGE);
 }
 public void bark(){
   JOptionPane.showMessageDialog(null,"the dog is barking","Dog",JOptionPane.INFORMATION_MESSAGE);
 }
 public void layDown(){
   JOptionPane.showMessageDialog(null,"the dog is laid down","Dog",JOptionPane.INFORMATION_MESSAGE);
 }
 public void sleep(){
   JOptionPane.showMessageDialog(null,"the dog is sleeping","Dog",JOptionPane.INFORMATION_MESSAGE);
 }
 public void eat(){
   JOptionPane.showMessageDialog(null,"the dog is eating","Dog",JOptionPane.INFORMATION_MESSAGE);
 }
}
