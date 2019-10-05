package section3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
String nombre=JOptionPane.showInputDialog("Como te llamas?");
JOptionPane.showMessageDialog(null, "Hola "+nombre);
}
}
