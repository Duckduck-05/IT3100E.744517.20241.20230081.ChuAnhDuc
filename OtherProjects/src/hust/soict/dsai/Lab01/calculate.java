// Exercise 2.2.5: calculate.java
import javax.swing.JOptionPane;
public class calculate {
	public static void main(String[] args) {
		String strNum1, strNum2;
		String strNotification = "";
		
		strNum1 = JOptionPane.showInputDialog(null,
				"Please input the first number: ","Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		double num1 = Double.parseDouble(strNum1);
		
		strNum2 = JOptionPane.showInputDialog(null,
					"Please input the second number: ","Input the second number",
					JOptionPane.INFORMATION_MESSAGE);
		double num2 = Double.parseDouble(strNum2); 
		
		strNotification += (num1 + " + " + num2 + " = " + (num1+num2) + "\n");
		strNotification += (num1 + " - " + num2 + " = " + (num1-num2) + "\n");
		strNotification += (num1 + " * " + num2 + " = " + (num1*num2) + "\n");
		
		if (num2 == 0) {
			strNotification += "Invalid division with 0";
		} else {
			strNotification += (num1 + " / " + num2 + " = " + (num1/num2) + "\n");
		}
		
		JOptionPane.showMessageDialog(null, strNotification,
					"Show result", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}