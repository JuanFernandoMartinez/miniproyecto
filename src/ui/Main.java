package ui;
import javax.swing.*;
import model.*;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
	Student student = new Student("juan",14,5000);
	System.out.println(student.sayHey());
    sayHello();
    System.out.println(suma());
  }

  public static void sayHello(){
    JOptionPane.showMessageDialog(null,"hello world");
  }

  public static int suma(){
    return 5+4;
  }
}
