// Exercise 2.2.6: EquationSolver.java
import javax.swing.JOptionPane;
public class EquationSolver {

  public static void main(String[] args) {    
    String[] options = { "Linear Equation", "System of first-degree equations with 1 vaiable", "Quadratic Equation" };
    var selection = JOptionPane.showOptionDialog(null, "Select one:", "Choose your option", 
                                                      0, 3, null, options, options[0]);
    if (selection == 0) {
      String strNum1, strNum2;
      String strNotification = "The equation have only 1 solution: x = ";
      
      strNum1 = JOptionPane.showInputDialog(null,
          "Please input a (ax + b = 0): ","Input a",
          JOptionPane.INFORMATION_MESSAGE);
      
      double num1 = Double.parseDouble(strNum1);

      strNum2 = JOptionPane.showInputDialog(null,
            "Please input b (ax + b = 0): ","Input b",
            JOptionPane.INFORMATION_MESSAGE);

      double num2 = Double.parseDouble(strNum2);

      if (num1 == 0) {
        if (num2 == 0) {
          strNotification = "The equation has infinitely many solutions";
        } else {
          strNotification = "The equation does not have any solution";
        }
      } else {
        strNotification += (-num2/num1);
      }

      JOptionPane.showMessageDialog(null, strNotification,
      "Show result", JOptionPane.INFORMATION_MESSAGE);
      System.exit(0);

    }

    if (selection == 1) { 
      String strA11, strA12, strA21, strA22, strB1, strB2;
      String strNotification = "";
      
      strA11 = JOptionPane.showInputDialog(null,
          "Please input a11 (a11 x1 + a12 x2 = b1; a21 x1 + a22 x2 = b2): ","Input a11",
          JOptionPane.INFORMATION_MESSAGE);
      
      double a11 = Double.parseDouble(strA11);

      strA12 = JOptionPane.showInputDialog(null,
            "Please input a12 (a11 x1 + a12 x2 = b1; a21 x1 + a22 x2 = b2): ","Input a12",
            JOptionPane.INFORMATION_MESSAGE);

      double a12 = Double.parseDouble(strA12);

      strB1 = JOptionPane.showInputDialog(null,
          "Please input b1 (a11 x1 + a12 x2 = b1; a21 x1 + a22 x2 = b2): ","Input b1",
          JOptionPane.INFORMATION_MESSAGE);

      double b1 = Double.parseDouble(strB1);
      
      strA21 = JOptionPane.showInputDialog(null,
          "Please input a21 (a11 x1 + a12 x2 = b1; a21 x1 + a22 x2 = b2): ","Input a21",
          JOptionPane.INFORMATION_MESSAGE);

      double a21 = Double.parseDouble(strA21);

      strA22 = JOptionPane.showInputDialog(null,
          "Please input a22 (a11 x1 + a12 x2 = b1; a21 x1 + a22 x2 = b2): ","Input a22",
          JOptionPane.INFORMATION_MESSAGE);

      double a22 = Double.parseDouble(strA22);

      strB2 = JOptionPane.showInputDialog(null,
          "Please input b2 (a11 x1 + a12 x2 = b1; a21 x1 + a22 x2 = b2): ","Input b2",
          JOptionPane.INFORMATION_MESSAGE);

      double b2 = Double.parseDouble(strB2);

      double D = a11*a22 - a12*a21;
      double D1 = b1*a22 - b2*a12;
      double D2 = a11*b2 - a21*b1;

      if (D != 0) {
        double x1 = D1/D;
        double x2 = D2/D;
        strNotification = "The system have unique solution: x1 = " + x1 + " , x2 = " + x2;
      } else {
        if (D1 != 0 && D2 != 0) {
          strNotification = "The system does not have any solutions";
        } else {
          strNotification = "The system have infinitely many solutions";
        }
      }
      JOptionPane.showMessageDialog(null, strNotification,
					"Show result", JOptionPane.INFORMATION_MESSAGE);
		  System.exit(0);
    }
    if (selection == 2) { 
      String strNum1, strNum2, strNum3;
      String strNotification = "";
      
      strNum1 = JOptionPane.showInputDialog(null,
          "Please input a (ax^2 + bx + c = 0): ","Input a",
          JOptionPane.INFORMATION_MESSAGE);
      
      double num1 = Double.parseDouble(strNum1);

      strNum2 = JOptionPane.showInputDialog(null,
            "Please input b (ax^2 + bx + c = 0): ","Input b",
            JOptionPane.INFORMATION_MESSAGE);

      double num2 = Double.parseDouble(strNum2);
      
      strNum3 = JOptionPane.showInputDialog(null,
          "Please input c (ax^2 + bx + c = 0): ","Input c",
          JOptionPane.INFORMATION_MESSAGE);

      double num3 = Double.parseDouble(strNum3);

      if (num1 == 0) {
        if (num2 == 0) {
          if (num3 == 0) {
            strNotification = "The equation has infinitely many solutions";
          } else {
            strNotification = "The equation does not have any solution";
          }
        } else {
          strNotification = "The equation have only 1 solution: x = " + (-num3/num2);
        }
      } else {
        double delta = num2*num2 - 4*num1*num3;
        if (delta < 0) {
          strNotification = "The equation does not have any real solutions";
        } else if (delta == 0) {
          strNotification = "The equation have only one solution: x1 = x2 = " + (-num2/(2*num1));
        } else {
          double x1 = (-num2 + Math.sqrt(delta)) / (2*num1);
          double x2 = (-num2 - Math.sqrt(delta)) / (2*num2);
          strNotification = "The equation have 2 solutions: x1 = " + x1 + ", x2 = " + x2;
        }
      }
      JOptionPane.showMessageDialog(null, strNotification,
					"Show result", JOptionPane.INFORMATION_MESSAGE);
		  System.exit(0);
    }
  }
}