
import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, 
                    "Do you want to change to the first class ticket?", "Choose ticket", JOptionPane.YES_NO_OPTION);
        JOptionPane.showMessageDialog(null, "You're chosen: "
                        + (option == JOptionPane.YES_OPTION?"Yes":"No"));
        System.exit(0);
    }
}
