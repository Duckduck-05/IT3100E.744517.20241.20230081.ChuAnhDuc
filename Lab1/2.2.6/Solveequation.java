import javax.swing.JOptionPane;

public class Solveequation {
    public static void main(String[] args) {
        String messange = "Choose your equation: \n 1: first-degree equation \n 2: system of first-degree equation \n 3: second-degree equations";
        String option = JOptionPane.showInputDialog(null, messange, "Choose equation", JOptionPane.INFORMATION_MESSAGE);

        if (option.equals("1")) {
            String a = JOptionPane.showInputDialog(null, "first number", "first number", JOptionPane.INFORMATION_MESSAGE);
            String b = JOptionPane.showInputDialog(null, "second number", "second number", JOptionPane.INFORMATION_MESSAGE);
            
            Double aa = Double.parseDouble(a);
            Double bb = Double.parseDouble(b);

            if (aa == 0) {
                if (bb == 0) {
                    JOptionPane.showMessageDialog(null, "Infinite solutions", "Solution", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "No solution", "Solution", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Your solution is: " + (-bb/aa), "Solution", JOptionPane.INFORMATION_MESSAGE);
            }

        } else if (option.equals("2")) {
            String a11 = JOptionPane.showInputDialog(null, "first number in first equation", "first number", JOptionPane.INFORMATION_MESSAGE);
            String a12 = JOptionPane.showInputDialog(null, "second number in first equation", "second number", JOptionPane.INFORMATION_MESSAGE);
            String b1 = JOptionPane.showInputDialog(null, "first answer in first equation", "first answer", JOptionPane.INFORMATION_MESSAGE);
            String a21 = JOptionPane.showInputDialog(null, "first number in the second equation", "first number", JOptionPane.INFORMATION_MESSAGE);
            String a22 = JOptionPane.showInputDialog(null, "second number in the second equation", "second number", JOptionPane.INFORMATION_MESSAGE);
            String b2 = JOptionPane.showInputDialog(null, "second answer in the second equation", "second answer", JOptionPane.INFORMATION_MESSAGE);
            
            Double aa11 = Double.parseDouble(a11);
            Double aa12 = Double.parseDouble(a12);
            Double bb1 = Double.parseDouble(b1);
            Double aa21 = Double.parseDouble(a21);
            Double aa22 = Double.parseDouble(a22);
            Double bb2 = Double.parseDouble(b2);

            Double d = aa11*aa22-aa21*aa12;
            Double d1 = bb1*aa22 - bb2*aa12;
            Double d2 = aa11*bb2 - aa21*bb1;

            if (d == 0) {
                if (d1 == 0) {
                    JOptionPane.showMessageDialog(null, "Infinite solutions", "Solution", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "No solutions", "Solution", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "x= " + d1/d + " " + "y= " + d2/d , "Solution", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (option.equals("3")) {
            String a = JOptionPane.showInputDialog(null, "first number in the equation", "first number", JOptionPane.INFORMATION_MESSAGE);
            String b = JOptionPane.showInputDialog(null, "second number in the equation", "second number", JOptionPane.INFORMATION_MESSAGE);
            String c = JOptionPane.showInputDialog(null, "third number in the equation", "third number", JOptionPane.INFORMATION_MESSAGE);

            Double aa = Double.parseDouble(a);
            Double bb = Double.parseDouble(b);
            Double cc = Double.parseDouble(c);

            Double delta = bb * bb - 4 * aa * cc;

            if (delta < 0) {
                JOptionPane.showMessageDialog(null, "No solutions", "Solution", JOptionPane.INFORMATION_MESSAGE);
            } else if (delta == 0) {
                JOptionPane.showMessageDialog(null, "Unique solution: x=" + (-bb/(2*aa)), "Solution", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Two solutions: x1= " + ((-bb + delta)/(2*aa)) + " x2= " + ((-bb - delta)/(2*aa)), "Solution", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
