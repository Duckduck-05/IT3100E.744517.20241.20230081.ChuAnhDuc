import javax.swing.JOptionPane;
public class OperationApp {
    public static void main(String[] args) {
        String strNum1, strNum2;

        strNum1 = JOptionPane.showInputDialog(null,
                            "Please input the first number: ", "Input the first number",
                            JOptionPane.INFORMATION_MESSAGE);

        strNum2 = JOptionPane.showInputDialog(null,
                            "Please input the second number: ", "Input the second number",
                            JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        
        double sum = num1 + num2;
        double dif = Math.abs(num1-num2);
        double pro = num1*num2;

        JOptionPane.showMessageDialog(null, sum, "Show sum of two numbers", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, dif, "Show diffrence of two numbers", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, pro, "Show product of two numbers", JOptionPane.INFORMATION_MESSAGE);
        if (num2 != 0) {
            double div = num1 / num2;
            JOptionPane.showMessageDialog(null, div, "Show division of two numbers", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "ERROR!", "Show division of two numbers", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
